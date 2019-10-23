package Juego;
import java.util.Iterator;
import java.util.LinkedList;

import Objetos.Obstaculo;
import Objetos.Proyectil;
import Personajes.Enemigo;
import Personajes.Leviatan;
import Personajes.Torre;
import PowerUps.PowerUp;

public class Mapa {
	protected Controlador controlador;
	protected Celda[][] grilla;
	protected int x=10;
	protected int y=6;
	protected Nivel nivel;
	protected Jugador jugador;
	protected LinkedList<Elemento> lista;
	protected LinkedList<Elemento> listaTorres;
	
	public Mapa(Nivel nivel,Controlador controlador) {
		lista=new LinkedList<Elemento>();
		listaTorres= new LinkedList<Elemento>();
		this.nivel=new Nivel(500);
		jugador=new Jugador(this);
		this.nivel=nivel;
		this.controlador=controlador;
		grilla=new Celda[x][y];
		for(int i=0;i<y;i++)
			for(int j=0;j<x;j++)
				grilla[j][i]=new Celda(j,i);
	}
	
	public void crearPowerUp(PowerUp powerup, int x, int y) {
		if (grilla[x][y].getElem()==null) {
			grilla[x][y].setElem(powerup);
			powerup.setCelda(grilla[x][y]);
			lista.add(powerup);
		}
		//controlador.crearElemento(powerup);
		
	}
	
	public void crearProyectil(Proyectil proyectil) {
		lista.add(proyectil);
		controlador.crearElemento(proyectil);
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
		int x=e.getCelda().getX();
		int y=e.getCelda().getY();
		if(grilla[x][y].getElem()==e)
			grilla[e.getCelda().getX()][e.getCelda().getY()].setElem(null);
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
	
	public void crearObstaculo(Obstaculo obs,int x,int y) {
		if(grilla[x][y].getElem()==null) {
			grilla[x][y].setElem(obs);
			obs.setCelda(grilla[x][y]);
			lista.add(obs);
		}
	}
	
	public boolean crearTorre(Leviatan l,int x,int y) {
		if(x<8&&grilla[x][y].getElem()==null&&grilla[x+1][y].getElem()==null) {
			grilla[x][y].setElem(l);
			grilla[x+1][y].setElem(l);
			l.setCelda(grilla[x][y]);
			lista.add(l);
			listaTorres.add(l);
			return true;
		}
		return false;
		
	}
	
	public boolean crearTorre(Torre torre,int x,int y) {
		System.out.println("Hola");
		if(torre.getTamano()==1&&grilla[x][y].getElem()==null) {
			grilla[x][y].setElem(torre);
			torre.setCelda(grilla[x][y]);
			lista.add(torre);
			listaTorres.add(torre);
			return true;
		}else
			if(torre.getTamano()==2&&x<8&&grilla[x][y].getElem()==null&&grilla[x+1][y].getElem()==null) {
				grilla[x][y].setElem(torre);
				grilla[x+1][y].setElem(torre);
				torre.setCelda(grilla[x][y]);
				lista.add(torre);
				listaTorres.add(torre);
				return true;
			}
		return false;
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
	//agregue este metodo
	public Elemento getElemento(int x, int y ) {
		return grilla[x][y].getElem();
		
	}
	
	public LinkedList<Elemento> getTorres() {
		return listaTorres;
	}
}
