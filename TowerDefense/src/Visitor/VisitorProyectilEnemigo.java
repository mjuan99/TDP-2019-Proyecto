package Visitor;

import Objetos.ObjetoJugadorTiempo;
import Objetos.ObjetoJugadorVida;
import Objetos.ObjetoMapaTiempo;
import Objetos.ObjetoMapaVida;
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
	public void visit(Enemigo enemigo) {}

	@Override
	public void visit(ObjetoJugadorVida objeto) {
		if(objeto.estaVivo()) {
			objeto.danar(miProyectil.getCreador(),miProyectil.getDano());
			miProyectil.morir();
		}
	}

	@Override
	public void visit(ObjetoJugadorTiempo objeto) {
		miProyectil.morir();
	}

	@Override
	public void visit(ObjetoMapaVida objeto) {
		if(objeto.estaVivo()) {
			objeto.danar(miProyectil.getCreador(),miProyectil.getDano());
			miProyectil.morir();
		}
		
	}

	@Override
	public void visit(ObjetoMapaTiempo objeto) {
		miProyectil.morir();
	}

	@Override
	public void visit(BombaRecolectable b) {}

	@Override
	public void visit(CongelarRecolectable c) {}

	@Override
	public void visit(DobleFuerzaRecolectable d) {}

	@Override
	public void visit(TorreAleatoriaRecolectable t) {}

	@Override
	public void visit(EscudoRecolectable e) {}

	@Override
	public void visit(Proyectil p) {}

}
