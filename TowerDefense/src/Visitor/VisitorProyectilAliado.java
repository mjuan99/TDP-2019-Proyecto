package Visitor;

import Objetos.Obstaculo;
import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Objetos.PowerUp;
import Objetos.Proyectil;
import Objetos.ProyectilAliado;
import Personajes.Enemigo;
import Personajes.Torre;

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
		enemigo.danar(miProyectil.getDano());
		miProyectil.morir();
	}

	@Override
	public void visit(Proyectil proyectil) {
		//nada
		
	}

	@Override
	public void visit(PowerUp powerup) {
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

}
