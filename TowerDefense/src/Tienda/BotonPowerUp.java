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
	JTextArea descripcion;
	PowerUpEfecto miPowerUp;
	public BotonPowerUp(PowerUpEfecto p) {
		super(new ImageIcon(p.getImagen()));
		miPowerUp=p;
		descripcion=new JTextArea(p.getDescripcion());
		MouseListener mouseL=new OyenteBotonObjeto();
		this.setBackground(Color.WHITE);;
		this.setBorder(null);
		this.addMouseListener(mouseL);
		this.add(descripcion);
		this.setEnabled(false);
		descripcion.setVisible(false);
		descripcion.setEditable(false);
		descripcion.addMouseListener(mouseL);
	}
	
	private class OyenteBotonObjeto implements MouseListener{
		public OyenteBotonObjeto() {}
		@Override
		public void mouseClicked(MouseEvent arg0) {
			if(isEnabled()) {
				seleccionar();
				miPowerUp.usar();
			}
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			descripcion.setVisible(true);
			descripcion.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			descripcion.setVisible(false);
		}

		@Override
		public void mousePressed(MouseEvent arg0) {}

		@Override
		public void mouseReleased(MouseEvent arg0) {}
		
	}
}
