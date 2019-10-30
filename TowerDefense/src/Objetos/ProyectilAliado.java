package Objetos;

import java.awt.Rectangle;

import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;
import Visitor.Visitor;
import Visitor.VisitorProyectilAliado;

public class ProyectilAliado extends Proyectil {
	protected static int tam=1;
	public ProyectilAliado(Celda celda,Elemento creador, int dano,int rango,String rutaImagen) {//agregar celda y entidad de donde se crea
		super(celda,creador, dano,rango,tam,rutaImagen);
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
		if (vivo) {
			if (celdaDestino * 96 > componenteGrafica.getBounds().getX())
				componenteGrafica.setBounds((int) r.getX() + 24, (int) r.getY(), 96, 96);
			else {
				celda = Mapa.getMapa().getGrilla()[celdaDestino][celda.getY()];
				if (celdaDestino < Mapa.getMapa().getX()-1 && rango > 1) {
					componenteGrafica.setBounds((int) r.getX() + 24, (int) r.getY(), 96, 96);
					moviendo = false;
					rango--;
				} else {
					if(celda.getElem()!=null)
						celda.getElem().accept(visitor);
					if(vivo)
						morir();
				}
			} 
		}
	}
}
