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
	public void visit(Proyectil proyectil) {}

	@Override
	public void visit(ObstaculoVida obstaculo) {}

	@Override
	public void visit(ObstaculoTiempo obstaculo) {}

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

}
