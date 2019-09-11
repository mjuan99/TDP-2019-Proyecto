
public class Proyectil {
	protected int dano;
	protected int rango;
	protected Celda celda;
	
	public Proyectil(int dano,int rango,Celda celda) {
		this.dano=dano;
		this.rango=rango;
		this.celda=celda;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}

	public Celda getCelda() {
		return celda;
	}

	public void setCelda(Celda celda) {
		this.celda = celda;
	}
}
