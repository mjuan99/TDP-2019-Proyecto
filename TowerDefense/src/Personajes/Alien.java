package Personajes;
import Juego.Celda;
import Juego.Mapa;

public class Alien extends Torre {
	
	protected static int vidaBase=500;
	protected static int danoBase=70;
	protected static int alcanceBase=6;
	protected static String imagen ="./src/Sprites/Torres/Alien.png";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueAlien.gif";
	
	public Alien(Mapa mapa,Celda celda) {
		super(mapa,celda,vidaBase,imagen,danoBase,alcanceBase,proyectil);
	}
	
	
}
