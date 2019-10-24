package Visitor;

import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Objetos.Proyectil;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.Bomba;
import PowerUps.Congelar;
import PowerUps.DobleFuerza;
import PowerUps.Escudo;
import PowerUps.PowerUp;
import PowerUps.TorreAleatoria;

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
	public void visit(Bomba b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Congelar c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(DobleFuerza d) {
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
