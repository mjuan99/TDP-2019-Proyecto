package Objetos;

import Juego.Celda;
import Visitor.Visitor;

public class Slime extends ObstaculoVida{
	protected static int vidaBase=600;
	protected static int tam=1;
	protected static String imagen ="./src/Sprites/Obstaculos/Slime.gif";
	protected static String nombre="Slime baboso";
	protected static String mini="";
	protected static int precio=75;
	
	public Slime(Celda celda) {
		super(celda,vidaBase,tam,imagen,mini,precio);
	}
	
	public void actuar() {}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
