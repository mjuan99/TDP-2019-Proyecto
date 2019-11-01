package Objetos;
import Juego.Celda;

public class Nagini extends ObjetoJugadorVida {

	protected static int vidaBase=1500;
	protected static int tam=2;
	protected static String imagen ="./src/Sprites/Obstaculos/Onix.gif";
	protected static String nombre="Nagini";
	protected static String mini="./src/Sprites/Tienda/Nagini.png";
	protected static int precio=100;
	
	public Nagini(Celda celda) {
		super(celda,vidaBase,tam,imagen,mini,nombre,precio);
	}
	
	public ObjetoJugador nuevo() {
		return new Nagini(null);
	}
	
}