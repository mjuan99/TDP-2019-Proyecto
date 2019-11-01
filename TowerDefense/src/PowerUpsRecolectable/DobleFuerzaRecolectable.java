package PowerUpsRecolectable;

import Juego.Celda;
import Visitor.Visitor;

public class DobleFuerzaRecolectable extends MagiaTemporalRecolectable {
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/Fuerza.png";
	
	public DobleFuerzaRecolectable( Celda celda) {
		super(celda, tam, imagen);
	}	
	
	public void accept(Visitor v) {
		v.visit(this);
	}

}
