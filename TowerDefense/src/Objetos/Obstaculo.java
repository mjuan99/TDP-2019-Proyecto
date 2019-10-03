package Objetos;

import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;

public abstract class Obstaculo extends Elemento {
	
	protected Obstaculo(Mapa mapa, Celda celda, int vidaMax, String rutaImagen) {
		super(mapa, celda, vidaMax, rutaImagen);
		// TODO Auto-generated constructor stub
	}

	public void accept() {
		visitor.visit(this);
	}
	
}
