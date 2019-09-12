package Personajes;
import Objetos.Proyectil;

public class Enemigo2 extends Enemigo{
	protected static int vidaMax=200;
	protected static int dano=100;
	protected static int alcance=5;
	protected static String rutaProyectil="./src/Sprites/Ataques/Enemigo2.gif";
	
	public Enemigo2() {
		vida=vidaMax;
		rutaImagen="./src/Sprites/Enemigos/Enemigo2.gif";
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}

}
