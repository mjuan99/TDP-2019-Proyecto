package Visitor;

import Objetos.*;
import Personajes.*;
import PowerUpsRecolectable.PowerUpRecolectable;
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

	public void visit(Torre torre) {
		//nada
	}
	
	public void visit(Enemigo enemigo) {
		miTorre.atacar();
	}

	public void visit(Proyectil proyectil) {
		//nada
	}

	public void visit(BombaRecolectable powerup) {
		//realizar metodo de adquisicion

	}
	
	public void visit(DobleFuerzaRecolectable powerup) {
//		miTorre.atacar(danio*2);
	}

	@Override
	public void visit(ObstaculoVida obstaculo) {
		//nada
		
	}

	@Override
	public void visit(ObstaculoTiempo obstaculo) {
		//nada
		
	}

	@Override
	public void visit(CongelarRecolectable c) {
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
