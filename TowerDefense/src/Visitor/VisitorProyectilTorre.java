package Visitor;

import Objetos.ObjetoJugadorTiempo;
import Objetos.ObjetoJugadorVida;
import Objetos.ObjetoMapaTiempo;
import Objetos.ObjetoMapaVida;
import Personajes.Enemigo;
import Personajes.Proyectil;
import Personajes.ProyectilTorre;
import Personajes.Torre;
import Premios.BombaRecolectable;
import Premios.CongelarRecolectable;
import Premios.DobleFuerzaRecolectable;
import Premios.EscudoRecolectable;
import Premios.TorreAleatoriaRecolectable;

public class VisitorProyectilTorre extends Visitor {
	
	protected ProyectilTorre miProyectil;
	
	public VisitorProyectilTorre(ProyectilTorre miProyectil) {
		this.miProyectil=miProyectil;
	}

	@Override
	public void visit(Torre torre) {}

	@Override
	public void visit(Enemigo enemigo) {
		if(enemigo.estaVivo()) {
			enemigo.danar(miProyectil.getCreador(),miProyectil.getDano());
			miProyectil.morir();
		}
	}

	@Override
	public void visit(ObjetoJugadorVida objeto) {}

	@Override
	public void visit(ObjetoJugadorTiempo objeto) {}

	@Override
	public void visit(ObjetoMapaVida objeto) {}

	@Override
	public void visit(ObjetoMapaTiempo objeto) {}

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
