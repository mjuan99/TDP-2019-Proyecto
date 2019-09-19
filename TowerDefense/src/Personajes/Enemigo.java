package Personajes;

import Juego.Celda;
import Juego.Mapa;
import Objetos.ProyectilEnemigo;

public abstract class Enemigo extends Personaje{
	
	protected Enemigo(Mapa mapa,Celda celda,int vidaMax,String rutaImagen,int dano,int alcance,String rutaProyectil) {
		super(mapa,celda,vidaMax,rutaImagen,dano,alcance,rutaProyectil);
	}
	
	public ProyectilEnemigo Atacar() {
		return new ProyectilEnemigo(dano,alcance,rutaProyectil);
	}
	
	public void actuar() {
		if(mapa.puedeAvanzar(this))
			mapa.avanzar(this);
	}
	public void setMapa(Mapa mapa) {
		this.mapa=mapa;
	}
}
