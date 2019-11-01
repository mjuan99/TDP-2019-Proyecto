package PowerUpsRecolectable;

import Juego.Celda;
import Visitor.Visitor;

public class BombaRecolectable extends ObjetoPreciosoRecolectable {
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/Bomba.png";

	public BombaRecolectable(Celda celda) {
		super( celda, tam, imagen);
	}
	
	
	public void accept(Visitor v) {
		v.visit(this);
	}

}
