package Objetos;

import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;
import Visitor.Visitor;

public abstract class Obstaculo extends Elemento {
	
	protected Obstaculo(Celda celda, int vidaMax,int tamano, String rutaImagen) {
		super(celda, vidaMax,tamano, rutaImagen);
		// TODO Auto-generated constructor stub
	}
	
}
