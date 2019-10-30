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
		this.addMouseListener(new OyenteMouseCelda(this));
	}

	public class OyenteMouseCelda implements MouseListener{
		JLabel celda;
		public OyenteMouseCelda(JLabel celda) {
			this.celda=celda;
		}
		public void mouseClicked(MouseEvent e) {
		}
		public void mouseEntered(MouseEvent e) {
			celda.setIcon(new ImageIcon("./src/Sprites/Mapa/celda4.png"));
		}
		public void mouseExited(MouseEvent e) {
			celda.setIcon(new ImageIcon("./src/Sprites/Mapa/celda2.png"));
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			int x=celda.getX()/96;
			int y=celda.getY()/96;
			Tienda.getTienda().seleccionar(Mapa.getMapa().getGrilla()[x][y]);}
	}
}
