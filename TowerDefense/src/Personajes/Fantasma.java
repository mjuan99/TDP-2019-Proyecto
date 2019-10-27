package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.Proyectil;
import Objetos.ProyectilAliado;

public class Fantasma extends Torre {

	protected static int precio=50;
	protected static int vidaBase=250;
	protected static int tam=1;
	protected static int danoBase=50;
	protected static int alcanceBase=4;
	protected static String imagen ="./src/Sprites/Torres/Fantasma.gif";
	protected static String proyectil="./src/Sprites/Ataques/AtaqueFantasma.gif";
	protected static String nomb="Fantasma";
	protected static String mini="./src/Sprites/Tienda/Fantasma.png";
	
	public Fantasma(Celda celda) {
		super(celda,vidaBase,tam,imagen,danoBase,alcanceBase,proyectil,precio,mini,nomb);
	}
	
	public Torre nueva() {
		return new Fantasma(null);
	}
	
}
