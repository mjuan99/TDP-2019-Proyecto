package Objetos;

import Juego.Celda;

public class Piedra extends ObstaculoVida{
	protected static int vidaBase=1500;
	protected static int tam=1;
	protected static String imagen ="./src/Sprites/Obstaculos/Piedra.png";
	protected static String nombre="Piedra";
	protected static String mini="";
	protected static int precio=100;
	
	public Piedra(Celda celda) {
		super(celda,vidaBase,tam,imagen,mini,nombre,precio);
	}
	
	public Obstaculo nuevo() {
		return new Piedra(null);
	}

}
