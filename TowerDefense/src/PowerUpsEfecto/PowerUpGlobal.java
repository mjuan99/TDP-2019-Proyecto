package PowerUpsEfecto;

import Juego.Mapa;
import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Personajes.Enemigo;
import Personajes.Torre;
import Visitor.VisitorPowerUpGlobal;

public abstract class PowerUpGlobal extends PowerUpEfecto {
	protected VisitorPowerUpGlobal visitor;
	protected PowerUpGlobal(String imagen,String desc) {
		super(imagen,desc);
		visitor=new VisitorPowerUpGlobal(this);
	}
	public void activar() {
		Mapa.getMapa().visitorGlobal(visitor);
	}
	public abstract void aplicar(Torre t);
	public abstract void aplicar(Enemigo e);
	public abstract void aplicar(ObstaculoVida o);
	public abstract void aplicar(ObstaculoTiempo o);
	
}
