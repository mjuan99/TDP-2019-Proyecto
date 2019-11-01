package Objetos;

import Juego.Celda;

public class Topo extends ObjetoJugadorTiempo {
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static String imagen="./src/Sprites/Obstaculos/Topo.gif";
	protected static int tiempo=50;
	protected static String mini="./src/Sprites/Tienda/Topo.png";
	protected static String nombre= "Topo";
	protected static int precio=50;
	
	public Topo(Celda celda) {
		super(celda, vidaBase,tam ,imagen,tiempo,mini,nombre,precio);
		// TODO Auto-generated constructor stub
	}
	
	public ObjetoJugador nuevo() {
		return new Topo(null);
	}
}
