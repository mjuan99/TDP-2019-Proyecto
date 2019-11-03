package Personajes;
import Juego.Celda;

public class Alien extends Torre {
	protected static int precio=200;
	protected static int vidaBase=700;
	protected static int tam=1;
	protected static int danoBase=200;
	protected static int alcanceBase=4;
	protected static String imagen ="./src/Sprites/Torres/Alien.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueAlien.gif";
	protected static String nomb="Alien";
	protected static String mini="./src/Sprites/Tienda/Alien.png";
	protected static String estadoProtegido="./src/Sprites/Efectos/Escudo/Alien.gif";
	
	public Alien(Celda celda) {
		super(celda,vidaBase,tam,imagen,estadoProtegido,danoBase,alcanceBase,proyectil,precio,mini,nomb);
	}
	
	public Torre nueva() {
		return new Alien(null);
	}
}
