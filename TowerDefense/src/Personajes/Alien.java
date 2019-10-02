package Personajes;
import Juego.Celda;
import Juego.Mapa;

public class Alien extends Torre {
	
	protected static int vidaBase=500;
	protected static int danoBase=70;
	protected static int alcanceBase=3;
	protected static String imagen ="./src/Sprites/Torres/Alien.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueAlien.gif";
	
	public Alien(Mapa mapa,Celda celda) {
		super(mapa,celda,vidaBase,imagen,danoBase,alcanceBase,proyectil);
	}
	
	
}
