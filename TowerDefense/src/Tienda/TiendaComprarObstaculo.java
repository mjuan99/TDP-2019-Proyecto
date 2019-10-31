package Tienda;

import Juego.Celda;
import Juego.Controlador;
import Juego.GUI;
import Juego.Jugador;
import Objetos.Obstaculo;
import Personajes.Torre;

public class TiendaComprarObstaculo implements TiendaEstado {
	protected Obstaculo proxObstaculo;
	public TiendaComprarObstaculo(Obstaculo o) {
		proxObstaculo=o;
	}

	@Override
	public void seleccionar(Torre t) {
		//nada
	}

	@Override
	public void selecciontar(Celda c) {
		int x=c.getX();
		int y=c.getY();
		if(Controlador.getControlador().agregarElemento(proxObstaculo,x, y)) {
			Jugador.getJugador().decrementarOro(proxObstaculo.getPrecio());
			GUI.getGUI().deseleccionarBotones();
			Tienda.getTienda().setEstado(new TiendaDefaultEstado());
		}
	}

}
