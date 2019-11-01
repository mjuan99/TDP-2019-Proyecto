package Visitor;

import Objetos.*;
import Personajes.*;
import PowerUpsRecolectable.BombaRecolectable;
import PowerUpsRecolectable.CongelarRecolectable;
import PowerUpsRecolectable.DobleFuerzaRecolectable;
import PowerUpsRecolectable.EscudoRecolectable;
import PowerUpsRecolectable.TorreAleatoriaRecolectable;

public class VisitorAliado extends Visitor {

	protected Torre miTorre;
	
	public VisitorAliado(Torre miTorre) {
		this.miTorre=miTorre;
	}

	public void visit(Torre torre) {}
	
	public void visit(Enemigo enemigo) {
		miTorre.atacar();
	}

	public void visit(Proyectil proyectil) {}

	public void visit(BombaRecolectable powerup) {}
	
	public void visit(DobleFuerzaRecolectable powerup) {}

	@Override
	public void visit(ObjetoJugadorVida objeto) {}

	@Override
	public void visit(ObjetoJugadorTiempo objeto) {}

	@Override
	public void visit(ObjetoMapaVida objeto) {}

	@Override
	public void visit(ObjetoMapaTiempo objeto) {}

	@Override
	public void visit(CongelarRecolectable c) {}

	@Override
	public void visit(TorreAleatoriaRecolectable t) {}

	@Override
	public void visit(EscudoRecolectable e) {}
}
