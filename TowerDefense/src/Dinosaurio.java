
public class Dinosaurio extends Torre {
	protected static int vidaMax=600;
	protected static int dano=80;
	protected static int alcance=1;
	protected String rutaImagen="./src/Sprites/Torres/Dinosaurio.png";
	protected static String rutaProyectil="./src/Sprites/Ataques/AtaqueDinosaurio.gif";
	
	public Dinosaurio() {
		vida=vidaMax;
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
	public String getRutaImagen() {
		return rutaImagen;
	}
}
