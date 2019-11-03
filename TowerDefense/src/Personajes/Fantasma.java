package Personajes;
import Juego.Celda;

public class Fantasma extends Torre {

	protected static int precio=120;
	protected static int vidaBase=300;
	protected static int tam=1;
	protected static int danoBase=150;
	protected static int alcanceBase=4;
	protected static String imagen ="./src/Sprites/Torres/Fantasma.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueFantasma.gif";
	protected static String nomb="Fantasma";
	protected static String mini="./src/Sprites/Tienda/Fantasma.png";
	protected static String estadoProtegido="./src/Sprites/Efectos/Escudo/Fantasma.gif";
	
	public Fantasma(Celda celda) {
		super(celda,vidaBase,tam,imagen,estadoProtegido,danoBase,alcanceBase,proyectil,precio,mini,nomb);
	}
	
	public Torre nueva() {
		return new Fantasma(null);
	}
	
}
