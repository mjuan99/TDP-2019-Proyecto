package Objetos;

import Juego.Celda;
import Juego.Elemento;

public abstract class Objeto extends Elemento {
	
	protected Objeto(Celda celda, int vidaMax,int tamano, String rutaImagen) {
		super(celda, vidaMax,tamano, rutaImagen);
	}

}
