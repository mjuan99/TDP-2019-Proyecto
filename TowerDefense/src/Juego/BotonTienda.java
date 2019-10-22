package Juego;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import Tienda.Tienda;
import Tienda.TorreTienda;

public class BotonTienda extends JButton {
	TorreTienda torre;
	public BotonTienda(TorreTienda torre) {
		super(new ImageIcon(torre.getImagen()));
		this.torre=torre;
		this.setBackground(Color.WHITE);;
		this.setBorder(null);
		this.addMouseListener(new OyenteBoton(this));
	}
	public TorreTienda getTorreTienda() {
		return torre;
	}
}
class OyenteBoton implements MouseListener{
	BotonTienda boton;
	public OyenteBoton(BotonTienda b) {
		boton=b;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		Tienda.getTienda().comprar(boton.getTorreTienda().getTorre());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		boton.setIcon(null);
		boton.setText(boton.getTorreTienda().descripcion());
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		boton.setText("");
		boton.setIcon(new ImageIcon(boton.getTorreTienda().getImagen()));
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
	
}
