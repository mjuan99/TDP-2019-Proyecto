package Objetos;

import Juego.Celda;

public class Topo extends ObstaculoTiempo {
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Obstaculos/Topo.gif";
	protected static int tiempo=50;
	protected static String mini="";
	protected static String nombre= "Topo";
	protected static int precio=50;
	
	public Topo(Celda celda) {
		super(celda, vidaBase,tam ,imagen,tiempo,mini,nombre,precio);
		// TODO Auto-generated constructor stub
	}
}
