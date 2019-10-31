package Objetos;
import Juego.Celda;
import Visitor.Visitor;

public class Nagini extends ObstaculoVida {

	protected static int precio=100;
	protected static int vidaBase=1500;
	protected static int tam=2;
	protected static String imagen ="./src/Sprites/Torres/Onix.gif";
	protected static String nomb="Nagini";
	protected static String mini="./src/Sprites/Tienda/Onix.png";
	
	public Nagini(Celda celda) {
		super(celda,vidaBase,tam,imagen);
	}
	
	public void actuar() {}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
	
	
}