package Juego;

import javax.swing.JLabel;

import Visitor.*;

public abstract class Elemento {
	protected boolean vivo;
	protected int tamano;
	protected Celda celda;
	protected int vida;
	protected String rutaImagen;
	protected Mapa mapa;
	protected JLabel componenteGrafica;
	protected int contadorPulsos=0;
	protected int topePulso=10;
	protected Visitor visitor;
	
	protected Elemento(Mapa mapa,Celda celda,int vidaMax,int tamano,String rutaImagen) {
		vivo=true;
		this.celda=celda;
		vida=vidaMax;
		this.tamano=tamano;
		this.rutaImagen=rutaImagen;
		this.mapa=mapa;
	}
	
	public int getTamano() {
		return tamano;
	}
	
	public void danar(int dano) {
		if(vida<=dano)
			morir();
		else
			vida-=dano;
	}
	
	public boolean estaVivo() {
		return vivo;
	}
	
	public abstract void accept(Visitor v);
	
	public void morir() {
		mapa.eliminarElemento(this);
		componenteGrafica.setIcon(null);
		componenteGrafica.setBounds(0,0,0,0);
		vivo=false;
		GUI.getGUI().eliminarComponente(componenteGrafica);
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
	
	public Mapa getMapa() {
		return mapa;
	}
	
	public void setMapa(Mapa mapa) {
		this.mapa=mapa;
	}
}
