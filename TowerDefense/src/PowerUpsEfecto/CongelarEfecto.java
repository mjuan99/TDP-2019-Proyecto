package PowerUpsEfecto;

import EstadosEnemigo.EstadoCongeladoEnemigo;
import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Personajes.Enemigo;
import Personajes.Torre;

public class CongelarEfecto extends PowerUpGlobal {

	@Override
	public void aplicar(Torre t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aplicar(Enemigo e) {
		e.setEstadoActuar(new EstadoCongeladoEnemigo(e));
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
