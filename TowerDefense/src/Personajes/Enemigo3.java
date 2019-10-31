package Personajes;
import Juego.Celda;

public class Enemigo3 extends Enemigo {

	protected static int oroMinBase=20;
	protected static int oroMaxBase=40;
	protected static int puntosBase=50;
	protected static int velocBase=12;
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static int danoBase=70;
	protected static int alcanceBase=3;
	protected static String imagen ="./src/Sprites/Enemigos/Enemigo3.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueFlecha.png";
	protected static String animacionMuerte="./src/Sprites/Efectos/Muerte3.gif";
	protected static String rutaCongelado="./src/Sprites/Efectos/EfectosPowerUps/Congelado3.png";
	protected static String rutaProtegido="./src/Sprites/Efectos/EfectosPowerUps/Escudo/Enemigo3.gif";
	
	public Enemigo3(Celda celda) {
		super(celda,vidaBase,tam,imagen,rutaCongelado,rutaProtegido,animacionMuerte,danoBase,alcanceBase,proyectil,velocBase,oroMinBase,oroMaxBase,puntosBase);
	}

}
