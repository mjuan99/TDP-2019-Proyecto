package Tienda;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

import Personajes.Torre;

@SuppressWarnings("serial")
public class BotonTorre extends BotonTienda {
	protected JTextArea descripcion;
	protected Torre torre;
	public BotonTorre(Torre torre) {
		super(new ImageIcon(torre.getMiniatura()));
		MouseListener mouseL=new OyenteBotonTorre();
		this.torre=torre;
		this.setBackground(Color.WHITE);
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
	
	private class OyenteBotonTorre implements MouseListener{
		protected boolean adentro;
		public OyenteBotonTorre() {
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
				Tienda.getTienda().comprar(torre.nueva());
				seleccionar();
			}}
		
	}
}
