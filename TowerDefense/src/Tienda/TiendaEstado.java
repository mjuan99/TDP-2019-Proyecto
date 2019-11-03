package Tienda;

import Juego.Celda;
import Personajes.Torre;

public abstract class TiendaEstado {
	public abstract void seleccionar(Torre t);
	public abstract void seleccionar(Celda c);
}
