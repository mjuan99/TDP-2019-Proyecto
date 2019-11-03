package Premio;

import Juego.Celda;
import Visitor.Visitor;

public class CongelarRecolectable extends MagiaTemporalRecolectable {
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/Congelar.png";
	
	public CongelarRecolectable( Celda celda) {
		super(celda, tam, imagen);
	}
	
	
	public void accept(Visitor v) {
		v.visit(this);
	}
}
