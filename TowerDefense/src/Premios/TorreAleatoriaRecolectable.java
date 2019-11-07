package Premios;

import Juego.Celda;
import Visitor.Visitor;

public class TorreAleatoriaRecolectable extends ObjetoPreciosoRecolectable {
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/TorreAleatoria.png";
	
	public TorreAleatoriaRecolectable( Celda celda) {
		super(celda, tam, imagen);
	}
	
	
	public void accept(Visitor v) {
		v.visit(this);
	}

}
