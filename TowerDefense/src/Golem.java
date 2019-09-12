
public class Golem extends Torre {

	protected static int vidaMax=250;
	protected static int dano=50;
	protected static int alcance=8;
	protected String rutaImagen="./src/Sprites/Torres/Golem.png";
	protected static String rutaProyectil="./src/Sprites/Ataques/AtaqueGolem.gif";
	
	public Golem() {
		vida=vidaMax;
	}
	
	public Proyectil Atacar() {
		return new Proyectil(dano,alcance,rutaProyectil);
	}
	public String getRutaImagen() {
		return rutaImagen;
	}


}
