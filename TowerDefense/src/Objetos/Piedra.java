package Objetos;

import Juego.Celda;

public class Piedra extends ObjetoMapaVida{
	protected static int vidaBase=800;
	protected static int tam=1;
	protected static String imagen ="./src/Sprites/Obstaculos/Piedra.png";
	
	public Piedra(Celda celda) {
		super(celda,vidaBase,tam,imagen);
	}

}
