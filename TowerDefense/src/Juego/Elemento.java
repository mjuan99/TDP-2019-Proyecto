package Juego;

import javax.swing.JLabel;

import Visitor.*;

public abstract class Elemento {
	protected boolean vivo;
	protected int tamano;
	protected Celda celda;
	protected int vida;
	protected String rutaImagen;
	protected JLabel componenteGrafica;
	protected int contadorPulsos;
	protected int topePulso;
	protected Visitor visitor;
	
	protected Elemento(Celda celda,int vidaMax,int tamano,String rutaImagen) {
		vivo=true;
		this.celda=celda;
		vida=vidaMax;
		this.tamano=tamano;
		this.rutaImagen=rutaImagen;
		contadorPulsos=0;
		topePulso=10;
	}
	
	public int getTamano() {
		return tamano;
	}
	
	public void danar(Elemento atacante,int dano) {
		if(vida<=dano) {
			vida=0;
			morir();
		}
		else
			vida-=dano;
	}
	
	public boolean estaVivo() {
		return vivo;
	}
	
	public void setVivo(boolean vivo) {
		this.vivo=vivo;
	}
	
	public abstract void accept(Visitor v);
	
	public void morir() {
		if (vivo) {
			Mapa.getMapa().eliminarElemento(this);
			vivo = false;
			GUI.getGUI().eliminarComponente(componenteGrafica);
		}
	}
	
	public Celda getCelda() {
		return celda;
	}
	
	public JLabel getComponenteGrafica() {
		return componenteGrafica;
	}
	
	public void setComponenteGrafica(JLabel componenteGrafica) {
		this.componenteGrafica=componenteGrafica;
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
