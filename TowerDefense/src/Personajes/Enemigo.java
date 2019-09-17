package Personajes;

import Juego.Mapa;

public abstract class Enemigo extends Personaje{
	public void actuar() {
		if(mapa.puedeAvanzar(this))
			mapa.avanzar(this);
	}
	public void setMapa(Mapa mapa) {
		this.mapa=mapa;
	}
}
