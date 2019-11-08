package EstadosAliado;

import Juego.Elemento;
import Personajes.Torre;

public class EstadoDefaultDefensaT extends EstadoDefensaTorre{
	public EstadoDefaultDefensaT(Torre t) {
		super(t);
	}
	@Override
	public void danar(Elemento e,int dano) {
		if(miTorre.getVida()<=dano)
			miTorre.morir();
		else
			miTorre.setVida(miTorre.getVida()-dano);
	}

}
