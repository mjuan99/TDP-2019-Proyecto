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
		protected boolean adentro;
		
		public OyenteClick() {
			adentro=false;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			//do nothing
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			adentro=true;
		}

		@Override
		public void mouseExited(MouseEvent e) {
			adentro=false;
		}

		@Override
		public void mousePressed(MouseEvent e) {
			//do nothing
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if(adentro)
				elemento.accept(new VisitorClick());
		}
		
	}
}

