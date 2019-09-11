
public class Enemigo1 extends Enemigo{
	protected static int vidaMax=200;
	protected static int dano=100;
	protected static int alcance=5;
	protected static String rutaImagen="/Sprites/Torres/Enemigo1.png";
	protected static String rutaProyectil="/Sprites/Ataques/Enemigo1.gif";
	
	public Enemigo1(Celda celda) {
		vida=vidaMax;
		this.celda=celda;
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
}
