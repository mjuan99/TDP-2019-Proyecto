package EstadosAliado;

import Juego.Elemento;
import Personajes.Torre;

public class EstadoProtegidoAliado implements EstadoDefensaAliado{
	protected Torre miTorre;
	public EstadoProtegidoAliado(Torre t) {
		miTorre=t;
	}

	@Override
	public void danar(Elemento e, int dano) {
		if(e!=null)
			e.morir();
		miTorre.setEstadoDefensa(new EstadoDefaultDefensaA(miTorre));
	}

}
