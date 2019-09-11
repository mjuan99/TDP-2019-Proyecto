
public class Alien extends Torre {
	protected static int vidaMax=500;
	protected static int dano=70;
	protected static int alcance=6;
	protected static String rutaImagen="/Sprites/Torres/Alien.png";
	protected static String rutaProyectil="Sprites/Ataques/AtaqueAlien.gif";
	
	public Alien(Celda celda) {
		vida=vidaMax;
		this.celda=celda;
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
}
