package Objetos;

import Juego.Celda;

public class Slime extends ObstaculoTiempo{
	protected static int vidaBase=600;
	protected static int tam=1;
	protected static String imagen ="./src/Sprites/Obstaculos/Slime.gif";
	protected static int tiempo=500;
	protected static String nombre="Slime baboso";
	protected static String mini="";
	protected static int precio=75;
	
	public Slime(Celda celda) {
		super(celda,vidaBase,tam,imagen,tiempo,mini,nombre,precio);
	}

}
