
public class Hada extends Torre{
	protected static int vidaMax=250;
	protected static int dano=50;
	protected static int alcance=8;
	protected static String rutaImagen="/Sprites/Torres/Hada.png";
	protected static String rutaProyectil="/Sprites/Ataques/AtaqueHada.gif";
	
	public Hada(Celda celda) {
		vida=vidaMax;
		this.celda=celda;
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
}
