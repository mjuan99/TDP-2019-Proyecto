package Juego;

import java.awt.EventQueue;

import Objetos.Dugtrio;
import Objetos.Obstaculo;
import Objetos.Snorlax;
import Personajes.Enemigo;
import Personajes.Torre;

public class Controlador {
	private static Controlador controlador;
	protected ContadorTiempo tiempo;
	
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controlador.getControlador();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private Controlador() {
		Mapa.getMapa(1);
		GUI.getGUI().setVisible(true);
		setObstaculos();
		tiempo=new ContadorTiempo();
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

	public void ganar() {
		System.out.println("Implementar Ganar");
	}
	
	public void perder() {
		System.out.println("Implementar Perder");
	}
	
	public void setObstaculos() {
		int x=(int)(Math.random()*5)+2;
		int y=(int)(Math.random()*6);
		Obstaculo obs=new Snorlax(Mapa.getMapa(0),null);
		Mapa.getMapa(0).crearElemento(obs, x, y);
		GUI.getGUI().crearElemento(obs);
		x=(int)(Math.random()*9);
		y=(int)(Math.random()*6);
		obs=new Dugtrio(Mapa.getMapa(0),null);
		if(Mapa.getMapa(0).crearElemento(obs, x, y))
			GUI.getGUI().crearElemento(obs);
	}
	public boolean agregarTorre(Torre t,int x, int y) {
		//Torre t=getTorre(proxTorre);
		if(Mapa.getMapa(0).posicionValidaTorre(t, x, y)) {
			if(Mapa.getMapa(0).crearElemento(t, x, y))
				GUI.getGUI().crearElemento(t);
			return true;
		}
		return false;
	}
	public void activarOleada() {
		Mapa.getMapa(0).activarOleada();
	}
}
