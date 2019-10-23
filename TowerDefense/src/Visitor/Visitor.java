package Visitor;

import Objetos.*;
import Personajes.*;
import PowerUps.PowerUp;

public abstract class Visitor {
	
	abstract public void visit(Torre torre); 
	abstract public void visit(Enemigo enemigo);
	abstract public void visit(Proyectil proyectil);
	abstract public void visit(ObstaculoVida obstaculo);
	abstract public void visit(ObstaculoTiempo obstaculo);
	abstract public void visit(PowerUp powerup);
}
