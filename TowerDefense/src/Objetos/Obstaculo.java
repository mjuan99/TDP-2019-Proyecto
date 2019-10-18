package Objetos;

import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;
import Visitor.Visitor;

public abstract class Obstaculo extends Elemento {
	
	protected Obstaculo(Mapa mapa, Celda celda, int vidaMax,int tamano, String rutaImagen) {
		super(mapa, celda, vidaMax,tamano, rutaImagen);
		// TODO Auto-generated constructor stub
	}
	
}
