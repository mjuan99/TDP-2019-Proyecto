package EstadosAliado;

import Juego.Elemento;
import Personajes.Torre;

public abstract class EstadoDefensaTorre {
	protected Torre miTorre;
	public EstadoDefensaTorre(Torre t) {
		miTorre=t;
	}
	public abstract void danar(Elemento e,int dano);
}
