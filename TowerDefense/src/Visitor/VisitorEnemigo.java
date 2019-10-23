package Visitor;

import Objetos.Obstaculo;
import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Objetos.Proyectil;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;

public class VisitorEnemigo extends Visitor {
	
	protected Enemigo miEnemigo;
	
	public VisitorEnemigo(Enemigo miEnemigo) {
		this.miEnemigo=miEnemigo;
	}

	@Override
	public void visit(Torre torre) {
		//atacar
		
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
		// atacar
		
	}

	@Override
	public void visit(ObstaculoTiempo obstaculo) {
		// nada
		
	}

}
