package PowerUps;

import Juego.Celda;

public abstract class PowerUpCelda extends PowerUp {
	protected PowerUpCelda(String imagen,String desc) {
		super(imagen,desc);
	}
	public abstract void activar(Celda c);
}
