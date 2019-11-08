package EstadosAliado;

import Personajes.Torre;

public abstract class EstadoAtaqueTorre {
	protected Torre miTorre;
	protected EstadoAtaqueTorre(Torre t) {
		miTorre=t;
	}
	public abstract void atacar();
}
