package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;

public class Enemigo4 extends Enemigo {
	protected static int vidaBase=500;
	protected static int tam=1;
	protected static int danoBase=70;
	protected static int alcanceBase=2;
	protected static String imagen ="./src/Sprites/Enemigos/Enemigo4.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueEnemigo.gif";
	protected static String animacionMuerte="./src/Sprites/Efectos/Muerte4.gif";
	
	public Enemigo4(Mapa mapa,Celda celda) {
		super(mapa,celda,vidaBase,tam,imagen,animacionMuerte,danoBase,alcanceBase,proyectil);
	}
}
