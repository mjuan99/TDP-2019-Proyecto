package Personajes;
import Juego.Celda;
import Juego.Mapa;
import PowerUpsEfecto.CongelarEfecto;
import PowerUpsEfecto.DobleFuerzaEfecto;
import PowerUpsEfecto.TorreAleatoriaEfecto;

public class Leviatan extends Torre {

	protected static int precio=50;
	protected static int vidaBase=1500;
	protected static int tam=2;
	protected static int danoBase=0;
	protected static int alcanceBase=0;
	protected static String imagen ="./src/Sprites/Torres/Onix.gif";
	protected static String proyectil="";
	protected static String nomb="Leviatan";
	protected static String mini="./src/Sprites/Tienda/Leviatana.png";
	
	public Leviatan(Celda celda) {
		super(celda,vidaBase,tam,imagen,danoBase,alcanceBase,proyectil,precio,mini,nomb);
	}
	
	public Torre nueva() {
		return new Leviatan(null);
	}
	
	public void actuar() {}
	
	
}