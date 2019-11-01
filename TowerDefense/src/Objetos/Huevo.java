package Objetos;

import Juego.Celda;

public class Huevo extends ObjetoMapaTiempo {
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Obstaculos/Huevo.gif";
	protected static int tiempo=50;
	
	public Huevo(Celda celda) {
		super(celda, vidaBase,tam ,imagen,tiempo);
	}

}
