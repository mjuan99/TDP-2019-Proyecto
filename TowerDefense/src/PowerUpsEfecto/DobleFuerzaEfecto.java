package PowerUpsEfecto;

import EstadosAliado.EstadoDobleFuerzaAtaque;
import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
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
	public void aplicar(Enemigo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aplicar(ObstaculoVida o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aplicar(ObstaculoTiempo o) {
		// TODO Auto-generated method stub
		
	}

}
