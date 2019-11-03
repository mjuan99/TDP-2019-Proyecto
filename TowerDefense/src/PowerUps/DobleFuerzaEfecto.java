package PowerUps;

import EstadosAliado.EstadoDobleFuerzaAtaque;
import Personajes.Enemigo;
import Personajes.Torre;
import Tienda.Tienda;

public class DobleFuerzaEfecto extends PowerUpGlobal {
	protected static String imagen="./src/Sprites/Premios/Fuerza.png";
	protected static String desc="Doble Fuerza";
	
	public DobleFuerzaEfecto() {
		super(imagen,desc);
	}

	@Override
	public void aplicar(Torre t) {
		t.setEstadoAtaque(new EstadoDobleFuerzaAtaque(t));
	}
	public void usar() {
		Tienda.getTienda().usar(this);
	}

	@Override
	public void aplicar(Enemigo e) {}

}
