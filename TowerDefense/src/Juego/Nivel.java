package Juego;

import java.util.Queue;

import Objetos.ObjetoMapa;
import Personajes.Enemigo;

import java.util.ArrayDeque;

public class Nivel {
	protected Queue<Oleada> oleadas;
	protected int presupuestoBase;
	
	public Nivel(int n) {
		oleadas=new ArrayDeque<Oleada>(3);
		if(n==1) {
			presupuestoBase=500;
			for(int i=0;i<3;i++)
				oleadas.add(new Oleada("./src/Oleadas/Nivel1/Oleada"+(i+1)+".txt"));
		}
		else {
			presupuestoBase=300;
			for(int i=0;i<3;i++)
				oleadas.add(new Oleada("./src/Oleadas/Nivel2/Oleada"+(i+1)+".txt"));
		}
	}
	
	public boolean quedanEnemigos(int i) {
		return oleadas.peek().quedanEnemigos(i);
	}
	
	public Queue<ObjetoMapa> getColaObstaculos(){
		return oleadas.peek().getColaObstaculos();
	}
	
	public Enemigo getEnemigo(int i) {
		return oleadas.peek().getEnemigo(i);
	}
	
	public int cantEnemigos() {
		return oleadas.peek().cantEnemigos();
	}
	
	public boolean siguienteOleada() {
		oleadas.poll();
		return !oleadas.isEmpty();
	}
	
	public int getPresupuestoBase() {
		return presupuestoBase;
	}
}
