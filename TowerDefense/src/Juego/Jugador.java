package Juego;

public class Jugador {
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
		mapa.actualizarPuntos(puntos);
	}
}
