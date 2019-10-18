package Personajes;
import Juego.Celda;
import Juego.Mapa;

public class Leviatan extends Torre {
	
	protected static int vidaBase=1500;
	protected static int tam=2;
	protected static int danoBase=70;
	protected static int alcanceBase=3;
	protected static String imagen ="./src/Sprites/Torres/Leviatan.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueLeviatan.gif";
	
	public Leviatan(Mapa mapa,Celda celda) {
		super(mapa,celda,vidaBase,tam,imagen,danoBase,alcanceBase,proyectil);
	}
	
	
}