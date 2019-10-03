package Objetos;

import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;

public abstract class Proyectil extends Elemento{
	protected int dano;
	protected int rango;
	protected String rutaImagen;
	protected boolean moviendo=false;
	protected int celdaDestino;
	public Proyectil(Mapa mapa, Celda celda, int dano,int rango,String rutaImagen) {//agregar celda y entidad de donde se crea
		super(mapa,celda,1,rutaImagen);
		this.dano=dano;
		this.rango=rango;
		this.rutaImagen=rutaImagen;
	}
	
	public void accept() {
		visitor.visit(this);
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
