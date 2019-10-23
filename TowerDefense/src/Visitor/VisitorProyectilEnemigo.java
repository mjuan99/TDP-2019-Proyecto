package Visitor;

import Objetos.Obstaculo;
import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Objetos.Proyectil;
import Objetos.ProyectilEnemigo;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;

public class VisitorProyectilEnemigo extends Visitor {
	
	protected ProyectilEnemigo miProyectil;
	
	public VisitorProyectilEnemigo(ProyectilEnemigo miProyectil) {
		this.miProyectil=miProyectil;
	}

	@Override
	public void visit(Torre torre) {
		//dañar torre

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
		// dañar obstaculo
		
	}

	@Override
	public void visit(ObstaculoTiempo obstaculo) {
		// morir proyectil
		
	}

}
