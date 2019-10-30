package EstadosEnemigo;

import Juego.Elemento;
import Personajes.Enemigo;

public class EstadoProtegidoEnemigo implements EstadoDefensaEnemigo {
	protected Enemigo miEnemigo;
	public EstadoProtegidoEnemigo(Enemigo e) {
		miEnemigo=e;
	}

	@Override
	public void danar(Elemento e, int dano) {
		miEnemigo.setEstadoDefensa(new EstadoDefaultDefensaE(miEnemigo));
	}

}
