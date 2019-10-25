package PowerUpsEfecto;

import Juego.Mapa;
import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Personajes.Enemigo;
import Personajes.Torre;
import Visitor.VisitorPowerUpGlobal;

public abstract class PowerUpGlobal extends PowerUpEfecto {
	protected VisitorPowerUpGlobal visitor;
	protected PowerUpGlobal() {
		visitor=new VisitorPowerUpGlobal(this);
	}
	public void activar() {
		Mapa.getMapa(0).visitorGlobal(visitor);
	}
	public abstract void aplicar(Torre t);
	public abstract void aplicar(Enemigo e);
	public abstract void aplicar(ObstaculoVida o);
	public abstract void aplicar(ObstaculoTiempo o);
	
}
