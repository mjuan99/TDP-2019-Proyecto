package PowerUps;


import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;
import Visitor.Visitor;

public abstract class PowerUp extends Elemento {
	


	protected PowerUp(Mapa mapa, Celda celda, int vidaMax,int tamano, String rutaImagen) {
		super(mapa, celda, vidaMax,tamano, rutaImagen);

		// TODO Auto-generated constructor stub
	}
	
	
	public void accept(Visitor v) {
		v.visit(this);
	}

	public void accept() {
		visitor.visit(this);
	}
}
