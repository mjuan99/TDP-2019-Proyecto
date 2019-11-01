package Objetos;

import Juego.Celda;
import Juego.Elemento;
import Visitor.Visitor;

public  abstract class ObjetoJugadorTiempo extends ObjetoJugador {
	
	protected int tiempo;
	protected String nombre;

	protected ObjetoJugadorTiempo(Celda celda, int vidaMax,int tamano, String rutaImagen, int tiempo, String mini,String nombre,int precio) {
		super(celda, vidaMax,tamano, rutaImagen,mini,precio);
		this.tiempo=tiempo;
		this.nombre=nombre;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}

	public String descripcion() {
		String cadena="";
		cadena+=(nombre+"\nDuracion: "+tiempo/10+" seg"+"\nPrecio: "+precio);
		return cadena;
	}
	@Override
	public void actuar() {
		tiempo--;
		if(tiempo==0)
			morir();
	}
	
	public void danar(Elemento atacante,int dano) {}

}
