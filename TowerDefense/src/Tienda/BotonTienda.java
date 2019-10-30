package Tienda;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import Juego.GUI;

@SuppressWarnings("serial")
public class BotonTienda extends JButton {
	protected BotonTienda(ImageIcon i) {
		super(i);
	}
	public BotonTienda(String s,ActionListener a) {
		super(s);
		this.addActionListener(a);
		this.addMouseListener(new OyenteBotonTienda(this));
	}
	public void seleccionar() {
		GUI.getGUI().deseleccionarBotones();
		this.setBorder(BorderFactory.createLineBorder(Color.black));
	}
	public void deseleccionar() {
		this.setBorder(null);
	}
}
class OyenteBotonTienda implements MouseListener{
	BotonTienda boton;
	public OyenteBotonTienda(BotonTienda boton) {
		this.boton=boton;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
