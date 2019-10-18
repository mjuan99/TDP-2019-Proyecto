package Objetos;

import Juego.Celda;
import Juego.Mapa;

public abstract class ObstaculoVida extends Obstaculo {

	protected ObstaculoVida(Mapa mapa, Celda celda, int vidaMax,int tamano, String rutaImagen) {
		super(mapa, celda, vidaMax,tamano, rutaImagen);
	}
	
	public void actuar() {}

}
