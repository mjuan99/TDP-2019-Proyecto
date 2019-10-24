package Visitor;

import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Objetos.Proyectil;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;

public class VisitorCongelar extends Visitor {

	@Override
	public void visit(Torre torre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Enemigo enemigo) {
		//Congelar enemigo
		//enemigo.setEstado(new Congelado(enemigo));
	}

	@Override
	public void visit(Proyectil proyectil) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ObstaculoVida obstaculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ObstaculoTiempo obstaculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(PowerUp powerup) {
		// TODO Auto-generated method stub
		
	}

}
