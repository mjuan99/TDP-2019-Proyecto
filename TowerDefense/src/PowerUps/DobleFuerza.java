package PowerUps;

import Juego.Celda;
import Juego.Mapa;
import Visitor.Visitor;

public class DobleFuerza extends MagiaTemporal {
	protected int indice=1;
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/Fuerza.png";
	
	public DobleFuerza( Celda celda) {
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
