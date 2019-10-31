package Personajes;
import Juego.Celda;

public class Enemigo5 extends Enemigo {

	protected static int oroMinBase=20;
	protected static int oroMaxBase=40;
	protected static int puntosBase=50;
	protected static int velocBase=24;
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static int danoBase=50;
	protected static int alcanceBase=2;
	protected static String imagen ="./src/Sprites/Enemigos/Enemigo5.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueBurbuja.gif";
	protected static String animacionMuerte="./src/Sprites/Efectos/Muertes/Muerte5.gif";
	protected static String rutaCongelado="./src/Sprites/Efectos/Congelar/Congelado5.png";
	protected static String rutaProtegido="./src/Sprites/Efectos/EfectosPowerUps/Escudo/Enemigo5.gif";
	
	public Enemigo5(Celda celda) {
		super(celda,vidaBase,tam,imagen,rutaCongelado,rutaProtegido,animacionMuerte,danoBase,alcanceBase,proyectil,velocBase,oroMinBase,oroMaxBase,puntosBase);
	}
}
