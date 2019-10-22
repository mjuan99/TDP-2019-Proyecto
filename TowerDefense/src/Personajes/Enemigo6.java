package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;
import Objetos.ProyectilEnemigo;

public class Enemigo6 extends Enemigo {

	protected static int velocBase=24;
	protected static int vidaBase=1000;
	protected static int tam=1;
	protected static int danoBase=100;
	protected static int alcanceBase=1;
	protected static String imagen ="./src/Sprites/Enemigos/Enemigo6.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueEnemigo2.gif";
	protected static String animacionMuerte="./src/Sprites/Efectos/Muerte6.gif";
	
	public Enemigo6(Celda celda) {
		super(celda,vidaBase,tam,imagen,animacionMuerte,danoBase,alcanceBase,proyectil,velocBase);
	}
}
