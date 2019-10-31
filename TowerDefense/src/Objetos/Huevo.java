package Objetos;

import Juego.Celda;

public class Huevo extends ObstaculoTiempo {
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Obstaculos/Huevo.gif";
	protected static int tiempo=50;
	protected static String mini="";
	protected static String nombre= "Huevo";
	protected static int precio=50;
	
	public Huevo(Celda celda) {
		super(celda, vidaBase,tam ,imagen,tiempo,mini,nombre,precio);
		// TODO Auto-generated constructor stub
	}

}
