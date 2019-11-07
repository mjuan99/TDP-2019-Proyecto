package Premios;

import Juego.Celda;

public abstract class ObjetoPreciosoRecolectable extends Premio {

	protected ObjetoPreciosoRecolectable( Celda celda, int tamano, String rutaImagen) {
		super(celda, tamano, rutaImagen);
	}

}
