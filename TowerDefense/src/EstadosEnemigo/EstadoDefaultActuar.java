package EstadosEnemigo;

import Personajes.Enemigo;

public class EstadoDefaultActuar implements EstadoActuarEnemigo {
	protected Enemigo miEnemigo;
	public EstadoDefaultActuar(Enemigo e) {
		miEnemigo=e;
	}
	@Override
	public void actuar() {
		miEnemigo.actuarDefault();
	}

}
