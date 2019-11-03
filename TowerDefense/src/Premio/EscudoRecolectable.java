package Premio;

import Juego.Celda;
import Visitor.Visitor;

public class EscudoRecolectable extends ObjetoPreciosoRecolectable {
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/Escudo.png";
	
	public EscudoRecolectable( Celda celda) {
		super(celda, tam, imagen);
	}
	
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
}
