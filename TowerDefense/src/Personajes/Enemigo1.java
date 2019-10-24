package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;

public class Enemigo1 extends Enemigo{
	
	protected static int velocBase=8;
	protected static int vidaBase=500;
	protected static int tam=1;
	protected static int danoBase=50;
	protected static int alcanceBase=1;
	protected static String imagen ="./src/Sprites/Enemigos/Enemigo1.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueEnemigo2.gif";
	protected static String animacionMuerte="./src/Sprites/Efectos/Muerte1.gif";
	
	public Enemigo1(Celda celda) {
		super(celda,vidaBase,tam,imagen,animacionMuerte,danoBase,alcanceBase,proyectil,velocBase);
	}
	
}
