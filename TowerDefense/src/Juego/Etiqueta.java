package Juego;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Tienda.Tienda;
import Visitor.VisitorClick;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Etiqueta extends JLabel{
	protected Elemento elemento;
	public Etiqueta(Elemento e) {
		super(new ImageIcon(e.getRutaImagen()));
		elemento=e;
		this.addMouseListener(new OyenteClick());
	}

	public class OyenteClick implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			elemento.accept(new VisitorClick());
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
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
}

