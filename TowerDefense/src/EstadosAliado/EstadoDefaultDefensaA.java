package EstadosAliado;

import Juego.Elemento;
import Personajes.Torre;

public class EstadoDefaultDefensaA implements EstadoDefensaAliado{
	protected Torre miTorre;
	public EstadoDefaultDefensaA(Torre t) {
		miTorre=t;
	}
	@Override
	public void danar(Elemento e,int dano) {
		if(miTorre.getVida()<=dano)
			miTorre.morir();
		else
			miTorre.setVida(miTorre.getVida()-dano);
	}

}
