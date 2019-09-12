
public class Dragon extends Torre {
	protected static int vidaMax=600;
	protected static int dano=50;
	protected static int alcance=7;
	protected String rutaImagen="./src/Sprites/Torres/Dragon.png";
	protected static String rutaProyectil="./src/Sprites/Ataques/AtaqueDragon.gif";
	
	public Dragon() {
		vida=vidaMax;
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
	public String getRutaImagen() {
		return rutaImagen;
	}
}
