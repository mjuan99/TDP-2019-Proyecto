
public class Dragon extends Torre {
	protected static int vidaMax=600;
	protected static int dano=50;
	protected static int alcance=7;
	protected static String rutaImagen="/Sprites/Torres/Dragon.png";
	protected static String rutaProyectil="Sprites/Ataques/AtaqueDragon.gif";
	
	public Dragon(Celda celda) {
		vida=vidaMax;
		this.celda=celda;
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
}
