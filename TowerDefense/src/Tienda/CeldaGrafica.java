package Tienda;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Juego.Mapa;

@SuppressWarnings("serial")
public class CeldaGrafica extends JLabel{
	public CeldaGrafica(ImageIcon i) {
		super(i);
		this.addMouseListener(new OyenteMouseCelda());
	}

	private class OyenteMouseCelda implements MouseListener{
		protected boolean adentro;
		public OyenteMouseCelda() {
			adentro=false;
		}
		public void mouseClicked(MouseEvent e) {
		}
		public void mouseEntered(MouseEvent e) {
			adentro=true;
			setIcon(new ImageIcon("./src/Sprites/Mapa/celda4.png"));
		}
		public void mouseExited(MouseEvent e) {
			adentro=false;
			setIcon(new ImageIcon("./src/Sprites/Mapa/celda2.png"));
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			if(adentro) {
				int x=getX()/96;
				int y=getY()/96;
				Tienda.getTienda().seleccionar(Mapa.getMapa().getGrilla()[x][y]);
			}
		}
	}
}
