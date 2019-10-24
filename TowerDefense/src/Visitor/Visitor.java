package Visitor;

import Objetos.*;
import PowerUps.*;
import Personajes.*;

public abstract class Visitor {
	
	abstract public void visit(Torre torre); 
	abstract public void visit(Enemigo enemigo);
	abstract public void visit(Proyectil proyectil);
	abstract public void visit(ObstaculoVida obstaculo);
	abstract public void visit(ObstaculoTiempo obstaculo);
	abstract public void visit(Bomba b);
	abstract public void visit(Congelar c);
	abstract public void visit(DobleFuerza d);
	abstract public void visit(TorreAleatoria t);
	abstract public void visit(Escudo e);
}
