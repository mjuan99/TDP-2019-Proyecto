package Personajes;
import Juego.Celda;

public class Enemigo5 extends Enemigo {

	protected static int oroMinBase=50;
	protected static int oroMaxBase=100;
	protected static int puntosBase=80;
	protected static int velocBase=24;
	protected static int vidaBase=600;
	protected static int tam=1;
	protected static int danoBase=200;
	protected static int alcanceBase=3;
	protected static String imagen ="./src/Sprites/Enemigos/Enemigo5.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueBurbuja.gif";
	protected static String animacionMuerte="./src/Sprites/Efectos/Muertes/Muerte5.gif";
	protected static String rutaCongelado="./src/Sprites/Efectos/Congelar/Congelado5.png";
	protected static String rutaProtegido="./src/Sprites/Efectos/Escudo/Enemigo5.gif";
	
	public Enemigo5(Celda celda) {
		super(celda,vidaBase,tam,imagen,rutaCongelado,rutaProtegido,animacionMuerte,danoBase,alcanceBase,proyectil,velocBase,oroMinBase,oroMaxBase,puntosBase);
	}
}
