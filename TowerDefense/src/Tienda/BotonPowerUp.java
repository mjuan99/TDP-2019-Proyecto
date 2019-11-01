package Tienda;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;

import PowerUpsEfecto.PowerUpEfecto;

@SuppressWarnings("serial")
public class BotonPowerUp extends BotonTienda {
	ImageIcon imagen;
	JTextArea descripcion;
	PowerUpEfecto miPowerUp;
	public BotonPowerUp(PowerUpEfecto p) {
		super(new ImageIcon(p.getImagen()));
		miPowerUp=p;
		imagen=new ImageIcon(p.getImagen());
		descripcion=new JTextArea(p.getDescripcion());
		MouseListener mouseL=new OyenteBotonObjeto(this);
		this.setBackground(Color.WHITE);;
		this.setBorder(null);
		this.addMouseListener(mouseL);
		this.add(descripcion);
		this.setEnabled(false);
		descripcion.setVisible(false);
		descripcion.setEditable(false);
		descripcion.addMouseListener(mouseL);
	}
	public JTextArea getTexto() {
		return descripcion;
	}
	public ImageIcon getImagen() {
		return imagen;
	}
	public PowerUpEfecto getPowerUp() {
		return miPowerUp;
	}
}
class OyenteBotonObjeto implements MouseListener{
	BotonPowerUp boton;
	public OyenteBotonObjeto(BotonPowerUp b) {
		boton=b;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(boton.isEnabled()) {
			boton.seleccionar();
			boton.getPowerUp().usar();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		boton.setIcon(null);
		boton.getTexto().setVisible(true);
		boton.getTexto().setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		boton.getTexto().setVisible(false);
		boton.setIcon(boton.getImagen());
	}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}
	
}
