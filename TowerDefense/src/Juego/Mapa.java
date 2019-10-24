package Juego;
import java.util.LinkedList;
import java.util.Queue;

import Objetos.Obstaculo;
import Objetos.Proyectil;
import Personajes.Enemigo;
import Personajes.Torre;

public class Mapa {
	private static Mapa mapa;
	protected Celda[][] grilla;
	protected int x=10;
	protected int y=6;
	protected Nivel nivel;
	protected LinkedList<Elemento> lista;
	protected boolean oleadaActiva;
	protected int cantEnemigos;
	
	private Mapa(int nivel) {
		lista=new LinkedList<Elemento>();
		this.nivel=new Nivel(nivel);
		grilla=new Celda[x][y];
		oleadaActiva=false;
		cantEnemigos=0;
		for(int i=0;i<y;i++)
			for(int j=0;j<x;j++)
				grilla[j][i]=new Celda(j,i);
	}
	
	public static Mapa getMapa(int nivel) {
		if(mapa==null) {
			return (mapa= new Mapa(nivel));
		}
		else {
			return mapa;
		}
	}
	
	public void limpiar() {
		Elemento e;
		while(!lista.isEmpty()) {
			e=lista.removeFirst();
			e.getComponenteGrafica().setIcon(null);
			e.getComponenteGrafica().setBounds(0,0,0,0);
			GUI.getGUI().eliminarComponente(e.getComponenteGrafica());
		}
	}
		
	public void activarOleada() {
		oleadaActiva=true;
		cantEnemigos=nivel.cantEnemigos();
		Queue<Obstaculo> obstaculos=nivel.getColaObstaculos();
		int x=(int)(Math.random()*6+2);
		int y=(int)(Math.random()*6);
		Obstaculo o;
		while(!obstaculos.isEmpty()) {
			o=obstaculos.poll();
			while(grilla[x][y].getElem()!=null) {
				x=(int)(Math.random()*6+2);
				y=(int)(Math.random()*6);
			}
			o.setCelda(grilla[x][y]);
			grilla[x][y].setElem(o);
			lista.add(o);
			GUI.getGUI().crearElemento(o);
		}
	}
	
	public void crearProyectil(Proyectil proyectil) {
		lista.add(proyectil);
		GUI.getGUI().crearElemento(proyectil);
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
							e.setCelda(grilla[9][i]);
							grilla[9][i].setElem(e);
							lista.add(e);
							GUI.getGUI().crearElemento(e);
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
		//System.out.println(x+" - "+y);
		if(elem.getTamano()==1&&grilla[x][y].getElem()==null) {
			grilla[x][y].setElem(elem);
			elem.setCelda(grilla[x][y]);
			lista.add(elem);
			return true;
		}else
			if(elem.getTamano()==2&&y<5&&grilla[x][y].getElem()==null&&grilla[x][y+1].getElem()==null) {
				grilla[x][y].setElem(elem);
				grilla[x][y+1].setElem(elem);
				elem.setCelda(grilla[x][y]);
				lista.add(elem);
				return true;
			}
		return false;
		
	}
	
	public boolean posicionValidaTorre(Torre t,int x,int y) {
		return (x>=0&&x<this.x-1&&y>=0&&y<=this.y-t.getTamano()&&grilla[x][y].getElem()==null&&(t.getTamano()==1||grilla[x][y+1].getElem()==null));
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
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
	//en crear elemento agrege las torres a la lista de torres que cree
	//agregue este metodo
	/*public Elemento getElemento(int x, int y ) {
		return grilla[x][y].getElem();
		
	}
	
	/*public LinkedList<Elemento> getTorres() {
		return listaTorres;
	}*/
