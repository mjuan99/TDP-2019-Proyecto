package Objetos;

import Juego.Celda;

public class Slime extends ObjetoJugadorTiempo{
	protected static int vidaBase=600;
	protected static int tam=1;
	protected static String imagen ="./src/Sprites/Obstaculos/Slime.gif";
	protected static int tiempo=70;
	protected static String nombre="Slime baboso";
	protected static String mini="./src/Sprites/Tienda/Slime.png";
	protected static int precio=150;
	
	public Slime(Celda celda) {
		super(celda,vidaBase,tam,imagen,tiempo,mini,nombre,precio);
	}
	
	public ObjetoJugador nuevo() {
		return new Slime(null);
	}

}
