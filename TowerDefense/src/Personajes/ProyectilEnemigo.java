package Personajes;

import java.awt.Rectangle;

import Juego.*;
import Visitor.Visitor;
import Visitor.VisitorProyectilEnemigo;

public class ProyectilEnemigo extends Proyectil {
	protected static int tam=1;
	public ProyectilEnemigo(Celda celda,Elemento creador, int dano,int rango,String rutaImagen) {//agregar celda y entidad de donde se crea
		super(celda, creador,dano,rango,tam,rutaImagen);
		visitor=new VisitorProyectilEnemigo(this);
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void actuar() {
		Rectangle r=componenteGrafica.getBounds();
		if(!moviendo) {
			celdaDestino=celda.getX()-1;
			moviendo=true;
		}
		if(celda.getElem()!=null)
			celda.getElem().accept(visitor);
		if(celdaDestino*96<componenteGrafica.getBounds().getX()) 
			componenteGrafica.setBounds((int)r.getX()-24,(int)r.getY(),96,96);
		else{
			if(celdaDestino>=0&&rango>0) {
				celda=Mapa.getMapa().getGrilla()[celdaDestino][celda.getY()];
				componenteGrafica.setBounds((int)r.getX()-24,(int)r.getY(),96,96);
				moviendo=false;
				rango--;
			}
			else{
				morir();
			}
		}
	}
}
