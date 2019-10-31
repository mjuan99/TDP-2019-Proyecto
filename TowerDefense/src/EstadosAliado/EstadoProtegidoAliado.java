package EstadosAliado;

import javax.swing.ImageIcon;

import Juego.Elemento;
import Personajes.Torre;

public class EstadoProtegidoAliado implements EstadoDefensaAliado{
	protected Torre miTorre;
	public EstadoProtegidoAliado(Torre t) {
		miTorre=t;
		miTorre.getComponenteGrafica().setIcon(new ImageIcon(miTorre.getEstadoProtegido()));
	}

	@Override
	public void danar(Elemento e, int dano) {
		if(e!=null)
			e.morir();
		miTorre.getComponenteGrafica().setIcon(new ImageIcon(miTorre.getRutaImagen()));
		miTorre.setEstadoDefensa(new EstadoDefaultDefensaA(miTorre));
	}

}
