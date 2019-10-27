package PowerUpsEfecto;

import Juego.Celda;

public abstract class PowerUpCelda extends PowerUpEfecto {
	protected PowerUpCelda(String imagen,String desc) {
		super(imagen,desc);
	}
	public abstract void activar(Celda c);
}
