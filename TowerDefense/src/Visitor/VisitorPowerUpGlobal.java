package Visitor;

import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Objetos.Proyectil;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUpsEfecto.PowerUpGlobal;
import PowerUpsRecolectable.BombaRecolectable;
import PowerUpsRecolectable.CongelarRecolectable;
import PowerUpsRecolectable.DobleFuerzaRecolectable;
import PowerUpsRecolectable.EscudoRecolectable;
import PowerUpsRecolectable.TorreAleatoriaRecolectable;

public class VisitorPowerUpGlobal extends Visitor {
	protected PowerUpGlobal miPowerUp;
	public VisitorPowerUpGlobal(PowerUpGlobal p) {
		miPowerUp=p;
	}

	@Override
	public void visit(Torre torre) {
		miPowerUp.aplicar(torre);
	}

	@Override
	public void visit(Enemigo enemigo) {
		miPowerUp.aplicar(enemigo);
	}

	@Override
	public void visit(Proyectil proyectil) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ObstaculoVida obstaculo) {
		miPowerUp.aplicar(obstaculo);
	}

	@Override
	public void visit(ObstaculoTiempo obstaculo) {
		miPowerUp.aplicar(obstaculo);
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
