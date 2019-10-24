package Visitor;

import Objetos.*;
import Personajes.*;
import PowerUps.Bomba;
import PowerUps.Congelar;
import PowerUps.DobleFuerza;
import PowerUps.Escudo;
import PowerUps.PowerUp;
import PowerUps.TorreAleatoria;

public class VisitorAliado extends Visitor {

	protected Torre miTorre;
	
	public VisitorAliado(Torre miTorre) {
		this.miTorre=miTorre;
	}

	public void visit(Torre torre) {
		//nada
	}
	
	public void visit(Enemigo enemigo) {
		miTorre.atacar();
	}

	public void visit(Proyectil proyectil) {
		//nada
	}

	public void visit(Bomba powerup) {
		//realizar metodo de adquisicion

	}
	
	public void visit(DobleFuerza powerup) {
//		miTorre.atacar(danio*2);
	}

	@Override
	public void visit(ObstaculoVida obstaculo) {
		//nada
		
	}

	@Override
	public void visit(ObstaculoTiempo obstaculo) {
		//nada
		
	}

	@Override
	public void visit(Congelar c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(TorreAleatoria t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Escudo e) {
		// TODO Auto-generated method stub
		
	}
}
