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
		seleccionar(t.getCelda());
	}

	@Override
	public void seleccionar(Celda c) {
		miPowerUp.activar(c);
		Tienda.getTienda().deshabilitarUltimoPowerUp();
		Tienda.getTienda().setEstado(new TiendaDefaultEstado());
	}

}
