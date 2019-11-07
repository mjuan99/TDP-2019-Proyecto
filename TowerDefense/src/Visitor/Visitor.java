package Visitor;

import Objetos.*;
import Personajes.*;
import Premios.*;

public abstract class Visitor {
	
	abstract public void visit(Torre torre); 
	abstract public void visit(Enemigo enemigo);
	abstract public void visit(ObjetoJugadorVida objeto);
	abstract public void visit(ObjetoJugadorTiempo objeto);
	abstract public void visit(Proyectil p);
	abstract public void visit(BombaRecolectable b);
	abstract public void visit(CongelarRecolectable c);
	abstract public void visit(DobleFuerzaRecolectable d);
	abstract public void visit(TorreAleatoriaRecolectable t);
	abstract public void visit(EscudoRecolectable e);
	abstract public void visit(ObjetoMapaVida objeto);
	abstract public void visit(ObjetoMapaTiempo objeto);
}
