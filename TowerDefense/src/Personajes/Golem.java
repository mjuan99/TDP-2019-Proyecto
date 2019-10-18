package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;
import Objetos.ProyectilAliado;

public class Golem extends Torre {
	
	protected static int vidaBase=250;
	protected static int tam=1;
	protected static int danoBase=50;
	protected static int alcanceBase=4;
	protected static String imagen ="./src/Sprites/Torres/Golem.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueGolem.gif";
	
	public Golem(Mapa mapa,Celda celda) {
		super(mapa,celda,vidaBase,tam,imagen,danoBase,alcanceBase,proyectil);
	}
	
}
