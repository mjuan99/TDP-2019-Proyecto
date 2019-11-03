package PowerUps;

import EstadosEnemigo.EstadoCongeladoEnemigo;
import Personajes.Enemigo;
import Personajes.Torre;
import Tienda.Tienda;

public class CongelarEfecto extends PowerUpGlobal {
	protected static String imagen="./src/Sprites/Premios/Congelar.png";
	protected static String desc="Congelar";
	
	public CongelarEfecto() {
		super(imagen,desc);
	}

	@Override
	public void aplicar(Torre t) {}
	public void usar() {
		Tienda.getTienda().usar(this);
	}

	@Override
	public void aplicar(Enemigo e) {
		e.setEstadoActuar(new EstadoCongeladoEnemigo(e));
	}

}
