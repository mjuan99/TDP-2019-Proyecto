package PowerUpsEfecto;

import EstadosEnemigo.EstadoCongeladoEnemigo;
import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Personajes.Enemigo;
import Personajes.Torre;
import Tienda.Tienda;

public class CongelarEfecto extends PowerUpGlobal {
	protected static String imagen="./src/Sprites/Premios/Congelar.png";
	protected static String desc="Congelar";
	
	public CongelarEfecto() {
		super(imagen,desc);
	}

	@Override
	public void aplicar(Torre t) {
		// TODO Auto-generated method stub
		
	}
	public void usar() {
		Tienda.getTienda().usar(this);
	}

	@Override
	public void aplicar(Enemigo e) {
		e.setEstadoActuar(new EstadoCongeladoEnemigo(e));
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
