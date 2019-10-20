package Juego;
import java.util.Iterator;
import java.util.LinkedList;

import Objetos.Obstaculo;
import Objetos.Proyectil;
import Personajes.Enemigo;
import Personajes.Leviatan;
import Personajes.Torre;

public class Mapa {
	protected Controlador controlador;
	protected Celda[][] grilla;
	protected int x=10;
	protected int y=6;
	protected Nivel nivel;
	protected Jugador jugador;
	protected LinkedList<Elemento> lista;
	protected boolean oleadaActiva;
	protected int cantEnemigos;
	
	public Mapa(int nivel,Controlador controlador) {
		lista=new LinkedList<Elemento>();
		this.nivel=new Nivel(nivel);
		jugador=new Jugador(this);
		this.controlador=controlador;
		grilla=new Celda[x][y];
		oleadaActiva=false;
		cantEnemigos=0;
		for(int i=0;i<y;i++)
			for(int j=0;j<x;j++)
				grilla[j][i]=new Celda(j,i);
	}
	
	public void activarOleada() {
		oleadaActiva=true;
		cantEnemigos=nivel.cantEnemigos();
	}
	
	public void crearProyectil(Proyectil proyectil) {
		lista.add(proyectil);
		controlador.crearElemento(proyectil);
	}

	public void actualizarPuntos(int puntos) {
		controlador.actualizarPuntos(puntos);
	}
	
	public void actuar() {
		Enemigo e;
		LinkedList<Elemento> listaAux=new LinkedList<Elemento>();
		for(Elemento el:lista)
			listaAux.addLast(el);
		for(Elemento el:listaAux) {
			el.actuar();
		}
		if(oleadaActiva) {
			if(cantEnemigos!=0) {
				for(int i=0;i<6;i++) {
					if(grilla[9][i].getElem()==null)
						if (nivel.quedanEnemigos(i)) {
							e=nivel.getEnemigo(i);
							e.setCelda(grilla[9][i]);
							e.setMapa(this);
							grilla[9][i].setElem(e);
							lista.add(e);
							controlador.crearElemento(e);
						}
				}
			}
			else {
				oleadaActiva=false;
				controlador.getGui().activarBotonOleada();
				if(!nivel.siguienteOleada())
					controlador.ganar();
			}
		}
	}
	
	public void decrementarEnemigos() {
		cantEnemigos--;
	}
	
	public void eliminarElemento(Elemento e) {
		int x=e.getCelda().getX();
		int y=e.getCelda().getY();
		if(grilla[x][y].getElem()==e) {
			grilla[x][y].setElem(null);
			if(e.getTamano()==2)
				grilla[x-1][y].setElem(null);
		}
		lista.remove(e);
	}
	
	public boolean puedeAvanzar(Enemigo e) {
		int celdaX=e.getCelda().getX();
		int celdaY=e.getCelda().getY();
		if(celdaX>0&&grilla[celdaX-1][celdaY].getElem()==null) 
			return true;
		else {
			if(celdaX==0)
				controlador.perder();
			return false;	
		}
	}
	
	public void avanzar(Enemigo e) {
		int celdaX=e.getCelda().getX();
		int celdaY=e.getCelda().getY();
		e.setCelda(grilla[celdaX-1][celdaY]);
		grilla[celdaX][celdaY].setElem(null);
		grilla[celdaX-1][celdaY].setElem(e);
	}
	
	public LinkedList<Elemento> elementosRango(Enemigo e){
		LinkedList<Elemento> lista=new LinkedList<Elemento>();
		int n=e.getAlcance();
		int x=e.getCelda().getX();
		int y=e.getCelda().getY();
		for(int i=x-1;i>=x-n&&i>=0;i--)
			if(grilla[i][y].getElem()!=null)
				lista.add(grilla[i][y].getElem());
		return lista;		
	}
	
	public LinkedList<Elemento> elementosRango(Torre t){
		LinkedList<Elemento> lista=new LinkedList<Elemento>();
		int n=t.getAlcance();
		int x=t.getCelda().getX();
		int y=t.getCelda().getY();
		for(int i=x+1;i<=x+n&&i<this.x;i++)
			if(grilla[i][y].getElem()!=null)
				lista.add(grilla[i][y].getElem());
		return lista;
	}
	
	public boolean crearElemento(Elemento elem,int x, int y) {
		if(elem.getTamano()==1&&grilla[x][y].getElem()==null) {
			grilla[x][y].setElem(elem);
			elem.setCelda(grilla[x][y]);
			lista.add(elem);
			return true;
		}else
			if(elem.getTamano()==2&&x<9&&grilla[x][y].getElem()==null&&grilla[x+1][y].getElem()==null) {
				grilla[x][y].setElem(elem);
				grilla[x+1][y].setElem(elem);
				elem.setCelda(grilla[x+1][y]);
				lista.add(elem);
				return true;
			}
		return false;
		
	}
	
	public boolean posicionValidaTorre(Torre t,int x,int y) {
		return (x>=0&&x<this.x-t.getTamano()&&y>=0&&y<this.y&&grilla[x][y].getElem()==null&&(t.getTamano()==1||grilla[x+1][y].getElem()==null));
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
