package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;

public class Enemigo2 extends Enemigo{

	protected static int velocBase=12;
	protected static int vidaBase=50;
	protected static int tam=1;
	protected static int danoBase=50;
	protected static int alcanceBase=2;
	protected static String imagen ="./src/Sprites/Enemigos/Enemigo2.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueEnemigo.gif";
	protected static String animacionMuerte="./src/Sprites/Efectos/Muerte2.gif";
	protected static String rutaCongelado="./src/Sprites/Efectos/EfectosPowerUps/Congelado2.png";
	
	public Enemigo2(Celda celda) {
		super(celda,vidaBase,tam,imagen,rutaCongelado,animacionMuerte,danoBase,alcanceBase,proyectil,velocBase);
	}

}
