package Personajes;
import Juego.Celda;

public class Hada extends Torre{

	protected static int precio=100;
	protected static int vidaBase=500;
	protected static int tam=1;
	protected static int danoBase=100;
	protected static int alcanceBase=3;
	protected static String imagen ="./src/Sprites/Torres/Hada.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueHada.gif";
	protected static String nomb="Hada";
	protected static String mini="./src/Sprites/Tienda/Hada.png";
	protected static String estadoProtegido="./src/Sprites/Efectos/Escudo/Hada.gif";
	
	public Hada(Celda celda) {
		super(celda,vidaBase,tam,imagen,estadoProtegido,danoBase,alcanceBase,proyectil,precio,mini,nomb);
	}
	
	public Torre nueva() {
		return new Hada(null);
	}
	
}
