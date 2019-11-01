package Personajes;
import Juego.Celda;
import Juego.Elemento;

public abstract class Personaje extends Elemento {
	protected int dano;
	protected int alcance;
	protected int vidaMax=200;
	protected String rutaProyectil;
	protected boolean ataco;

	
	protected Personaje(Celda celda,int vidaMax,int tamano,String rutaImagen,int dano,int alcance,String rutaProyectil) {
		super(celda,vidaMax,tamano,rutaImagen);
		this.dano=dano;
		this.alcance=alcance;
		this.rutaProyectil=rutaProyectil;
		ataco=false;
	}
	public int getAlcance() {
		return alcance;
	}
	
}
