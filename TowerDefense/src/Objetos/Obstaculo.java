package Objetos;

import Juego.Celda;
import Juego.Elemento;

public abstract class Obstaculo extends Elemento {
	
	protected String mini;
	protected int precio;
	
	protected Obstaculo(Celda celda, int vidaMax,int tamano, String rutaImagen,String mini,int precio) {
		super(celda, vidaMax,tamano, rutaImagen);
		this.mini=mini;
		this.precio=precio;
		// TODO Auto-generated constructor stub
	}
	
	public abstract String descripcion();
	
	public String getMiniatura() {
		return mini;
	}

	public int getPrecio() {
		return precio;
	}
	
	public abstract Obstaculo nuevo();
	
}
