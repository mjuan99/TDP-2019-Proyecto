package Objetos;

import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;

public abstract class Proyectil extends Elemento{
	protected Elemento creador;
	protected int dano;
	protected int rango;
	protected String rutaImagen;
	protected boolean moviendo=false;
	protected int celdaDestino;
	public Proyectil(Celda celda,Elemento creador, int dano,int rango,int tamano,String rutaImagen) {//agregar celda y entidad de donde se crea
		super(celda,1,tamano,rutaImagen);
		this.creador=creador;
		this.dano=dano;
		this.rango=rango;
		this.rutaImagen=rutaImagen;
	}
	
	public void accept() {
		visitor.visit(this);
	}
	
	public Elemento getCreador() {
		return creador;
	}
	
	public String getRutaImagen() {
		return rutaImagen;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}
}
