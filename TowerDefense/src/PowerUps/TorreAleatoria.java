package PowerUps;

import Juego.Celda;
import Visitor.Visitor;

public class TorreAleatoria extends ObjetoPrecioso {
	protected int indice=4;
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/TorreAleatoria.png";
	
	public TorreAleatoria( Celda celda) {
		super(celda, vidaBase, tam, imagen);
		// TODO Auto-generated constructor stub
	}
	
	public int getIndice() {
		return indice;
	}
	
	
	public void accept(Visitor v) {
		v.visit(this);
	}

	public void accept() {
		visitor.visit(this);
	}

}
