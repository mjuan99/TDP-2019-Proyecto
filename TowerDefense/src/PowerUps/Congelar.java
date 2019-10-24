package PowerUps;

import Juego.Celda;

public class Congelar extends MagiaTemporal {
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Premios/Congelar.png";
	
	public Congelar( Celda celda) {
		super(celda, vidaBase, tam, imagen);
		// TODO Auto-generated constructor stub
	}
}
