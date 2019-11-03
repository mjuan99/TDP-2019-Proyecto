package Personajes;
import Juego.Celda;

public class Enemigo4 extends Enemigo {

	protected static int oroMinBase=100;
	protected static int oroMaxBase=150;
	protected static int puntosBase=100;
	protected static int velocBase=16;
	protected static int vidaBase=500;
	protected static int tam=1;
	protected static int danoBase=250;
	protected static int alcanceBase=4;
	protected static String imagen ="./src/Sprites/Enemigos/Enemigo4.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueGarso.gif";
	protected static String animacionMuerte="./src/Sprites/Efectos/Muertes/Muerte4.gif";
	protected static String rutaCongelado="./src/Sprites/Efectos/Congelar/Congelado4.png";
	protected static String rutaProtegido="./src/Sprites/Efectos/Escudo/Enemigo4.gif";
	
	public Enemigo4(Celda celda) {
		super(celda,vidaBase,tam,imagen,rutaCongelado,rutaProtegido,animacionMuerte,danoBase,alcanceBase,proyectil,velocBase,oroMinBase,oroMaxBase,puntosBase);
	}
}
