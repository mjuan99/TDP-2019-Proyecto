package PowerUps;

import Juego.Celda;
import Juego.Mapa;

public class Bomba extends ObjetoPrecioso {
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/voltorb.png";

	public Bomba(Celda celda) {
		super( celda, vidaBase, tam, imagen);
		// TODO Auto-generated constructor stub
	}

}
