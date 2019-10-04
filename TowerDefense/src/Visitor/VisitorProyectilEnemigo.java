package Visitor;

import Objetos.Obstaculo;
import Objetos.PowerUp;
import Objetos.Proyectil;
import Objetos.ProyectilEnemigo;
import Personajes.Enemigo;
import Personajes.Torre;

public class VisitorProyectilEnemigo extends Visitor {
	
	protected ProyectilEnemigo miProyectil;
	
	public VisitorProyectilEnemigo(ProyectilEnemigo miProyectil) {
		this.miProyectil=miProyectil;
	}

	@Override
	public void visit(Torre torre) {
		//da�ar torre

	}

	@Override
	public void visit(Enemigo enemigo) {
		//nada

	}

	@Override
	public void visit(Proyectil proyectil) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Obstaculo obstaculo) {
		//nada

	}

	@Override
	public void visit(PowerUp powerup) {
		//nada

	}

}
