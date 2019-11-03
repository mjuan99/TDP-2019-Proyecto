package Tienda;

import Juego.Celda;
import Juego.GUI;
import Personajes.Torre;

public class TiendaVenderTorre extends TiendaEstado {

	@Override
	public void seleccionar(Torre t) {
		t.vender();
		GUI.getGUI().deseleccionarBotones();
		Tienda.getTienda().setEstado(new TiendaDefaultEstado());
	}

	@Override
	public void seleccionar(Celda c) {}

}
