package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;

public class Enemigo4 extends Enemigo {

	protected static int velocBase=16;
	protected static int vidaBase=500;
	protected static int tam=1;
	protected static int danoBase=80;
	protected static int alcanceBase=4;
	protected static String imagen ="./src/Sprites/Enemigos/Enemigo4.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueEnemigo.gif";
	protected static String animacionMuerte="./src/Sprites/Efectos/Muerte4.gif";
	
	public Enemigo4(Celda celda) {
		super(celda,vidaBase,tam,imagen,animacionMuerte,danoBase,alcanceBase,proyectil,velocBase);
	}
}
