
public abstract class Elemento {
	protected Celda celda;
	protected int vida;
	protected String rutaImagen;

	public Celda getCelda() {
		return celda;
	}

	public void setCelda(Celda celda) {
		this.celda = celda;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public abstract String getRutaImagen();
	
	
}
