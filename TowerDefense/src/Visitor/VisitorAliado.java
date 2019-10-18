package Visitor;

import Objetos.*;
import Personajes.*;

public class VisitorAliado extends Visitor {

	protected Torre miTorre;
	
	public VisitorAliado(Torre miTorre) {
		this.miTorre=miTorre;
	}

	public void visit(Torre torre) {
		//nada
	}
	
	public void visit(Enemigo enemigo) {
		//atacar
	}

	public void visit(Proyectil proyectil) {
		//nada
	}

	public void visit(PowerUp powerup) {
		//realizar metodo de adquisicion
	}

	@Override
	public void visit(ObstaculoVida obstaculo) {
		//nada
		
	}

	@Override
	public void visit(ObstaculoTiempo obstaculo) {
		//nada
		
	}
}
