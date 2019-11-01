package Tienda;

import Juego.Celda;
import Personajes.Torre;
import PowerUpsEfecto.PowerUpTorre;

public class TiendaPowerUpTorre implements TiendaEstado {
	protected PowerUpTorre miPowerUp;
	public TiendaPowerUpTorre(PowerUpTorre p) {
		miPowerUp=p;
	}

	@Override
	public void seleccionar(Torre t) {
		miPowerUp.aplicar(t);
		Tienda.getTienda().deshabilitarUltimoPowerUp();
		Tienda.getTienda().setEstado(new TiendaDefaultEstado());
	}

	@Override
	public void seleccionar(Celda c) {}

}
