package Juego;

import java.awt.EventQueue;

import Premio.*;

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
	
	public boolean agregarElemento(Elemento e,int x,int y) {
		if(Mapa.getMapa().posicionValida(e, x, y)) {
			Mapa.getMapa().crearElemento(e, x, y);
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
	
	public void crearPowerUpAleatorio(Celda celda) {
		if((int)(Math.random()*10)<3)
			Mapa.getMapa().crearElementoIntangible(getPowerUp(celda));
	}
	
	private PowerUpRecolectable getPowerUp(Celda celda) {
		PowerUpRecolectable p=null;
		int i=(int)(Math.random()*5);
		switch(i) {
		case 0:{p=new BombaRecolectable(celda);break;}
		case 1:{p=new EscudoRecolectable(celda);break;}
		case 2:{p=new CongelarRecolectable(celda);break;}
		case 3:{p=new DobleFuerzaRecolectable(celda);break;}
		case 4:{p=new TorreAleatoriaRecolectable(celda);break;}
		}
		return p;
	}
	
}