package PowerUps;

import Juego.Celda;
import Juego.Mapa;

public class DobleFuerza extends MagiaTemporal {
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/Fuerza.png";
	
	public DobleFuerza( Celda celda) {
		super(celda, vidaBase, tam, imagen);
		// TODO Auto-generated constructor stub
	}

}
