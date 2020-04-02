package Personajes;
import Juego.Celda;

public class Dragon extends Torre {

	protected static int prec=500;
	protected static int vidaB=600;
	protected static int tam=1;
	protected static int danoBase=350;
	protected static int alcanceBase=6;
	protected static String imagen ="./src/Sprites/Torres/Dragon.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueDragon.gif";
	protected static String nomb="Dragon";
	protected static String mini="./src/Sprites/Tienda/Dragon.png";
	protected static String estadoP="./src/Sprites/Efectos/Escudo/Dragon.gif";
	
	public Dragon(Celda celda) {
		super(celda,vidaB,tam,imagen,estadoP,danoBase,alcanceBase,proyectil,prec,mini,nomb);
	}
	
	public Torre nueva() {
		return new Dragon(null);
	}
	
}
