package Visitor;

import Objetos.*;
import Personajes.*;
import Premios.*;

public abstract class Visitor {
	
	public abstract void visit(Torre torre); 
	public abstract void visit(Enemigo enemigo);
	public abstract void visit(ObjetoJugadorVida objeto);
	public abstract void visit(ObjetoJugadorTiempo objeto);
	public abstract void visit(Proyectil p);
	public abstract void visit(BombaRecolectable b);
	public abstract void visit(CongelarRecolectable c);
	public abstract void visit(DobleFuerzaRecolectable d);
	public abstract void visit(TorreAleatoriaRecolectable t);
	public abstract void visit(EscudoRecolectable e);
	public abstract void visit(ObjetoMapaVida objeto);
	public abstract void visit(ObjetoMapaTiempo objeto);
}
