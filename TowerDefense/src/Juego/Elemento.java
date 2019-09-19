package Juego;

import javax.swing.JLabel;

public abstract class Elemento {
	protected Celda celda;
	protected int vida;
	protected String rutaImagen;
	protected Mapa mapa;
	protected JLabel yo;
	
	protected Elemento(Mapa mapa,Celda celda,int vidaMax,String rutaImagen) {
		this.celda=celda;
		vida=vidaMax;
		this.rutaImagen=rutaImagen;
		this.mapa=mapa;
	}
	
	public Celda getCelda() {
		return celda;
	}
	
	public JLabel getComponenteGrafica() {
		return yo;
	}
	
	public void setComponenteGrafica(JLabel componenteGrafica) {
		yo=componenteGrafica;
	}
	
	public abstract void actuar();

	public void setCelda(Celda celda) {
		this.celda = celda;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public String getRutaImagen() {
		return rutaImagen;
	}
	
	
}
