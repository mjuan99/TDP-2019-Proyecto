package Personajes;
import Juego.Celda;

public class Hada extends Torre{

	protected static int prec=100;
	protected static int vidaB=500;
	protected static int tam=1;
	protected static int danoBase=100;
	protected static int alcanceBase=3;
	protected static String imagen ="./src/Sprites/Torres/Hada.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueHada.gif";
	protected static String nomb="Hada";
	protected static String mini="./src/Sprites/Tienda/Hada.png";
	protected static String estadoP="./src/Sprites/Efectos/Escudo/Hada.gif";
	
	public Hada(Celda celda) {
		super(celda,vidaB,tam,imagen,estadoP,danoBase,alcanceBase,proyectil,prec,mini,nomb);
	}
	
	public Torre nueva() {
		return new Hada(null);
	}
	
}
