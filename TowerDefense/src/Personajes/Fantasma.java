package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;
import Objetos.ProyectilAliado;

public class Fantasma extends Torre {
	
	protected static int vidaBase=250;
	protected static int danoBase=50;
	protected static int alcanceBase=8;
	protected static String imagen ="./src/Sprites/Torres/Fantasma.png";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueFantasma.gif";
	
	public Fantasma(Mapa mapa,Celda celda) {
		super(mapa,celda,vidaBase,imagen,danoBase,alcanceBase,proyectil);
	}
	
}
