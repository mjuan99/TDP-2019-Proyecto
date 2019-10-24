package Tienda;

import Juego.Controlador;
import Juego.Elemento;
import Juego.GUI;
import Juego.Jugador;
import PowerUps.*;
import Personajes.Torre;

public class Tienda {
	private static Tienda tienda;
	protected Jugador jugador;
	protected Torre proxTorre;
	
	private Tienda () {
	}
	
	public static Tienda getTienda() {
		if (tienda==null)
			return (tienda=new Tienda());
		else
			return tienda;
	}
	
	public void click(Elemento elemento) {
		System.out.println(elemento);
	}
	
	//faltan metodos de torre
	public void comprar(Torre t) {
		//if(jugador.getOro()>=t.getPrecio()) {
			proxTorre=t;
		/*}
		else {
			//no lo agrega entrega, no deberia esta habilitado el boton
		}*/
	}
	
	public void ubicar(int x, int y) {
		if(proxTorre!=null&&Controlador.getControlador().agregarTorre(proxTorre,x, y)) {
			//jugador.decrementarOro(proxTorre.getPrecio());
			proxTorre=null;
			GUI.getGUI().deseleccionarBotones();
		}
	}
	
	public void comprar(PowerUp p) {
		/*if(jugador.getOro()>=p.getPrecio()) {
			jugador.decrementarOro(p.getPrecio());
		}*/
	}
	//la tienda deberia ocuparse de habilitar o deshabilitar los botones de compra
	public boolean disponible(Elemento e) {
		/*boolean toReturn;
		if(jugador.getOro()>=e.getPrecio()) {
			toReturn=true;
		}
		else {
			toReturn=false;
		}*/
		return false;
	}
	
}