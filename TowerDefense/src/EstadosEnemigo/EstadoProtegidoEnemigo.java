package EstadosEnemigo;

import javax.swing.ImageIcon;

import Juego.Elemento;
import Personajes.Enemigo;

public class EstadoProtegidoEnemigo implements EstadoDefensaEnemigo {
	protected Enemigo miEnemigo;
	public EstadoProtegidoEnemigo(Enemigo e) {
		miEnemigo=e;
		e.getComponenteGrafica().setIcon(new ImageIcon(e.getImagenProtegido()));
	}

	@Override
	public void danar(Elemento e, int dano) {
		e.getComponenteGrafica().setIcon(new ImageIcon(e.getRutaImagen()));
		miEnemigo.setEstadoDefensa(new EstadoDefaultDefensaE(miEnemigo));
	}

}
