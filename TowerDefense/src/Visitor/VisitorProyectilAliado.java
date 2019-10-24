package Visitor;

import Objetos.Obstaculo;
import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Objetos.Proyectil;
import Objetos.ProyectilAliado;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.Bomba;
import PowerUps.Congelar;
import PowerUps.DobleFuerza;
import PowerUps.Escudo;
import PowerUps.PowerUp;
import PowerUps.TorreAleatoria;

public class VisitorProyectilAliado extends Visitor {
	
	protected ProyectilAliado miProyectil;
	
	public VisitorProyectilAliado(ProyectilAliado miProyectil) {
		this.miProyectil=miProyectil;
	}

	@Override
	public void visit(Torre torre) {
		//nada
		
	}

	@Override
	public void visit(Enemigo enemigo) {
		if(enemigo.estaVivo()) {
			enemigo.danar(miProyectil.getDano());
			miProyectil.morir();
		}
	}

	@Override
	public void visit(Proyectil proyectil) {
		//nada
		
	}

	@Override
	public void visit(ObstaculoVida obstaculo) {
		// nada
		
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
