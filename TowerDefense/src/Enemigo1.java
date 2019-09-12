
public class Enemigo1 extends Enemigo{
	protected static int vidaMax=200;
	protected static int dano=100;
	protected static int alcance=5;
	protected String rutaImagen="./src/Sprites/Enemigos/Enemigo1.gif";
	protected static String rutaProyectil="./src/Sprites/Ataques/Enemigo1.gif";
	
	public Enemigo1() {
		vida=vidaMax;
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
	public String getRutaImagen() {
		System.out.println(rutaImagen);
		return rutaImagen;
	}
}
