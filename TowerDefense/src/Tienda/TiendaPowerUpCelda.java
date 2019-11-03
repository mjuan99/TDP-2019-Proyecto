package Tienda;

import Juego.Celda;
import Personajes.Torre;
import PowerUps.PowerUpCelda;

public class TiendaPowerUpCelda extends TiendaEstado {
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
