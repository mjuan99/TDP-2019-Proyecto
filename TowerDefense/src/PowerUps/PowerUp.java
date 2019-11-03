package PowerUps;

public abstract class PowerUp {
	protected String rutaImagen;
	protected String descripcion;
	protected PowerUp(String imagen,String desc) {
		rutaImagen=imagen;
		descripcion=desc;
	}
	public String getImagen() {
		return rutaImagen;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public abstract void usar();
}
