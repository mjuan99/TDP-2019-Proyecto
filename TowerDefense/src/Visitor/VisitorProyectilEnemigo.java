package Visitor;

import Objetos.Obstaculo;
import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
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
		if(torre.estaVivo()) {
			torre.danar(miProyectil.getDano());
			miProyectil.morir();
		}
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
	public void visit(PowerUp powerup) {
		//nada

	}

	@Override
	public void visit(ObstaculoVida obstaculo) {
		if(obstaculo.estaVivo()) {
			obstaculo.danar(miProyectil.getDano());
			miProyectil.morir();
		}
	}

	@Override
	public void visit(ObstaculoTiempo obstaculo) {
		miProyectil.morir();
	}

}
