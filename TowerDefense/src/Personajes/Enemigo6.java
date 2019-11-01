package Personajes;
import Juego.Celda;

public class Enemigo6 extends Enemigo {

	protected static int oroMinBase=20;
	protected static int oroMaxBase=40;
	protected static int puntosBase=50;
	protected static int velocBase=24;
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static int danoBase=100;
	protected static int alcanceBase=3;
	protected static String imagen ="./src/Sprites/Enemigos/Enemigo6.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueEnfermera.png";
	protected static String animacionMuerte="./src/Sprites/Efectos/Muertes/Muerte6.gif";
	protected static String rutaCongelado="./src/Sprites/Efectos/Congelar/Congelado6.png";
	protected static String rutaProtegido="./src/Sprites/Efectos/Escudo/Enemigo6.gif";
	
	public Enemigo6(Celda celda) {
		super(celda,vidaBase,tam,imagen,rutaCongelado,rutaProtegido,animacionMuerte,danoBase,alcanceBase,proyectil,velocBase,oroMinBase,oroMaxBase,puntosBase);
	}
}
