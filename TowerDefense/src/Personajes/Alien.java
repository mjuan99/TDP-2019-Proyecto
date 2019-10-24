package Personajes;
import Juego.Celda;
import Juego.Mapa;

public class Alien extends Torre {
	
	protected static int vidaBase=500;
	protected static int tam=1;
	protected static int danoBase=70;
	protected static int alcanceBase=3;
	protected static String imagen ="./src/Sprites/Torres/Alien.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueAlien.gif";
	
	public Alien(Celda celda) {
		super(celda,vidaBase,tam,imagen,danoBase,alcanceBase,proyectil);
	}
	
	
}
