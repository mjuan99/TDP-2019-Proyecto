package Personajes;
import Juego.Celda;

public class Dragon extends Torre {

	protected static int precio=50;
	protected static int vidaBase=600;
	protected static int tam=1;
	protected static int danoBase=50;
	protected static int alcanceBase=6;
	protected static String imagen ="./src/Sprites/Torres/Dragon.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueDragon.gif";
	protected static String nomb="Dragon";
	protected static String mini="./src/Sprites/Tienda/Dragon.png";
	protected static String estadoProtegido="./src/Sprites/Efectos/Escudo/Dragon.gif";
	
	public Dragon(Celda celda) {
		super(celda,vidaBase,tam,imagen,estadoProtegido,danoBase,alcanceBase,proyectil,precio,mini,nomb);
	}
	
	public Torre nueva() {
		return new Dragon(null);
	}
	
}
