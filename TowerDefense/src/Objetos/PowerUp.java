package Objetos;

import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;
import Visitor.Visitor;

public abstract class PowerUp extends Elemento {

	protected PowerUp(Celda celda, int vidaMax,int tamano, String rutaImagen) {
		super(celda, vidaMax,tamano, rutaImagen);
		// TODO Auto-generated constructor stub
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}

	public void accept() {
		visitor.visit(this);
	}
}
