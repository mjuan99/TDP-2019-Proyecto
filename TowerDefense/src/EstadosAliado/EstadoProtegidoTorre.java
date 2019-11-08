package EstadosAliado;

import javax.swing.ImageIcon;

import Juego.Elemento;
import Personajes.Torre;

public class EstadoProtegidoTorre extends EstadoDefensaTorre{
	public EstadoProtegidoTorre(Torre t) {
		super(t);
		miTorre.getComponenteGrafica().setIcon(new ImageIcon(miTorre.getEstadoProtegido()));
	}

	@Override
	public void danar(Elemento e, int dano) {
		if(e!=null)
			e.morir();
		miTorre.getComponenteGrafica().setIcon(new ImageIcon(miTorre.getRutaImagen()));
		miTorre.setEstadoDefensa(new EstadoDefaultDefensaT(miTorre));
	}

}
