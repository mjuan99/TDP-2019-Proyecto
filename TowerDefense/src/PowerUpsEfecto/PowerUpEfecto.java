package PowerUpsEfecto;

public abstract class PowerUpEfecto {
	protected String rutaImagen;
	protected String descripcion;
	protected PowerUpEfecto(String imagen,String desc) {
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
