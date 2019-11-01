
package PowerUpsRecolectable;


import Juego.Celda;
import Juego.Elemento;
import Juego.GUI;

public abstract class PowerUpRecolectable extends Elemento {
	


	protected PowerUpRecolectable(Celda celda,int tamano, String rutaImagen) {
		super(celda, 50,tamano, rutaImagen);
	}
	
	public void actuar() {
		GUI.getGUI().getContentPane().setComponentZOrder(componenteGrafica, 0);
		vida--;
		if(vida==0)
			morir();
	}
	
	public void danar(Elemento atacante,int dano) {}
}
