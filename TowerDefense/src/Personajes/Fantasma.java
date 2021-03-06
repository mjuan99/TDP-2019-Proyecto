package Personajes;
import Juego.Celda;

public class Fantasma extends Torre {

	protected static int prec=120;
	protected static int vidaB=300;
	protected static int tam=1;
	protected static int danoBase=150;
	protected static int alcanceBase=4;
	protected static String imagen ="./src/Sprites/Torres/Fantasma.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueFantasma.gif";
	protected static String nomb="Fantasma";
	protected static String mini="./src/Sprites/Tienda/Fantasma.png";
	protected static String estadoP="./src/Sprites/Efectos/Escudo/Fantasma.gif";
	
	public Fantasma(Celda celda) {
		super(celda,vidaB,tam,imagen,estadoP,danoBase,alcanceBase,proyectil,prec,mini,nomb);
	}
	
	public Torre nueva() {
		return new Fantasma(null);
	}
	
}
