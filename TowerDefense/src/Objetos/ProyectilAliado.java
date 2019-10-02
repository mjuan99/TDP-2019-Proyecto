package Objetos;

import java.awt.Rectangle;

import Juego.*;
import Personajes.Enemigo;

public class ProyectilAliado extends Proyectil {
	public ProyectilAliado(Mapa mapa, Celda celda, int dano,int rango,String rutaImagen) {//agregar celda y entidad de donde se crea
		super(mapa, celda, dano,rango,rutaImagen);
	}
	
	public void actuar() {
		Rectangle r=componenteGrafica.getBounds();
		if(!moviendo) {
			celdaDestino=celda.getX()+1;
			moviendo=true;
	}
		if(celdaDestino*96>componenteGrafica.getBounds().getX()) 
			componenteGrafica.setBounds((int)r.getX()+24,(int)r.getY(),96,96);
		else{
			if(celdaDestino<mapa.getX()-1&&rango>0) {
				/*if(mapa.getGrilla()[celdaDestino][celda.getY()].getElem() instanceof Enemigo) {//PATRON VISITOR
					((Enemigo)mapa.getGrilla()[celdaDestino][celda.getY()].getElem()).danar(dano);
					mapa.eliminarElemento(this);
					componenteGrafica.setIcon(null);
				}
				else */{
					celda=mapa.getGrilla()[celdaDestino][celda.getY()];
					moviendo=false;
					rango--;
				}
			}
			else{
				mapa.eliminarElemento(this);
				componenteGrafica.setIcon(null);
			}
		}
	}
}
