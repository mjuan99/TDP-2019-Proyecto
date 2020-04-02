package Personajes;
import Juego.Celda;

public class Dinosaurio extends Torre {
	protected static int prec=200;
	protected static int vidaB=1000;
	protected static int tam=1;
	protected static int danoBase=250;
	protected static int alcanceBase=1;
	protected static String imagen ="./src/Sprites/Torres/Dinosaurio.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueDinosaurio.gif";
	protected static String nomb="Dinosaurio";
	protected static String mini="./src/Sprites/Tienda/Dinosaurio.png";
	protected static String estadoP="./src/Sprites/Efectos/Escudo/Dinosaurio.gif";
	
	public Dinosaurio(Celda celda) {
		super(celda,vidaB,tam,imagen,estadoP,danoBase,alcanceBase,proyectil,prec,mini,nomb);
	}
	
	public Torre nueva() {
		return new Dinosaurio(null);
	}
}
