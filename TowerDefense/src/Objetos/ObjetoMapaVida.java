package Objetos;

import Juego.Celda;
import Visitor.Visitor;

public abstract class ObjetoMapaVida extends ObjetoMapa {

	protected ObjetoMapaVida(Celda celda, int vidaMax,int tamano, String rutaImagen) {
		super(celda, vidaMax,tamano, rutaImagen);
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void actuar() {}

}
