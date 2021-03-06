package Tienda;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;

import Objetos.ObjetoJugador;


@SuppressWarnings("serial")
public class BotonObjeto extends BotonTienda {
	protected JTextArea descripcion;
	protected ObjetoJugador obstaculo;
	public BotonObjeto(ObjetoJugador o) {
		super(new ImageIcon(o.getMiniatura()));
		MouseListener mouseL=new OyenteBotonObstaculo();
		obstaculo=o;
		this.setBackground(Color.WHITE);
		this.setBorder(null);
		this.addMouseListener(mouseL);
		descripcion=new JTextArea((obstaculo.descripcion()));
		this.add(descripcion);
		descripcion.setVisible(false);
		descripcion.setEditable(false);
		descripcion.addMouseListener(mouseL);
	}
	public ObjetoJugador getObstaculo() {
		return obstaculo.nuevo();
	}
	
	private class OyenteBotonObstaculo implements MouseListener{
		protected boolean adentro;
		public OyenteBotonObstaculo() {
			adentro=false;
		}
		@Override
		public void mouseClicked(MouseEvent arg0) {
			//do nothing
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			adentro=true;
			descripcion.setVisible(true);
			descripcion.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			adentro=false;
			descripcion.setVisible(false);
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			//do nothing
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			if(adentro&&isEnabled()) {
				Tienda.getTienda().comprar(obstaculo.nuevo());
				seleccionar();
			}
		}
	}
}
