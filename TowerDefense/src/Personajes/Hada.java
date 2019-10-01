package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;
import Objetos.ProyectilAliado;

public class Hada extends Torre{
	
	protected static int vidaBase=250;
	protected static int danoBase=50;
	protected static int alcanceBase=8;
	protected static String imagen ="./src/Sprites/Torres/Hada.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueHada.gif";
	
	public Hada(Mapa mapa,Celda celda) {
		super(mapa,celda,vidaBase,imagen,danoBase,alcanceBase,proyectil);
	}
	
}
