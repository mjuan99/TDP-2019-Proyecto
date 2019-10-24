package PowerUps;

import Juego.Celda;

public class TorreAleatoria extends ObjetoPrecioso {
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/TorreAleatoria.png";
	
	public TorreAleatoria( Celda celda) {
		super(celda, vidaBase, tam, imagen);
		// TODO Auto-generated constructor stub
	}

}
