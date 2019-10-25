package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;

public class Dinosaurio extends Torre {
	protected static int precio=50;
	protected static int vidaBase=600;
	protected static int tam=1;
	protected static int danoBase=80;
	protected static int alcanceBase=1;
	protected static String imagen ="./src/Sprites/Torres/Dinosaurio.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueDinosaurio.gif";
	protected static String nomb="Dinosaurio";
	protected static String mini="./src/Sprites/Tienda/Dinosaurio.png";
	
	public Dinosaurio(Celda celda) {
		super(celda,vidaBase,tam,imagen,danoBase,alcanceBase,proyectil,precio,mini,nomb);
	}
	
	public Torre nueva() {
		return new Dinosaurio(null);
	}
}
