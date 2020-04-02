package Personajes;
import Juego.Celda;

public class Golem extends Torre {

	protected static int prec=350;
	protected static int vidaB=1200;
	protected static int tam=1;
	protected static int danoBase=175;
	protected static int alcanceBase=5;
	protected static String imagen ="./src/Sprites/Torres/Golem.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueGolem.gif";
	protected static String nomb="Golem";
	protected static String mini="./src/Sprites/Tienda/Golem.png";
	protected static String estadoP="./src/Sprites/Efectos/Escudo/Golem.gif";
	
	public Golem(Celda celda) {
		super(celda,vidaB,tam,imagen,estadoP,danoBase,alcanceBase,proyectil,prec,mini,nomb);
	}
	
	public Torre nueva() {
		return new Golem(null);
	}
	
}
