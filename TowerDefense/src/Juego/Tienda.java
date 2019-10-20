package Juego;

import Objetos.PowerUp;
import Personajes.Torre;

public class Tienda {
	protected Jugador jugador;
	
	public Tienda (Jugador jugador) {
		this.jugador=jugador;
	}
	
	//faltan metodos de torre
	public void comprar(Torre t) {
		if(jugador.getOro()>=t.getPrecio()) {
			jugador.decrementarOro(t.getPrecio());
		}
		else {
			//no lo agrega entrega, no deberia esta habilitado el boton
		}
	}
	
	public void comprar(PowerUp p) {
		
	}
	//la tienda deberia ocuparse de habilitar o deshabilitar los botones de compra
	public boolean disponible(Elemento e) {
		boolean toReturn;
		if(jugador.getOro()>=e.getPrecio()) {
			toReturn=true;
		}
		else {
			toReturn=false;
		}
	}
	
}