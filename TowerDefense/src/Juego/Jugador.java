package Juego;

import javax.swing.JLabel;

public final class Jugador {
	protected static Jugador jugador;
	protected JLabel oroGrafica;
	protected JLabel puntosGrafica;
	protected int presupuesto;
	protected int puntos;
	private Jugador() {
		reset();
	}
	
	public static Jugador getJugador() {
		if(jugador==null)
			return (jugador=new Jugador());
		else
			return jugador;
	}
	
	public void reset() {
		puntos=0;
		presupuesto=Mapa.getMapa().getNivel().getPresupuestoBase();		
	}
	
	public void sumarPuntos(int p) {
		puntos+=p;
		GUI.getGUI().actualizarPuntos();
	}
	
	public int getOro() {
		return presupuesto;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public void decrementarOro(int valor) {
		presupuesto-=valor;
		GUI.getGUI().actualizarOro();
	}
	public void aumentarOro(int valor) {
		presupuesto+=valor;
		GUI.getGUI().actualizarOro();
	}
	public void setOroGrafica(JLabel oro) {
		oroGrafica=oro;
	}
	
	public void setPuntosGrafica(JLabel puntos) {
		puntosGrafica=puntos;
	}
}