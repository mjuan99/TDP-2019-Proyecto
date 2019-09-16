package Personajes;
import Objetos.Proyectil;

public class Dragon extends Torre {
	protected static int vidaMax=600;
	protected static int dano=50;
	protected static int alcance=7;
	protected static String rutaProyectil="./src/Sprites/Ataques/AtaqueDragon.gif";
	
	public Dragon() {
		vida=vidaMax;
		rutaImagen="./src/Sprites/Torres/Dragon.png";
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
}
