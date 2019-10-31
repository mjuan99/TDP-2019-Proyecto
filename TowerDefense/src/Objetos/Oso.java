package Objetos;

import Juego.Celda;
import Visitor.Visitor;

public class Oso extends ObstaculoVida {
	protected static int vidaBase=1000;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Obstaculos/Oso.gif";
	protected static String nombre="Oso";
	protected static String mini="";
	protected static int precio=50;

	public Oso(Celda celda) {
		super(celda, vidaBase,tam, imagen,mini,nombre,precio);
		// TODO Auto-generated constructor stub
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}

	public void accept() {
		visitor.visit(this);
	}


}
