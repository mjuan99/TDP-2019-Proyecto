package PowerUpsEfecto;

import Juego.Celda;
import Juego.Mapa;
import Tienda.Tienda;

public class BombaEfecto extends PowerUpCelda {
	protected static String imagen="./src/Sprites/Premios/Bomba.png";
	protected static String desc="Bomba";
	
	public BombaEfecto() {
		super(imagen,desc);
	}

	@Override
	public void activar(Celda c) {
	}
	public void usar() {
		Tienda.getTienda().usar(this);
	}

}
