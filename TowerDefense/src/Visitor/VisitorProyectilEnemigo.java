package Visitor;

import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Objetos.Proyectil;
import Objetos.ProyectilEnemigo;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUpsRecolectable.BombaRecolectable;
import PowerUpsRecolectable.CongelarRecolectable;
import PowerUpsRecolectable.DobleFuerzaRecolectable;
import PowerUpsRecolectable.EscudoRecolectable;
import PowerUpsRecolectable.TorreAleatoriaRecolectable;

public class VisitorProyectilEnemigo extends Visitor {
	
	protected ProyectilEnemigo miProyectil;
	
	public VisitorProyectilEnemigo(ProyectilEnemigo miProyectil) {
		this.miProyectil=miProyectil;
	}

	@Override
	public void visit(Torre torre) {
		if(torre.estaVivo()) {
			torre.danar(miProyectil.getCreador(),miProyectil.getDano());
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
	public void visit(ObstaculoVida obstaculo) {
		if(obstaculo.estaVivo()) {
			obstaculo.danar(miProyectil.getCreador(),miProyectil.getDano());
			miProyectil.morir();
		}
	}

	@Override
	public void visit(ObstaculoTiempo obstaculo) {
		miProyectil.morir();
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
