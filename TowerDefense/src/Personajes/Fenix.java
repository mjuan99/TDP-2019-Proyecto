package Personajes;
import Objetos.Proyectil;

public class Fenix extends Torre {
	protected static int vidaMax=250;
	protected static int dano=50;
	protected static int alcance=8;
	protected static String rutaProyectil="./src/Sprites/Ataques/AtaqueFenix.gif";
	
	public Fenix() {
		vida=vidaMax;
		rutaImagen="./src/Sprites/Torres/Fenix.png";
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}

}
