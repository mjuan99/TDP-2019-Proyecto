package PowerUps;

import EstadosAliado.EstadoProtegidoAliado;
import Personajes.Torre;
import Tienda.Tienda;

public class EscudoEfecto extends PowerUpTorre {
	protected static String imagen="./src/Sprites/Premios/Escudo.png";
	protected static String desc="Escudo";
	
	public EscudoEfecto() {
		super(imagen,desc);
	}

	@Override
	public void aplicar(Torre t) {
		t.setEstadoDefensa(new EstadoProtegidoAliado(t));
	}
	public void usar() {
		Tienda.getTienda().usar(this);
	}

}
