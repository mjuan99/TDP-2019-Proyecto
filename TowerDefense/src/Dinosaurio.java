
public class Dinosaurio extends Torre {
	protected static int vidaMax=600;
	protected static int dano=80;
	protected static int alcance=1;
	protected static String rutaImagen="/Sprites/Torres/Dinosaurio.png";
	protected static String rutaProyectil="/Sprites/Ataques/AtaqueDinosaurio.gif";
	
	public Dinosaurio(Celda celda) {
		vida=vidaMax;
		this.celda=celda;
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
}
