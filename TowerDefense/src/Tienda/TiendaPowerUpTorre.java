package Tienda;

import Juego.Celda;
import Personajes.Torre;
import PowerUps.PowerUpTorre;

public class TiendaPowerUpTorre extends TiendaEstado {
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
