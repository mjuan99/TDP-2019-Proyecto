package EstadosEnemigo;

import Juego.Elemento;
import Personajes.Enemigo;

public class EstadoDefaultDefensaE implements EstadoDefensaEnemigo{
	protected Enemigo miEnemigo;
	public EstadoDefaultDefensaE(Enemigo e) {
		miEnemigo=e;
	}

	@Override
	public void danar(Elemento e, int dano) {
		if(miEnemigo.getVida()<=dano)
			miEnemigo.morir();
		else
			miEnemigo.setVida(miEnemigo.getVida()-dano);
	}

}
