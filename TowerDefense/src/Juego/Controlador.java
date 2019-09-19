package Juego;

import java.awt.EventQueue;

public class Controlador {
	protected ContadorTiempo tiempo;
	protected Mapa map;
	
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
	
	public Controlador() {
		GUI gui=new GUI(this);
		gui.setVisible(true);
		map=new Mapa(null,null,null);
		tiempo=new ContadorTiempo(map);
		tiempo.start();
	}
}
