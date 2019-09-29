package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;

public class Dragon extends Torre {
	
	protected static int vidaBase=600;
	protected static int danoBase=50;
	protected static int alcanceBase=7;
	protected static String imagen ="./src/Sprites/Torres/Dragon.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueDragon.gif";
	
	public Dragon(Mapa mapa,Celda celda) {
		super(mapa,celda,vidaBase,imagen,danoBase,alcanceBase,proyectil);
	}
	
}
