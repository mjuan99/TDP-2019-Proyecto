package Objetos;

import Juego.Celda;
import Visitor.Visitor;

public abstract class ObjetoJugadorVida extends ObjetoJugador {
	protected String nombre;

	protected ObjetoJugadorVida(Celda celda, int vidaMax,int tamano, String rutaImagen,String mini,String nombre,int precio) {
		super(celda, vidaMax,tamano, rutaImagen,mini,precio);
		this.nombre=nombre;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void actuar() {}
	
	public String descripcion() {
		String cadena="";
		cadena+=(nombre+"\nVida: "+vida+"\nPrecio: "+precio);
		return cadena;
	}

}
