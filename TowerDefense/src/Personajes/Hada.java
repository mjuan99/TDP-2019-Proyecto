package Personajes;
import Objetos.Proyectil;

public class Hada extends Torre{
	protected static int vidaMax=250;
	protected static int dano=50;
	protected static int alcance=8;
	protected static String rutaProyectil="./src/Sprites/Ataques/AtaqueHada.gif";
	
	public Hada() {
		vida=vidaMax;
		rutaImagen="./src/Sprites/Torres/Hada.png";
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
}
