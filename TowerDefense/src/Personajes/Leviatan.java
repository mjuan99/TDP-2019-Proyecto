package Personajes;
import Juego.Celda;

public class Leviatan extends Torre {

	protected static int precio=100;
	protected static int vidaBase=1500;
	protected static int tam=2;
	protected static int danoBase=0;
	protected static int alcanceBase=0;
	protected static String imagen ="./src/Sprites/Torres/Onix.gif";
	protected static String proyectil="";
	protected static String nomb="Leviatan";
	protected static String mini="./src/Sprites/Tienda/Onix.png";
	
	public Leviatan(Celda celda) {
		super(celda,vidaBase,tam,imagen,imagen,danoBase,alcanceBase,proyectil,precio,mini,nomb);
	}
	
	public Torre nueva() {
		return new Leviatan(null);
	}
	
	public void actuar() {}
	
	
}