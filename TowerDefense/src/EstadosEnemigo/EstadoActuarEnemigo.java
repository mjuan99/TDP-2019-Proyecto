package EstadosEnemigo;

import Personajes.Enemigo;

public abstract class EstadoActuarEnemigo {
	protected Enemigo miEnemigo;
	public EstadoActuarEnemigo(Enemigo e) {
		miEnemigo=e;
	}
	public abstract void actuar();
}
