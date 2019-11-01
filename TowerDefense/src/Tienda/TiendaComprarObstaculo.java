package Tienda;

import Juego.Celda;
import Juego.Controlador;
import Juego.GUI;
import Juego.Jugador;
import Objetos.ObjetoJugador;
import Personajes.Torre;

public class TiendaComprarObstaculo implements TiendaEstado {
	protected ObjetoJugador proxObstaculo;
	public TiendaComprarObstaculo(ObjetoJugador o) {
		proxObstaculo=o;
	}

	@Override
	public void seleccionar(Torre t) {
		//nada
	}

	@Override
	public void seleccionar(Celda c) {
		int x=c.getX();
		int y=c.getY();
		if(Controlador.getControlador().agregarElemento(proxObstaculo,x, y)) {
			Jugador.getJugador().decrementarOro(proxObstaculo.getPrecio());
			GUI.getGUI().deseleccionarBotones();
			Tienda.getTienda().setEstado(new TiendaDefaultEstado());
		}
	}

}
