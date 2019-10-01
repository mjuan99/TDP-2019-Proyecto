package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;

public class Dinosaurio extends Torre {
	protected static int vidaBase=600;
	protected static int danoBase=80;
	protected static int alcanceBase=1;
	protected static String imagen ="./src/Sprites/Torres/Dinosaurio.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueDinosaurio.gif";
	
	public Dinosaurio(Mapa mapa,Celda celda) {
		super(mapa,celda,vidaBase,imagen,danoBase,alcanceBase,proyectil);
	}
}
