package Objetos;

import Juego.Celda;
import Visitor.Visitor;

public class Piedra extends ObstaculoVida{
	protected static int vidaBase=1500;
	protected static int tam=2;
	protected static String imagen ="./src/Sprites/Obstaculos/Onix.gif";
	protected static String nombre="Nagini";
	protected static String mini="";
	protected static int precio=100;
	
	public Piedra(Celda celda) {
		super(celda,vidaBase,tam,imagen,mini,precio);
	}
	
	public void actuar() {}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
