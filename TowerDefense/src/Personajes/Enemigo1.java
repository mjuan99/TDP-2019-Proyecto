package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;

public class Enemigo1 extends Enemigo{
	
	protected static int vidaBase=200;
	protected static int danoBase=70;
	protected static int alcanceBase=6;
	protected static String imagen ="./src/Sprites/Enemigos/Enemigo1.gif";
	protected static String proyectil="./src/Sprites/Ataques/Enemigo1.gif";
	
	public Enemigo1(Mapa mapa,Celda celda) {
		super(mapa,celda,vidaBase,imagen,danoBase,alcanceBase,proyectil);
	}
	
}
