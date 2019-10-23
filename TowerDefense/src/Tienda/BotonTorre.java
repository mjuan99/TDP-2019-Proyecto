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

import Tienda.BotonTienda;
import Tienda.Tienda;
import Tienda.TorreTienda;

public class BotonTorre extends BotonTienda {
	JTextArea descripcion;
	TorreTienda torre;
	public BotonTorre(TorreTienda torre) {
		super(new ImageIcon(torre.getImagen()));
		MouseListener mouseL=new OyenteBotonTorre(this);
		this.torre=torre;
		this.setBackground(Color.WHITE);;
		this.setBorder(null);
		this.addMouseListener(mouseL);
		descripcion=new JTextArea((torre.descripcion()));
		this.add(descripcion);
		descripcion.setVisible(false);
		descripcion.setEditable(false);
		descripcion.addMouseListener(mouseL);
	}
	public TorreTienda getTorreTienda() {
		return torre;
	}
	public JTextArea getTexto() {
		return descripcion;
	}
}
class OyenteBotonTorre implements MouseListener{
	BotonTorre boton;
	public OyenteBotonTorre(BotonTorre b) {
		boton=b;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		Tienda.getTienda().comprar(boton.getTorreTienda().getTorre());
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
		boton.setIcon(new ImageIcon(boton.getTorreTienda().getImagen()));
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
	
}
