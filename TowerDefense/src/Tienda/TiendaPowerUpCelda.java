package Tienda;

import Juego.Celda;
import Personajes.Torre;
import PowerUpsEfecto.PowerUpCelda;

public class TiendaPowerUpCelda implements TiendaEstado {
	protected PowerUpCelda miPowerUp;
	public TiendaPowerUpCelda(PowerUpCelda p) {
		miPowerUp=p;
	}

	@Override
	public void seleccionar(Torre t) {
		//nada
	}

	@Override
	public void selecciontar(Celda c) {
		miPowerUp.activar(c);
		Tienda.getTienda().deshabilitarUltimoPowerUp();
		Tienda.getTienda().setEstado(new TiendaDefaultEstado());
	}

}
