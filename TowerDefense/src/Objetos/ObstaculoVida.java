package Objetos;

import Juego.Celda;
import Juego.Mapa;

public abstract class ObstaculoVida extends Obstaculo {

	protected ObstaculoVida(Celda celda, int vidaMax,int tamano, String rutaImagen) {
		super(celda, vidaMax,tamano, rutaImagen);
	}
	
	public void actuar() {}

}
