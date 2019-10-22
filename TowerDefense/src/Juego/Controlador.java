package Juego;

import java.awt.EventQueue;

import Objetos.Dugtrio;
import Objetos.Obstaculo;
import Objetos.Snorlax;
import Personajes.Enemigo;
import Personajes.Torre;
import Tienda.AlienTienda;

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
		Mapa.getMapa(0).limpiar();
		GUI.getGUI().ganar();
	}
	
	public void perder() {
		Mapa.getMapa(0).limpiar();
		GUI.getGUI().perder();
	}

	public boolean agregarTorre(Torre t,int x, int y) {
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
