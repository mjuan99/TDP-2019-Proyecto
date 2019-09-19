package Personajes;

import java.awt.Rectangle;

import Juego.Celda;
import Juego.Mapa;
import Objetos.ProyectilEnemigo;

public abstract class Enemigo extends Personaje{
	protected int contadorMov=0;
	protected boolean moviendo=false;
	protected int celdaDestino;
	
	protected Enemigo(Mapa mapa,Celda celda,int vidaMax,String rutaImagen,int dano,int alcance,String rutaProyectil) {
		super(mapa,celda,vidaMax,rutaImagen,dano,alcance,rutaProyectil);
	}
	
	public ProyectilEnemigo Atacar() {
		return new ProyectilEnemigo(dano,alcance,rutaProyectil);
	}
	
	public void actuar() {
		Rectangle r=yo.getBounds();
		if(!moviendo) {
			if(mapa.puedeAvanzar(this)) {
				celdaDestino=celda.getX()-1;
				mapa.avanzar(this);
				moviendo=true;
			}
		}
		else
			if(celdaDestino*96<yo.getBounds().getX()) 
				yo.setBounds((int)r.getX()-4,(int)r.getY(),96,96);
			else
				moviendo=false;
	}
	public void setMapa(Mapa mapa) {
		this.mapa=mapa;
	}
}
