package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;

public class Enemigo5 extends Enemigo {

	protected static int velocBase=24;
	protected static int vidaBase=900;
	protected static int tam=1;
	protected static int danoBase=50;
	protected static int alcanceBase=2;
	protected static String imagen ="./src/Sprites/Enemigos/Enemigo5.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueEnemigo.gif";
	protected static String animacionMuerte="./src/Sprites/Efectos/Muerte5.gif";
	
	public Enemigo5(Celda celda) {
		super(celda,vidaBase,tam,imagen,animacionMuerte,danoBase,alcanceBase,proyectil,velocBase);
	}
}
