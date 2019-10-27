package PowerUpsRecolectable;

import Juego.Celda;
import Visitor.Visitor;

public class CongelarRecolectable extends MagiaTemporalRecolectable {
	protected int indice=0;
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/Congelar.png";
	
	public CongelarRecolectable( Celda celda) {
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
