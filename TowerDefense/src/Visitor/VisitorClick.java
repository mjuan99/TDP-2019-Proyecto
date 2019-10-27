package Visitor;

import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Objetos.Proyectil;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUpsRecolectable.*;
import Tienda.Tienda;

public class VisitorClick extends Visitor{

	@Override
	public void visit(Torre torre) {
		Tienda.getTienda().seleccionar(torre);
	}

	@Override
	public void visit(Enemigo enemigo) {
		// TODO Auto-generated method stub
		
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
		Tienda.getTienda().disponibleBomba();
		b.morir();
	}

	@Override
	public void visit(CongelarRecolectable c) {
		Tienda.getTienda().disponibleCongelar();
		c.morir();
	}

	@Override
	public void visit(DobleFuerzaRecolectable d) {
		Tienda.getTienda().disponibleDobleFuerza();
		d.morir();
	}

	@Override
	public void visit(TorreAleatoriaRecolectable t) {
		Tienda.getTienda().disponibleTorreAleatoria();
		t.morir();
	}

	@Override
	public void visit(EscudoRecolectable e) {
		Tienda.getTienda().disponibleEscudo();
		e.morir();
	}

}
