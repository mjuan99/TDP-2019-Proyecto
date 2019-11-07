package Juego;
import java.util.LinkedList;
import java.util.Queue;

import EstadosEnemigo.EstadoProtegidoEnemigo;
import Objetos.ObjetoMapa;
import Personajes.Enemigo;
import Personajes.Torre;
import Visitor.Visitor;

public class Mapa {
	private static Mapa mapa;
	protected Celda[][] grilla;
	protected int x=10;
	protected int y=6;
	protected Nivel nivel;
	protected LinkedList<Elemento> lista;
	protected boolean oleadaActiva;
	protected int cantEnemigos;
	
	private Mapa() {
		lista=new LinkedList<Elemento>();
		grilla=new Celda[x][y];
		oleadaActiva=false;
		cantEnemigos=0;
		for(int i=0;i<y;i++)
			for(int j=0;j<x;j++)
				grilla[j][i]=new Celda(j,i);
	}
	
	public void setNivel(int nivel) {
		this.nivel=new Nivel(nivel);
	}
	
	public static Mapa getMapa() {
		if(mapa==null) {
			return (mapa= new Mapa());
		}
		else {
			return mapa;
		}
	}
	
	public void limpiar() {
		Elemento e;
		oleadaActiva=false;
		cantEnemigos=0;
		GUI.getGUI().activarBotonOleada();
		while(!lista.isEmpty()) {
			e=lista.removeFirst();
			e.setVivo(false);
			GUI.getGUI().eliminarComponente(e.getComponenteGrafica());
		}
		for(int i=0;i<x;i++)
			for(int j=0;j<y;j++) {
				grilla[i][j].setElem(null);
			}
	}
		
	public void activarOleada() {
		int intentos;
		oleadaActiva=true;
		cantEnemigos=nivel.cantEnemigos();
		Queue<ObjetoMapa> obstaculos=nivel.getColaObstaculos();
		int x=(int)(Math.random()*6+2);
		int y=(int)(Math.random()*6);
		ObjetoMapa o;
		while(!obstaculos.isEmpty()) {
			intentos=0;
			o=obstaculos.poll();
			while(grilla[x][y].getElem()!=null&&intentos<10) {
				x=(int)(Math.random()*6+2);
				y=(int)(Math.random()*6);
				intentos++;
			}
			if(grilla[x][y].getElem()==null)
				crearElemento(o,x,y);
		}
	}
	
	public void crearElementoIntangible(Elemento elem) {
		//crea un objeto que no se reserva para si mismo la celda en la que esta (proyectil o premio recolectable)
		lista.add(elem);
		GUI.getGUI().crearElemento(elem);
	}
	
	public void visitorGlobal(Visitor v) {
		for(Elemento e:lista) {
			if (e.estaVivo())
				e.accept(v);
		}
	}
	
	public void actuar() {
		Enemigo e;
		LinkedList<Elemento> listaAux=new LinkedList<Elemento>();
		for(Elemento el:lista)
			listaAux.addLast(el);
		for(Elemento el:listaAux) {
			if(el.estaVivo())
				el.actuar();
		}
		if(oleadaActiva) {
			if(cantEnemigos!=0) {
				for(int i=0;i<6;i++) {
					if(grilla[9][i].getElem()==null)
						if (nivel.quedanEnemigos(i)) {
							e=nivel.getEnemigo(i);
							crearElemento(e,9,i);
							if((int)(Math.random()*100)<10)
								e.setEstadoDefensa(new EstadoProtegidoEnemigo(e));
						}
				}
			}
			else {
				oleadaActiva=false;
				GUI.getGUI().activarBotonOleada();
				if(!nivel.siguienteOleada())
					Controlador.getControlador().ganar();
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
				grilla[x][y+1].setElem(null);
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
				Controlador.getControlador().perder();
			return false;	
		}
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
			GUI.getGUI().crearElemento(elem);
		}else
			if(elem.getTamano()==2&&y<5&&grilla[x][y].getElem()==null&&grilla[x][y+1].getElem()==null) {
				grilla[x][y].setElem(elem);
				grilla[x][y+1].setElem(elem);
				elem.setCelda(grilla[x][y]);
				lista.add(elem);
				GUI.getGUI().crearElemento(elem);
			}
		return false;
		
	}
	
	public boolean posicionValida(Elemento e,int x,int y) {
		return (x>=0&&x<this.x-1&&y>=0&&y<=this.y-e.getTamano()&&grilla[x][y].getElem()==null&&(e.getTamano()==1||grilla[x][y+1].getElem()==null));
	}

	public Celda[][] getGrilla() {
		return grilla;
	}

	public Nivel getNivel() {
		return nivel;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
