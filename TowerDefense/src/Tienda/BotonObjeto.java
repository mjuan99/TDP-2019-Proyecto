package Tienda;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class BotonObjeto extends BotonTienda {
	ImageIcon imagen;
	JTextArea descripcion;
	public BotonObjeto(ImageIcon i,String s) {
		super(i);
		imagen=i;
		descripcion=new JTextArea(s);
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
}
class OyenteBotonObjeto implements MouseListener{
	BotonObjeto boton;
	public OyenteBotonObjeto(BotonObjeto b) {
		boton=b;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		boton.seleccionar();
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
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
	
}
