package Juego;

import java.awt.EventQueue;

import Personajes.Torre;
import PowerUpsRecolectable.*;

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
		Mapa.getMapa();
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
		Mapa.getMapa().limpiar();
		GUI.getGUI().ganar();
	}
	
	public void perder() {
		Mapa.getMapa().limpiar();
		GUI.getGUI().perder();
	}

	public boolean agregarTorre(Torre t,int x, int y) {
		if(Mapa.getMapa().posicionValidaTorre(t, x, y)) {
			Mapa.getMapa().crearElemento(t, x, y);
			return true;
		}
		return false;
	}
	public void activarOleada() {
		Mapa.getMapa().activarOleada();
	}

	public void crearPowerUp(PowerUpRecolectable p) {
		Mapa.getMapa().crearElementoIntangible(p);
	}
	
}