package Objetos;

import java.awt.Rectangle;

import Juego.*;
import Personajes.Enemigo;
import Visitor.Visitor;
import Visitor.VisitorProyectilAliado;

public class ProyectilAliado extends Proyectil {
	protected static int tam=1;
	public ProyectilAliado(Mapa mapa, Celda celda, int dano,int rango,String rutaImagen) {//agregar celda y entidad de donde se crea
		super(mapa, celda, dano,rango,tam,rutaImagen);
		visitor=new VisitorProyectilAliado(this);
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void actuar() {
		Rectangle r=componenteGrafica.getBounds();
		if(!moviendo) {
			celdaDestino=celda.getX()+1;
			moviendo=true;
		}
		if(celda.getElem()!=null)
			celda.getElem().accept(visitor);
		if(celdaDestino*96>componenteGrafica.getBounds().getX()) 
			componenteGrafica.setBounds((int)r.getX()+24,(int)r.getY(),96,96);
		else{
			if(celdaDestino<mapa.getX()-1&&rango>0) {
				celda=mapa.getGrilla()[celdaDestino][celda.getY()];
				componenteGrafica.setBounds((int)r.getX()+24,(int)r.getY(),96,96);
				moviendo=false;
				rango--;
			}
			else{
				morir();
			}
		}
	}
}
