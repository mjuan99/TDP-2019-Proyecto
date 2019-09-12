package Personajes;
import Objetos.Proyectil;

public class Alien extends Torre {
	protected static int vidaMax=500;
	protected static int dano=70;
	protected static int alcance=6; 
	protected static String rutaProyectil="./src/Sprites/Ataques/AtaqueAlien.gif";
	
	public Alien() {
		vida=vidaMax;
		rutaImagen="./src/Sprites/Torres/Alien.png";
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
	
}
