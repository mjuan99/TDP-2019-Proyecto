package PowerUpsEfecto;

import EstadosAliado.EstadoProtegidoAliado;
import Personajes.Torre;

public class EscudoEfecto extends PowerUpTorre {

	@Override
	public void aplicar(Torre t) {
		t.setEstadoDefensa(new EstadoProtegidoAliado(t));
	}

}
