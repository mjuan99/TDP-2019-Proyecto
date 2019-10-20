package Visitor;

import Objetos.Obstaculo;
import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Objetos.PowerUp;
import Objetos.Proyectil;
import Personajes.Enemigo;
import Personajes.Torre;

public class VisitorEnemigo extends Visitor {
	
	protected Enemigo miEnemigo;
	
	public VisitorEnemigo(Enemigo miEnemigo) {
		this.miEnemigo=miEnemigo;
	}

	@Override
	public void visit(Torre torre) {
		miEnemigo.atacar();
	}

	@Override
	public void visit(Enemigo enemigo) {
		//nada
		
	}

	@Override
	public void visit(Proyectil proyectil) {
		//nada
		
	}

	@Override
	public void visit(PowerUp powerup) {
		//destruir powerup
		
	}

	@Override
	public void visit(ObstaculoVida obstaculo) {
		miEnemigo.atacar();
	}

	@Override
	public void visit(ObstaculoTiempo obstaculo) {
		// nada
		
	}

}
