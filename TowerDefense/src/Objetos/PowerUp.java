package Objetos;

import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;

public abstract class PowerUp extends Elemento {

	protected PowerUp(Mapa mapa, Celda celda, int vidaMax, String rutaImagen) {
		super(mapa, celda, vidaMax, rutaImagen);
		// TODO Auto-generated constructor stub
	}

	public void accept() {
		visitor.visit(this);
	}
}
