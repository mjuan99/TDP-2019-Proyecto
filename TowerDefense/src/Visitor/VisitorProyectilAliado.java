package Visitor;

import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Objetos.Proyectil;
import Objetos.ProyectilAliado;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUpsRecolectable.BombaRecolectable;
import PowerUpsRecolectable.CongelarRecolectable;
import PowerUpsRecolectable.DobleFuerzaRecolectable;
import PowerUpsRecolectable.EscudoRecolectable;
import PowerUpsRecolectable.TorreAleatoriaRecolectable;

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
			enemigo.danar(miProyectil.getCreador(),miProyectil.getDano());
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
	public void visit(BombaRecolectable b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(CongelarRecolectable c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(DobleFuerzaRecolectable d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(TorreAleatoriaRecolectable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(EscudoRecolectable e) {
		// TODO Auto-generated method stub
		
	}

}
