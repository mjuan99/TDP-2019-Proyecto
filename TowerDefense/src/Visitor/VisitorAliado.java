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
		enemigo.danar(miTorre.getDano());
	}

	public void visit(Proyectil proyectil) {
		//nada
	}

	public void visit(Obstaculo obstaculo) {
		//nada
	}

	public void visit(PowerUp powerup) {
		//realizar metodo de adquisicion
	}
}
