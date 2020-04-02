package Personajes;
import Juego.Celda;

public class Fenix extends Torre {

	protected static int prec=250;
	protected static int vidaB=600;
	protected static int tam=1;
	protected static int danoBase=250;
	protected static int alcanceBase=5;
	protected static String imagen ="./src/Sprites/Torres/Fenix.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueFenix.gif";
	protected static String nomb="Fenix";
	protected static String mini="./src/Sprites/Tienda/Fenix.png";
	protected static String estadoP="./src/Sprites/Efectos/Escudo/Fenix.gif";
	
	public Fenix(Celda celda) {
		super(celda,vidaB,tam,imagen,estadoP,danoBase,alcanceBase,proyectil,prec,mini,nomb);
	}
	
	public Torre nueva() {
		return new Fenix(null);
	}

}
