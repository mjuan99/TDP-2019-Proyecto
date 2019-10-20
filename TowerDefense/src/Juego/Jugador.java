package Juego;

import javax.swing.JLabel;

public class Jugador {
	protected JLabel oroGrafica;
	protected JLabel puntosGrafica;
	protected int presupuesto;
	protected int puntos;
	protected Mapa mapa;
	protected final static int cantTorres=6;
	public Jugador(Mapa mapa) {
		puntos=0;
		this.mapa=mapa;
		presupuesto=mapa.getNivel().getPresupuestoBase();
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