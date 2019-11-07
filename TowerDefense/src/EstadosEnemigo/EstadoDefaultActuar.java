package EstadosEnemigo;

import Personajes.Enemigo;

public class EstadoDefaultActuar extends EstadoActuarEnemigo {
	public EstadoDefaultActuar(Enemigo e) {
		super(e);
	}
	@Override
	public void actuar() {
		miEnemigo.actuarDefault();
	}

}
