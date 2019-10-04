package Objetos;

import Juego.*;
import Visitor.Visitor;
import Visitor.VisitorProyectilEnemigo;

public class ProyectilEnemigo extends Proyectil {
	public ProyectilEnemigo(Mapa mapa, Celda celda, int dano,int rango,String rutaImagen) {//agregar celda y entidad de donde se crea
		super(mapa, celda, dano,rango,rutaImagen);
		visitor=new VisitorProyectilEnemigo(this);
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void actuar() {
		
	}
}
