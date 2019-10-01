package Objetos;

import Juego.*;

public class ProyectilAliado extends Proyectil {
	public ProyectilAliado(Mapa mapa, Celda celda, int dano,int rango,String rutaImagen) {//agregar celda y entidad de donde se crea
		super(mapa, celda, dano,rango,rutaImagen);
	}
	
	public void actuar() {
		
	}
}
