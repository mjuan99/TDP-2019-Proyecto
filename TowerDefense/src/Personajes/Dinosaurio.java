package Personajes;
import Objetos.Proyectil;

public class Dinosaurio extends Torre {
	protected static int vidaMax=600;
	protected static int dano=80;
	protected static int alcance=1;
	protected static String rutaProyectil="./src/Sprites/Ataques/AtaqueDinosaurio.gif";
	
	public Dinosaurio() {
		vida=vidaMax;
		rutaImagen="./src/Sprites/Torres/Dinosaurio.png";
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
	
}
