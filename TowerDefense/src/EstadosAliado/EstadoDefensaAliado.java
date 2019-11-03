package EstadosAliado;

import Juego.Elemento;
import Personajes.Torre;

public abstract class EstadoDefensaAliado {
	protected Torre miTorre;
	public EstadoDefensaAliado(Torre t) {
		miTorre=t;
	}
	public abstract void danar(Elemento e,int dano);
}
