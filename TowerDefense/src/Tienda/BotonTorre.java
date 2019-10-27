package Tienda;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import Personajes.Torre;
import Tienda.BotonTienda;
import Tienda.Tienda;

public class BotonTorre extends BotonTienda {
	JTextArea descripcion;
	Torre torre;
	ImageIcon imagen;
	public BotonTorre(Torre torre) {
		super(new ImageIcon(torre.getMiniatura()));
		MouseListener mouseL=new OyenteBotonTorre(this);
		this.torre=torre;
		imagen=new ImageIcon(torre.getMiniatura());
		this.setBackground(Color.WHITE);;
		this.setBorder(null);
		this.addMouseListener(mouseL);
		descripcion=new JTextArea((torre.descripcion()));
		this.add(descripcion);
		descripcion.setVisible(false);
		descripcion.setEditable(false);
		descripcion.addMouseListener(mouseL);
	}
	public Torre getTorre() {
		return torre.nueva();
	}
	public JTextArea getTexto() {
		return descripcion;
	}
	public ImageIcon getImagen() {
		return imagen;
	}
}
class OyenteBotonTorre implements MouseListener{
	BotonTorre boton;
	public OyenteBotonTorre(BotonTorre b) {
		boton=b;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		Tienda.getTienda().comprar(boton.getTorre());
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
