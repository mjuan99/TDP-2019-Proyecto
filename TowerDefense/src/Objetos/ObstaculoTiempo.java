package Objetos;

import Juego.Celda;
import Visitor.Visitor;

public  abstract class ObstaculoTiempo extends Obstaculo {
	
	protected int tiempo;
	protected String nombre;

	protected ObstaculoTiempo(Celda celda, int vidaMax,int tamano, String rutaImagen, int tiempo, String mini,String nombre,int precio) {
		super(celda, vidaMax,tamano, rutaImagen,mini,precio);
		this.tiempo=tiempo;
		this.nombre=nombre;
		// TODO Auto-generated constructor stub
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}

	public String descripcion() {
		String cadena="";
		cadena+=(nombre+"\nDuracion: "+tiempo+"\nTiempo: "+precio);
		return cadena;
	}
	@Override
	public void actuar() {
		tiempo--;
		if(tiempo==0)
			morir();
	}

}
