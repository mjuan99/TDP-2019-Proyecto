package Personajes;
import Objetos.Proyectil;

public class Enemigo6 extends Enemigo {
	protected static int vidaMax=200;
	protected static int dano=100;
	protected static int alcance=5;
	protected static String rutaProyectil="./src/Sprites/Ataques/Enemigo6.gif";
	
	public Enemigo6() {
		vida=vidaMax;
		rutaImagen="./src/Sprites/Enemigos/Enemigo6.gif";
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
}
