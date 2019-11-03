package Personajes;
import Juego.Celda;

public class Golem extends Torre {

	protected static int precio=350;
	protected static int vidaBase=1200;
	protected static int tam=1;
	protected static int danoBase=175;
	protected static int alcanceBase=5;
	protected static String imagen ="./src/Sprites/Torres/Golem.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueGolem.gif";
	protected static String nomb="Golem";
	protected static String mini="./src/Sprites/Tienda/Golem.png";
	protected static String estadoProtegido="./src/Sprites/Efectos/Escudo/Golem.gif";
	
	public Golem(Celda celda) {
		super(celda,vidaBase,tam,imagen,estadoProtegido,danoBase,alcanceBase,proyectil,precio,mini,nomb);
	}
	
	public Torre nueva() {
		return new Golem(null);
	}
	
}
