package Visitor;

import Objetos.ObstaculoTiempo;
import Objetos.ObstaculoVida;
import Objetos.Proyectil;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.*;
import Tienda.Tienda;

public class VisitorClick extends Visitor{

	@Override
	public void visit(Torre torre) {
		// TODO Auto-generated method stub
		
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
	public void visit(Bomba b) {
		Tienda.getTienda().disponibleBomba();
		b.morir();
	}

	@Override
	public void visit(Congelar c) {
		Tienda.getTienda().disponibleCongelar();
		c.morir();
	}

	@Override
	public void visit(DobleFuerza d) {
		Tienda.getTienda().disponibleDobleFuerza();
		d.morir();
	}

	@Override
	public void visit(TorreAleatoria t) {
		Tienda.getTienda().disponibleTorreAleatoria();
		t.morir();
	}

	@Override
	public void visit(Escudo e) {
		Tienda.getTienda().disponibleEscudo();
		e.morir();
	}

}
