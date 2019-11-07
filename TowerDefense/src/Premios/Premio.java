
package Premios;


import Juego.Celda;
import Juego.Elemento;

public abstract class Premio extends Elemento {
	


	protected Premio(Celda celda,int tamano, String rutaImagen) {
		super(celda, 50,tamano, rutaImagen);
	}
	
	public void actuar() {
		vida--;
		if(vida==0)
			morir();
	}
	
	public void danar(Elemento atacante,int dano) {}
}
