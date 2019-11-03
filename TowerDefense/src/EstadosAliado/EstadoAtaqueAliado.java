package EstadosAliado;

import Personajes.Torre;

public abstract class EstadoAtaqueAliado {
	protected Torre miTorre;
	protected EstadoAtaqueAliado(Torre t) {
		miTorre=t;
	}
	public abstract void atacar();
}
