package Visitor;

import Objetos.ObjetoJugadorTiempo;
import Objetos.ObjetoJugadorVida;
import Objetos.ObjetoMapaTiempo;
import Objetos.ObjetoMapaVida;
import Objetos.Proyectil;
import Personajes.Enemigo;
import Personajes.Torre;
import Premio.*;
import Tienda.Tienda;

public class VisitorClick extends Visitor{

	@Override
	public void visit(Torre torre) {
		Tienda.getTienda().seleccionar(torre);
	}

	@Override
	public void visit(Enemigo enemigo) {
		Tienda.getTienda().seleccionar(enemigo.getCelda());
	}

	@Override
	public void visit(ObjetoJugadorVida objeto) {
		Tienda.getTienda().seleccionar(objeto.getCelda());
	}

	@Override
	public void visit(ObjetoJugadorTiempo objeto) {
		Tienda.getTienda().seleccionar(objeto.getCelda());
	}

	@Override
	public void visit(ObjetoMapaVida objeto) {
		Tienda.getTienda().seleccionar(objeto.getCelda());
	}

	@Override
	public void visit(ObjetoMapaTiempo objeto) {
		Tienda.getTienda().seleccionar(objeto.getCelda());
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

	@Override
	public void visit(Proyectil p) {
		Tienda.getTienda().seleccionar(p.getCelda());
	}

}
