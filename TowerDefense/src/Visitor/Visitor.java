package Visitor;

import Objetos.*;
import Personajes.*;
import PowerUpsRecolectable.*;

public abstract class Visitor {
	
	abstract public void visit(Torre torre); 
	abstract public void visit(Enemigo enemigo);
	abstract public void visit(Proyectil proyectil);
	abstract public void visit(ObstaculoVida obstaculo);
	abstract public void visit(ObstaculoTiempo obstaculo);
	abstract public void visit(BombaRecolectable b);
	abstract public void visit(CongelarRecolectable c);
	abstract public void visit(DobleFuerzaRecolectable d);
	abstract public void visit(TorreAleatoriaRecolectable t);
	abstract public void visit(EscudoRecolectable e);
}
