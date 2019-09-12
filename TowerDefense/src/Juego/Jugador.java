package Juego;

public class Jugador {
	protected int presupuesto;
	protected Mapa mapa;
	protected final static int cantTorres=6;
	public Jugador(Mapa mapa) {
		this.mapa=mapa;
		presupuesto=mapa.getNivel().getPresupuestoBase();
	}
}
