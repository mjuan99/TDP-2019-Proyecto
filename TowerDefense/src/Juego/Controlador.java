package Juego;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Objetos.Dugtrio;
import Objetos.Obstaculo;
import Objetos.Snorlax;
import Personajes.Alien;
import Personajes.Dinosaurio;
import Personajes.Dragon;
import Personajes.Enemigo;
import Personajes.Enemigo1;
import Personajes.Enemigo2;
import Personajes.Enemigo3;
import Personajes.Enemigo4;
import Personajes.Enemigo5;
import Personajes.Enemigo6;
import Personajes.Fantasma;
import Personajes.Fenix;
import Personajes.Golem;
import Personajes.Hada;
import Personajes.Leviatan;
import Personajes.Torre;

public class Controlador {
	private static Controlador controlador;
	protected GUI gui;
	protected ContadorTiempo tiempo;
	protected Mapa map;
	protected int proxTorre=0;
	
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Controlador();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private Controlador() {
		map=new Mapa(null,this);
		gui=new GUI(this);
		gui.setVisible(true);
		setObstaculos();
		tiempo=new ContadorTiempo(map);
		tiempo.start();
	}
	
	public static Controlador getControlador() {
		if(controlador==null) {
			return (controlador= new Controlador());
		}
		else {
			return controlador;
		}
	}
	public void setObstaculos() {
		int x=(int)(Math.random()*5)+2;
		int y=(int)(Math.random()*6);
		Obstaculo obs=new Snorlax(map,null);
		map.crearElemento(obs, x, y);
		gui.crearElemento(x, y, obs);
		x=(int)(Math.random()*9);
		y=(int)(Math.random()*6);
		obs=new Dugtrio(map,null);
		if(map.crearElemento(obs, x, y))
			gui.crearElemento(x, y, obs);
	}
	
	public void actualizarPuntos(int puntos) {
		gui.actualizarPuntos(puntos);
	}
	
	public Mapa getMapa() {
		return map;
	}
	
	public void setProxTorre(int proxTorre){
		this.proxTorre=proxTorre;
	}
	public void agregarTorre(int x, int y) {
		Torre t=getTorre(proxTorre);
		if(map.posicionValidaTorre(t, x, y)) {
			if(map.crearElemento(t, x, y))
				gui.crearElemento(x, y, t);
		}
	}
	
	public GUI getGui() {
		return gui;
	}
	public void agregarEnemigo(int x, int y, Enemigo e) {
		map.crearElemento(e, x, y);
		gui.crearElemento(x, y, e);
	}
	public void crearElemento(Elemento e) {
		gui.crearElemento(e.getCelda().getX(), e.getCelda().getY(), e);
	}
	private Torre getTorre(int i) {
		Torre t=null;
		switch(i) {
		case 0:{t=new Alien(map,null);break;}
		case 1:{t=new Dinosaurio(map,null);break;}
		case 2:{t=new Dragon(map,null);break;}
		case 3:{t=new Fantasma(map,null);break;}
		case 4:{t=new Fenix(map,null);break;}
		case 5:{t=new Golem(map,null);break;}
		case 6:{t=new Hada(map,null);break;}
		case 7:{t=new Leviatan(map,null);break;}
		}
		return t;
	}
	public void agregarOleadaPrueba() {
		Enemigo[]enemigos= {new Enemigo1(map,null),new Enemigo2(map,null), new Enemigo3(map,null),new Enemigo4(map,null),new Enemigo5(map,null),new Enemigo6(map,null)};
		for(int i=0;i<6;i++) {
			agregarEnemigo(9,i,enemigos[i]);
		}
	}
	public void mover(Elemento elemento, int x, int y) {
		Rectangle r;
		r=elemento.getComponenteGrafica().getBounds();
		elemento.getComponenteGrafica().setBounds(x,y,(int)r.getWidth(),(int)r.getHeight());
	}
}
