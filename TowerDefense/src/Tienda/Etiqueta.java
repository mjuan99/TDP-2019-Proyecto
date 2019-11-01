package Tienda;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Visitor.VisitorClick;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Juego.Elemento;

@SuppressWarnings("serial")
public class Etiqueta extends JLabel{
	protected Elemento elemento;
	public Etiqueta(Elemento e) {
		super(new ImageIcon(e.getRutaImagen()));
		elemento=e;
		this.addMouseListener(new OyenteClick());
	}

	private class OyenteClick implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			elemento.accept(new VisitorClick());
		}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) {}

		@Override
		public void mouseReleased(MouseEvent e) {}
		
	}
}

