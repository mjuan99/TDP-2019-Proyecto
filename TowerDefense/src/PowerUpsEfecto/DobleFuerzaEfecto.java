package PowerUpsEfecto;

import EstadosAliado.EstadoDobleFuerzaAtaque;
import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Personajes.Enemigo;
import Personajes.Torre;

public class DobleFuerzaEfecto extends PowerUpGlobal {

	@Override
	public void aplicar(Torre t) {
		t.setEstadoAtaque(new EstadoDobleFuerzaAtaque(t));
	}

	@Override
	public void aplicar(Enemigo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aplicar(ObstaculoVida o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aplicar(ObstaculoTiempo o) {
		// TODO Auto-generated method stub
		
	}

}
