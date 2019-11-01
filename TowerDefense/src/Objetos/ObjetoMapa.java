package Objetos;

import Juego.Celda;

public abstract class ObjetoMapa extends Objeto {
	
	protected ObjetoMapa(Celda celda, int vidaMax,int tamano, String rutaImagen) {
		super(celda, vidaMax,tamano, rutaImagen);
	}

}
