package Objetos;

import Juego.Celda;
import Juego.Mapa;

public  abstract class ObstaculoTiempo extends Obstaculo {

	protected ObstaculoTiempo(Mapa mapa, Celda celda, int vidaMax,int tamano, String rutaImagen) {
		super(mapa, celda, vidaMax,tamano, rutaImagen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actuar() {
		vida--;
		if(vida==0)
			morir();
	}

}
