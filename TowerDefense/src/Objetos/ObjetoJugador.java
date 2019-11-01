package Objetos;

import Juego.Celda;

public abstract class ObjetoJugador extends Objeto {
	
	protected String mini;
	protected int precio;
	
	protected ObjetoJugador(Celda celda, int vidaMax,int tamano, String rutaImagen,String mini,int precio) {
		super(celda, vidaMax,tamano, rutaImagen);
		this.mini=mini;
		this.precio=precio;
	}
	
	public abstract String descripcion();
	
	public String getMiniatura() {
		return mini;
	}

	public int getPrecio() {
		return precio;
	}
	
	public abstract ObjetoJugador nuevo();
	
}
