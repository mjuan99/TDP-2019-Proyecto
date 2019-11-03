package Personajes;
import Juego.Celda;

public class Fenix extends Torre {

	protected static int precio=250;
	protected static int vidaBase=600;
	protected static int tam=1;
	protected static int danoBase=250;
	protected static int alcanceBase=5;
	protected static String imagen ="./src/Sprites/Torres/Fenix.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueFenix.gif";
	protected static String nomb="Fenix";
	protected static String mini="./src/Sprites/Tienda/Fenix.png";
	protected static String estadoProtegido="./src/Sprites/Efectos/Escudo/Fenix.gif";
	
	public Fenix(Celda celda) {
		super(celda,vidaBase,tam,imagen,estadoProtegido,danoBase,alcanceBase,proyectil,precio,mini,nomb);
	}
	
	public Torre nueva() {
		return new Fenix(null);
	}

}
