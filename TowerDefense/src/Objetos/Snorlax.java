package Objetos;

import Juego.Celda;
import Juego.Mapa;
import Visitor.Visitor;

public class Snorlax extends ObstaculoVida {
	protected static int vidaBase=1000;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Obstaculos/snorlax.png";

	public Snorlax(Mapa mapa, Celda celda) {
		super(mapa, celda, vidaBase,tam, imagen);
		// TODO Auto-generated constructor stub
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}

	public void accept() {
		visitor.visit(this);
	}

}
