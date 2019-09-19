package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;

public class Enemigo3 extends Enemigo {
	
	protected static int vidaBase=500;
	protected static int danoBase=70;
	protected static int alcanceBase=6;
	protected static String imagen ="./src/Sprites/Enemigos/Enemigo3.gif";
	protected static String proyectil="./src/Sprites/Ataques/Enemigo3.gif";
	
	public Enemigo3(Mapa mapa,Celda celda) {
		super(mapa,celda,vidaBase,imagen,danoBase,alcanceBase,proyectil);
	}

}
