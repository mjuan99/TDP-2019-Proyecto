package Personajes;
import Juego.Celda;

public class Enemigo2 extends Enemigo{

	protected static int oroMinBase=20;
	protected static int oroMaxBase=40;
	protected static int puntosBase=50;
	protected static int velocBase=12;
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static int danoBase=50;
	protected static int alcanceBase=1;
	protected static String imagen ="./src/Sprites/Enemigos/Enemigo2.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueEnemigo.gif";
	protected static String animacionMuerte="./src/Sprites/Efectos/Muertes/Muerte2.gif";
	protected static String rutaCongelado="./src/Sprites/Efectos/Congelar/Congelado2.png";
	protected static String rutaProtegido="./src/Sprites/Efectos/Escudo/Enemigo2.gif";
	
	public Enemigo2(Celda celda) {
		super(celda,vidaBase,tam,imagen,rutaCongelado,rutaProtegido,animacionMuerte,danoBase,alcanceBase,proyectil,velocBase,oroMinBase,oroMaxBase,puntosBase);
	}

}
