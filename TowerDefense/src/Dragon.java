
public class Dragon extends Torre {
	protected static int vidaMax=600;
	protected static int dano=50;
	protected static int alcance=7;
	protected static String rutaImagen="/Sprites/Torres/Dragon.png";
	
	public Dragon(Celda celda) {
		vida=vidaMax;
		this.celda=celda;
	}
}
