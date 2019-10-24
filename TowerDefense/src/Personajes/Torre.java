package Personajes;
import java.util.Iterator;

import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;
import Objetos.ProyectilAliado;
import Visitor.Visitor;
import Visitor.VisitorAliado;

public abstract class Torre extends Personaje{
	
	protected Torre(Celda celda,int vidaMax,int tamano,String rutaImagen,int dano,int alcance,String rutaProyectil) {
		super(celda,vidaMax,tamano,rutaImagen,dano,alcance,rutaProyectil);
		visitor=new VisitorAliado(this);
	}
	public void atacar() {
		ataco=true;
		Mapa.getMapa(0).crearProyectil(new ProyectilAliado(celda, dano,alcance,rutaProyectil));
			
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void accept() {
		visitor.visit(this);
	}
	
	public void actuar() {
		Iterator<Elemento> it=Mapa.getMapa(0).elementosRango(this).iterator();
		if(contadorPulsos==0) {
			ataco=false;
			while(!ataco&&it.hasNext())
				it.next().accept(visitor);
			if(ataco)
				contadorPulsos=(contadorPulsos+1)%topePulso;
		}else
			contadorPulsos=(contadorPulsos+1)%topePulso;
	}
}
