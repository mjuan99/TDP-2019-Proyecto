package EstadosEnemigo;

import javax.swing.ImageIcon;

import Juego.Elemento;
import Personajes.Enemigo;

public class EstadoProtegidoEnemigo extends EstadoDefensaEnemigo {
	public EstadoProtegidoEnemigo(Enemigo e) {
		super(e);
		e.getComponenteGrafica().setIcon(new ImageIcon(e.getImagenProtegido()));
	}

	@Override
	public void danar(Elemento e, int dano) {
		miEnemigo.getComponenteGrafica().setIcon(new ImageIcon(miEnemigo.getRutaImagen()));
		miEnemigo.setEstadoDefensa(new EstadoDefaultDefensaE(miEnemigo));
	}

}
