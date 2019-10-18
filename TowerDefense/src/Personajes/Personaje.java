package Personajes;
import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;

public abstract class Personaje extends Elemento {
	protected int dano;
	protected int alcance;
	protected int vidaMax=200;
	protected String rutaProyectil;
	
	protected Personaje(Mapa mapa,Celda celda,int vidaMax,int tamano,String rutaImagen,int dano,int alcance,String rutaProyectil) {
		super(mapa,celda,vidaMax,tamano,rutaImagen);
		this.dano=dano;
		this.alcance=alcance;
		this.rutaProyectil=rutaProyectil;
	}
	public int getDano() {
		return dano;
	}
	
	public void actuar() {}
	
	public void setDano(int dano) {
		this.dano = dano;
	}
	public int getAlcance() {
		return alcance;
	}
	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}
}
