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
		this.addMouseListener(new OyenteBotonTienda());
	}
	public void seleccionar() {
		GUI.getGUI().deseleccionarBotones();
		this.setBorder(BorderFactory.createLineBorder(Color.black));
	}
	public void deseleccionar() {
		this.setBorder(null);
	}
	
	private class OyenteBotonTienda implements MouseListener{
		public OyenteBotonTienda() {}
		@Override
		public void mouseClicked(MouseEvent e) {
			//do nothing
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			setCursor(new Cursor(Cursor.HAND_CURSOR));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			//do nothing
		}

		@Override
		public void mousePressed(MouseEvent e) {
			//do nothing
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			//do nothing
		}
		
	}
}
