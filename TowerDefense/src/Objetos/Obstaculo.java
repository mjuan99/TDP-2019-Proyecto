package Objetos;

import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;
import Visitor.Visitor;

public abstract class Obstaculo extends Elemento {
	
	protected Obstaculo(Mapa mapa, Celda celda, int vidaMax, String rutaImagen) {
		super(mapa, celda, vidaMax, rutaImagen);
		// TODO Auto-generated constructor stub
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}

	public void accept() {
		visitor.visit(this);
	}
	
}
