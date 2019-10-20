package Juego;

import Objetos.PowerUp;
import Personajes.Torre;
import Juego.*;

public class Tienda {
	protected Jugador jugador;
	protected Torre proxTorre;
	
	public Tienda (Jugador jugador) {
		this.jugador=jugador;
	}
	
	//faltan metodos de torre
	public void comprar(Torre t) {
		if(jugador.getOro()>=t.getPrecio()) {
			proxTorre=t;
		}
		else {
			//no lo agrega entrega, no deberia esta habilitado el boton
		}
	}
	
	public void ubicar(int x, int y) {
		if(Controlador.getControlador().agregarTorre(proxTorre,x, y)) {
			jugador.decrementarOro(proxTorre.getPrecio());
		}
	}
	
	public void comprar(PowerUp p) {
		if(jugador.getOro()>=p.getPrecio()) {
			jugador.decrementarOro(p.getPrecio());
		}
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