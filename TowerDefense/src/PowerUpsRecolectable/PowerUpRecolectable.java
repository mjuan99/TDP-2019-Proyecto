
package PowerUpsRecolectable;


import Juego.Celda;
import Juego.Elemento;

public abstract class PowerUpRecolectable extends Elemento {
	


	protected PowerUpRecolectable(Celda celda, int vidaMax,int tamano, String rutaImagen) {
		super(celda, vidaMax,tamano, rutaImagen);

		// TODO Auto-generated constructor stub
	}
	
	public void actuar() {
		vida--;
		if(vida==0)
			morir();
	}
	
	public void danar(Elemento atacante,int dano) {}
}
