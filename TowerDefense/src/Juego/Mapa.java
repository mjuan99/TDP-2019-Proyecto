package Juego;
import Personajes.Enemigo;
import Personajes.Torre;

public class Mapa {
	Controlador controlador;
	Celda[][] grilla;
	final static int x=10;
	final static int y=6;
	Nivel nivel;
	Jugador jugador;
	
	public Mapa(Nivel nivel,Jugador jugador,Controlador controlador) {
		this.nivel=nivel;
		this.jugador=jugador;
		this.controlador=controlador;
		grilla=new Celda[x][y];
		for(int i=0;i<y;i++)
			for(int j=0;j<x;j++)
				grilla[j][i]=new Celda(j,i);
	}
	
	public void actuar() {
		Elemento e;
		for(int i=0;i<x;i++)
			for(int j=0;j<y;j++) {
				e=grilla[i][j].getElem();
				if(e!=null) {
					e.actuar();
				}
			}
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
