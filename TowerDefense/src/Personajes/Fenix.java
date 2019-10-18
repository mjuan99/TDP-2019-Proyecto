package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;
import Objetos.ProyectilAliado;

public class Fenix extends Torre {
	
	protected static int vidaBase=250;
	protected static int tam=1;
	protected static int danoBase=50;
	protected static int alcanceBase=5;
	protected static String imagen ="./src/Sprites/Torres/Fenix.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueFenix.gif";
	
	public Fenix(Mapa mapa,Celda celda) {
		super(mapa,celda,vidaBase,tam,imagen,danoBase,alcanceBase,proyectil);
	}

}
