package Objetos;

import Juego.*;

public class ProyectilEnemigo extends Proyectil {
	public ProyectilEnemigo(Mapa mapa, Celda celda, int dano,int rango,String rutaImagen) {//agregar celda y entidad de donde se crea
		super(mapa, celda, dano,rango,rutaImagen);
	}
	
	public void actuar() {
		
	}
}
