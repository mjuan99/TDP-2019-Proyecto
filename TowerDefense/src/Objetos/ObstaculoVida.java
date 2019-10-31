package Objetos;

import Juego.Celda;

public abstract class ObstaculoVida extends Obstaculo {
	protected String nombre;

	protected ObstaculoVida(Celda celda, int vidaMax,int tamano, String rutaImagen,String mini,String nombre,int precio) {
		super(celda, vidaMax,tamano, rutaImagen,mini,precio);
		this.nombre=nombre;
	}
	
	public void actuar() {}
	
	public String descripcion() {
		String cadena="";
		cadena+=("Nombre"+nombre+"\nVida: "+vida+"\nPrecio: "+precio);
		return cadena;
	}

}
