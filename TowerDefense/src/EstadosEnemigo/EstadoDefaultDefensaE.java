package EstadosEnemigo;

import Juego.Elemento;
import Personajes.Enemigo;

public class EstadoDefaultDefensaE extends EstadoDefensaEnemigo{
	public EstadoDefaultDefensaE(Enemigo e) {
		super(e);
	}

	@Override
	public void danar(Elemento e, int dano) {
		if(miEnemigo.getVida()<=dano)
			miEnemigo.morir();
		else
			miEnemigo.setVida(miEnemigo.getVida()-dano);
	}

}
