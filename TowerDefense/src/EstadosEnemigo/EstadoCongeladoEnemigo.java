package EstadosEnemigo;

import javax.swing.ImageIcon;

import Personajes.Enemigo;

public class EstadoCongeladoEnemigo implements EstadoActuarEnemigo {
	protected Enemigo miEnemigo;
	protected long inicio;
	protected int duracion=7000;
	public EstadoCongeladoEnemigo(Enemigo e) {
		miEnemigo=e;
		miEnemigo.getComponenteGrafica().setIcon(new ImageIcon(miEnemigo.getImagenCongelado()));
		inicio=System.currentTimeMillis();
	}

	@Override
	public void actuar() {
		if(System.currentTimeMillis()>inicio+duracion) {
			miEnemigo.setEstadoActuar(new EstadoDefaultActuar(miEnemigo));
			miEnemigo.getComponenteGrafica().setIcon(new ImageIcon(miEnemigo.getRutaImagen()));
			miEnemigo.actuar();
		}
	}

}
