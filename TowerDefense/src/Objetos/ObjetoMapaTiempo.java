package Objetos;

import Juego.Celda;
import Juego.Elemento;
import Visitor.Visitor;

public abstract class ObjetoMapaTiempo extends ObjetoMapa{
	
	protected int tiempo;

	protected ObjetoMapaTiempo(Celda celda, int vidaMax,int tamano, String rutaImagen, int tiempo) {
		super(celda, vidaMax,tamano, rutaImagen);
		this.tiempo=tiempo;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	@Override
	public void actuar() {
		tiempo--;
		if(tiempo==0)
			morir();
	}
	
	public void danar(Elemento atacante,int dano) {}

}
