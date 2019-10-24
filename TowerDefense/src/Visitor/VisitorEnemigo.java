package Visitor;

import Objetos.Obstaculo;
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
	public void visit(ObstaculoVida obstaculo) {
		miEnemigo.atacar();
	}

	@Override
	public void visit(ObstaculoTiempo obstaculo) {
		// nada
		
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
