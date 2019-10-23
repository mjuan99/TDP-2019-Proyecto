package PowerUps;

import Juego.Celda;
import Juego.Mapa;

public class DobleFuerza extends MagiaTemporal {
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/staryu.png";
	
	public DobleFuerza(Mapa mapa, Celda celda) {
		super(mapa, celda, vidaBase, tam, imagen);
		// TODO Auto-generated constructor stub
	}

}
