package Tienda;

import Juego.Celda;
import Juego.Controlador;
import Juego.GUI;
import Juego.Jugador;
import Personajes.Torre;

public class TiendaComprarTorre implements TiendaEstado {
	protected Torre proxTorre;
	public TiendaComprarTorre(Torre t) {
		proxTorre=t;
	}

	@Override
	public void seleccionar(Torre t) {
		//nada
	}

	@Override
	public void seleccionar(Celda c) {
		int x=c.getX();
		int y=c.getY();
		if(Controlador.getControlador().agregarElemento(proxTorre,x, y)) {
			Jugador.getJugador().decrementarOro(proxTorre.getPrecio());
			GUI.getGUI().deseleccionarBotones();
			Tienda.getTienda().setEstado(new TiendaDefaultEstado());
		}
	}

}
