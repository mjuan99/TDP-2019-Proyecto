
public class Proyectil {
	protected int dano;
	protected int rango;
	protected String rutaImagen;
	
	public Proyectil(int dano,int rango,String rutaImagen) {
		this.dano=dano;
		this.rango=rango;
		this.rutaImagen=rutaImagen;
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
}
