package Juego;
import Personajes.Enemigo;
import Personajes.Torre;

public class Mapa {
	Celda[][] grilla;
	final static int x=12;
	final static int y=8;
	Nivel nivel;
	Jugador jugador;
	
	public Mapa(Nivel nivel,Jugador jugador) {
		this.nivel=nivel;
		this.jugador=jugador;
		grilla=new Celda[x][y];
		for(int i=0;i<y;i++)
			for(int j=0;j<x;j++)
				grilla[j][i]=new Celda(j,i);
	}
	
	public void crearTorre(Torre torre,int x,int y) {
		if(grilla[x][y].getElem()==null) {
			grilla[x][y].setElem(torre);
			torre.setCelda(grilla[x][y]);
		}
	}
	
	public void crearEnemigo(Enemigo enemigo,int x,int y) {
		grilla[x][y].setElem(enemigo);
		enemigo.setCelda(grilla[x][y]);
	}

	public Celda[][] getGrilla() {
		return grilla;
	}

	public void setGrilla(Celda[][] grilla) {
		this.grilla = grilla;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
}
