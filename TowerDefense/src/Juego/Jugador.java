package Juego;

import javax.swing.JLabel;

public class Jugador {
	protected static Jugador jugador;
	protected JLabel oroGrafica;
	protected JLabel puntosGrafica;
	protected int presupuesto;
	protected int puntos;
	private Jugador() {
		puntos=0;
		presupuesto=Mapa.getMapa(0).getNivel().getPresupuestoBase();
	}
	
	public static Jugador getJugador() {
		if(jugador==null)
			return (jugador=new Jugador());
		else
			return jugador;
	}
	
	public void sumarPuntos(int p) {
		puntos+=p;
		puntosGrafica.setText("Puntos: "+puntos);
	}
	
	public int getOro() {
		return presupuesto;
	}
	
	public void decrementarOro(int valor) {
		presupuesto-=valor;
	}
	public void setOroGrafica(JLabel oro) {
		oroGrafica=oro;
	}
	
	public void setPuntosGrafica(JLabel puntos) {
		puntosGrafica=puntos;
	}
}