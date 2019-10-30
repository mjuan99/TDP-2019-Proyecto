package Objetos;

import Juego.Celda;

public  abstract class ObstaculoTiempo extends Obstaculo {

	protected ObstaculoTiempo(Celda celda, int vidaMax,int tamano, String rutaImagen) {
		super(celda, vidaMax,tamano, rutaImagen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actuar() {
		vida--;
		if(vida==0)
			morir();
	}

}
