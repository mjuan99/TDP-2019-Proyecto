package Objetos;

import Juego.Celda;

public  abstract class ObstaculoTiempo extends Obstaculo {
	
	protected int tiempo;
	protected String nombre;

	protected ObstaculoTiempo(Celda celda, int vidaMax,int tamano, String rutaImagen, int tiempo, String mini,String nombre,int precio) {
		super(celda, vidaMax,tamano, rutaImagen,mini,precio);
		this.tiempo=tiempo;
		this.nombre=nombre;
		// TODO Auto-generated constructor stub
	}

	public String descripcion() {
		String cadena="";
		cadena+=(nombre+"\nDuracion: "+tiempo+"\nTiempo: "+precio);
		return cadena;
	}
	@Override
	public void actuar() {
		vida--;
		if(vida==0)
			morir();
	}

}
