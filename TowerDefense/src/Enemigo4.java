
public class Enemigo4 extends Enemigo {
	protected static int vidaMax=200;
	protected static int dano=100;
	protected static int alcance=5;
	protected String rutaImagen="./src/Sprites/Enemigos/Enemigo4.gif";
	protected static String rutaProyectil="./src/Sprites/Ataques/Enemigo4.gif";
	
	public Enemigo4() {
		vida=vidaMax;
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
	public String getRutaImagen() {
		return rutaImagen;
	}
}
