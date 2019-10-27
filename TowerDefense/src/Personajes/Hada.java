package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;
import Objetos.ProyectilAliado;

public class Hada extends Torre{

	protected static int precio=50;
	protected static int vidaBase=250;
	protected static int tam=1;
	protected static int danoBase=50;
	protected static int alcanceBase=3;
	protected static String imagen ="./src/Sprites/Torres/Hada.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueHada.gif";
	protected static String nomb="Hada";
	protected static String mini="./src/Sprites/Tienda/Hada.png";
	
	public Hada(Celda celda) {
		super(celda,vidaBase,tam,imagen,danoBase,alcanceBase,proyectil,precio,mini,nomb);
	}
	
	public Torre nueva() {
		return new Hada(null);
	}
	
}
