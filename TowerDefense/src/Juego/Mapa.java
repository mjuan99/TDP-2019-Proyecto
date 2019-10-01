package Juego;
import java.util.Iterator;
import java.util.LinkedList;

import Objetos.Proyectil;
import Personajes.Enemigo;
import Personajes.Torre;

public class Mapa {
	protected Controlador controlador;
	protected Celda[][] grilla;
	protected int x=10;
	protected int y=6;
	protected Nivel nivel;
	protected Jugador jugador;
	protected LinkedList<Elemento> lista;
	
	public Mapa(Nivel nivel,Controlador controlador) {
		lista=new LinkedList<Elemento>();
		this.nivel=new Nivel(500);
		jugador=new Jugador(this);
		this.nivel=nivel;
		this.controlador=controlador;
		grilla=new Celda[x][y];
		for(int i=0;i<y;i++)
			for(int j=0;j<x;j++)
				grilla[j][i]=new Celda(j,i);
	}
	
	public void crearProyectil(Proyectil proyectil) {
		lista.add(proyectil);
		
	}
	
	public void actualizarPuntos(int puntos) {
		controlador.actualizarPuntos(puntos);
	}
	
	public void actuar() {
		LinkedList<Elemento> listaAux=new LinkedList<Elemento>();
		for(Elemento el:lista)
			listaAux.addLast(el);
		for(Elemento el:listaAux) {
			el.actuar();
		}
		/*Elemento e;
		for(int i=0;i<x;i++)
			for(int j=0;j<y;j++) {
				e=grilla[i][j].getElem();
				if(e!=null) {
					e.actuar();
				}
			}*/
	}
	
	public void eliminarElemento(Elemento e) {
		grilla[e.getCelda().getX()][e.getCelda().getY()].setElem(null);
		e.setCelda(null);
		lista.remove(e);
	}
	
	public boolean puedeAvanzar(Enemigo e) {
		int celdaX=e.getCelda().getX();
		int celdaY=e.getCelda().getY();
		if(celdaX>0&&grilla[celdaX-1][celdaY].getElem()==null) 
			return true;
		else
			return false;
	}
	
	public void avanzar(Enemigo e) {
		int celdaX=e.getCelda().getX();
		int celdaY=e.getCelda().getY();
		e.setCelda(grilla[celdaX-1][celdaY]);
		grilla[celdaX][celdaY].setElem(null);
		grilla[celdaX-1][celdaY].setElem(e);
		//controlador.mover(e,celdaX-1,celdaY);
	}
	
	public void crearTorre(Torre torre,int x,int y) {
		if(grilla[x][y].getElem()==null) {
			grilla[x][y].setElem(torre);
			torre.setCelda(grilla[x][y]);
			lista.add(torre);
		}
	}
	
	public void crearEnemigo(Enemigo enemigo,int x,int y) {
		grilla[x][y].setElem(enemigo);
		enemigo.setCelda(grilla[x][y]);
		lista.add(enemigo);
	}
	
	public boolean posicionValidaTorre(int x,int y) {
		return (x>=0&&x<this.x-1&&y>=0&&y<this.y&&grilla[x][y].getElem()==null);
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
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Controlador getControlador() {
		return controlador;
	}
}
