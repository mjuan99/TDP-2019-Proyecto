package Juego;

public class Nivel {
	protected Oleada [] oleadas;
	protected int presupuestoBase;
	public Nivel(int p) {
		presupuestoBase=p;
	}
	
	public int getPresupuestoBase() {
		return presupuestoBase;
	}
}
