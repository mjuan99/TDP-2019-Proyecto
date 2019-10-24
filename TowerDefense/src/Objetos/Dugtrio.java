package Objetos;

import Juego.Celda;
import Juego.Mapa;
import Visitor.Visitor;

public class Dugtrio extends ObstaculoTiempo {
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Obstaculos/dugtrio.png";

	public Dugtrio(Celda celda) {
		super(celda, vidaBase,tam , imagen);
		// TODO Auto-generated constructor stub
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}

	public void accept() {
		visitor.visit(this);
	}
}
