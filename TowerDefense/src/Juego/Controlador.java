package Juego;

import java.awt.EventQueue;
import java.util.Random;

import Premios.*;

public final class Controlador {
	private Random random = new Random();
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
	
	public boolean agregarElemento(Elemento e,int x,int y) {
		boolean toReturn=false;
		if(Mapa.getMapa().posicionValida(e, x, y)) {
			Mapa.getMapa().crearElemento(e, x, y);
			toReturn= true;
		}
		return toReturn;
	}
	
	public void activarOleada() {
		Mapa.getMapa().activarOleada();
	}

	public void crearPowerUp(Premio p) {
		Mapa.getMapa().crearElementoIntangible(p);
	}
	
	public void crearPowerUpAleatorio(Celda celda) {
		if((this.random.nextInt(10))<2)
			Mapa.getMapa().crearElementoIntangible(getPowerUp(celda));
	}
	
	private Premio getPowerUp(Celda celda) {
		Premio p=null;
		int i= this.random.nextInt(5);
		switch(i) {
		case 0:{p=crearBR(celda);
				break;}
		case 1:{p=crearER(celda);
				break;}
		case 2:{p=crearCR(celda);
				break;}
		case 3:{p=crearDFR(celda);
				break;}
		default:{p=crearTA(celda);
				break;}
		}
		return p;
	}
	
	private Premio crearBR(Celda celda) {
		return new BombaRecolectable(celda);
	}
	private Premio crearER(Celda celda) {
		return new EscudoRecolectable(celda);
	}
	private Premio crearCR(Celda celda) {
		return new CongelarRecolectable(celda);
	}
	private Premio crearDFR(Celda celda) {
		return new DobleFuerzaRecolectable(celda);
	}
	private Premio crearTA(Celda celda) {
		return new TorreAleatoriaRecolectable(celda);
	}
}