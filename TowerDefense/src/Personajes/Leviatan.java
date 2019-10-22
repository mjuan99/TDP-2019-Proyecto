package Personajes;
import Juego.Celda;
import Juego.Mapa;

public class Leviatan extends Torre {
	
	protected static int vidaBase=1500;
	protected static int tam=2;
	protected static int danoBase=0;
	protected static int alcanceBase=0;
	protected static String imagen ="./src/Sprites/Torres/Onix.gif";
	protected static String proyectil="";
	
	public Leviatan(Mapa mapa,Celda celda) {
		super(mapa,celda,vidaBase,tam,imagen,danoBase,alcanceBase,proyectil);
	}
	
	public void actuar() {}
	
	
}