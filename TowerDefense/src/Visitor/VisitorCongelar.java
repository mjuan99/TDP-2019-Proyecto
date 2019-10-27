package Visitor;

import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Objetos.Proyectil;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUpsRecolectable.PowerUpRecolectable;
import PowerUpsRecolectable.BombaRecolectable;
import PowerUpsRecolectable.CongelarRecolectable;
import PowerUpsRecolectable.DobleFuerzaRecolectable;
import PowerUpsRecolectable.EscudoRecolectable;
import PowerUpsRecolectable.TorreAleatoriaRecolectable;

public class VisitorCongelar extends Visitor {

	@Override
	public void visit(Torre torre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Enemigo enemigo) {
		//Congelar enemigo
		//enemigo.setEstado(new Congelado(enemigo));
	}

	@Override
	public void visit(Proyectil proyectil) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ObstaculoVida obstaculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ObstaculoTiempo obstaculo) {
		// TODO Auto-generated method stub
		
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
