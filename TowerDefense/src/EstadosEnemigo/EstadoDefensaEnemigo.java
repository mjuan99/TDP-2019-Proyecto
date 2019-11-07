package EstadosEnemigo;

import Juego.Elemento;
import Personajes.Enemigo;

public abstract class EstadoDefensaEnemigo {
	protected Enemigo miEnemigo;
	public EstadoDefensaEnemigo(Enemigo e) {
		miEnemigo=e;
	}
	public abstract void danar(Elemento e,int dano);
}
