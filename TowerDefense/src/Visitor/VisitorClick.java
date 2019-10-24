package Visitor;

import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Objetos.Proyectil;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.*;

public class VisitorClick extends Visitor{

	@Override
	public void visit(Torre torre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Enemigo enemigo) {
		// TODO Auto-generated method stub
		
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
		powerup.morir();
	}

}
