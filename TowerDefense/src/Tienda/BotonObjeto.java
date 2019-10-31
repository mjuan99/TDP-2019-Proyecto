package Tienda;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;

import Objetos.Obstaculo;
import Personajes.Torre;


public class BotonObjeto extends BotonTienda {
	JTextArea descripcion;
	Obstaculo obstaculo;
	ImageIcon imagen;
	public BotonObjeto(Obstaculo o) {
		super(new ImageIcon(o.getMiniatura()));
		MouseListener mouseL=new OyenteBotonObstaculo(this);
		obstaculo=o;
		imagen=new ImageIcon(obstaculo.getMiniatura());
		this.setBackground(Color.WHITE);;
		this.setBorder(null);
		this.addMouseListener(mouseL);
		descripcion=new JTextArea((obstaculo.descripcion()));
		this.add(descripcion);
		descripcion.setVisible(false);
		descripcion.setEditable(false);
		descripcion.addMouseListener(mouseL);
	}
	public Obstaculo getObstaculo() {
		return obstaculo/*.nuevo()*/;
	}
	public JTextArea getTexto() {
		return descripcion;
	}
	public ImageIcon getImagen() {
		return imagen;
	}
}
class OyenteBotonObstaculo implements MouseListener{
	BotonObjeto boton;
	public OyenteBotonObstaculo(BotonObjeto b) {
		boton=b;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(boton.isEnabled()) {
			Tienda.getTienda().comprar(boton.getObstaculo());
			boton.seleccionar();
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
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
}
