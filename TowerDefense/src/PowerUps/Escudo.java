package PowerUps;

import Juego.Celda;

public class Escudo extends ObjetoPrecioso {
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/Escudo.png";
	
	public Escudo( Celda celda) {
		super(celda, vidaBase, tam, imagen);
		// TODO Auto-generated constructor stub
	}
	
}
