package PowerUpsRecolectable;

import Juego.Celda;
import Visitor.Visitor;

public class BombaRecolectable extends ObjetoPreciosoRecolectable {
	protected int indice=2;
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/Bomba.png";

	public BombaRecolectable(Celda celda) {
		super( celda, vidaBase, tam, imagen);
		// TODO Auto-generated constructor stub
	}
	
	
	public void accept(Visitor v) {
		v.visit(this);
	}

}
