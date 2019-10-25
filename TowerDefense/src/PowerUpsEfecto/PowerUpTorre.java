package PowerUpsEfecto;

import Personajes.Torre;

public abstract class PowerUpTorre extends PowerUpEfecto {
	protected PowerUpTorre(String imagen,String desc) {
		super(imagen,desc);
	}
	public abstract void aplicar(Torre t);
}
