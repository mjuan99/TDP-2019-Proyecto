package Personajes;
import java.util.Iterator;

import EstadosAliado.EstadoAtaqueAliado;
import EstadosAliado.EstadoDefaultAtaque;
import EstadosAliado.EstadoDefaultDefensaA;
import EstadosAliado.EstadoDefensaAliado;
import EstadosAliado.EstadoDobleFuerzaAtaque;
import EstadosAliado.EstadoProtegidoAliado;
import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;
import Visitor.Visitor;
import Visitor.VisitorAliado;

public abstract class Torre extends Personaje{
	protected EstadoAtaqueAliado estadoAtaque;
	protected EstadoDefensaAliado estadoDefensa;
	
	protected Torre(Celda celda,int vidaMax,int tamano,String rutaImagen,int dano,int alcance,String rutaProyectil) {
		super(celda,vidaMax,tamano,rutaImagen,dano,alcance,rutaProyectil);
		visitor=new VisitorAliado(this);
		estadoAtaque=new EstadoDefaultAtaque(this);
		estadoDefensa=new EstadoDefaultDefensaA(this);
	}
	
	public void danar(Elemento e,int dano) {
		estadoDefensa.danar(e, dano);
	}
	
	public void setEstadoAtaque(EstadoAtaqueAliado e) {
		estadoAtaque=e;
	}
	
	public void setEstadoDefensa(EstadoDefensaAliado e) {
		estadoDefensa=e;
	}
	
	public void atacar() {
		ataco=true;
		estadoAtaque.atacar();
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void accept() {
		visitor.visit(this);
	}
	
	public void actuar() {
		Iterator<Elemento> it=Mapa.getMapa(0).elementosRango(this).iterator();
		if(contadorPulsos==0) {
			ataco=false;
			while(!ataco&&it.hasNext())
				it.next().accept(visitor);
			if(ataco)
				contadorPulsos=(contadorPulsos+1)%topePulso;
		}else
			contadorPulsos=(contadorPulsos+1)%topePulso;
	}
	
	public int getDano() {
		return dano;
	}
	
	public int getAlcance() {
		return alcance;
	}
	
	public String getRutaProyectil() {
		return rutaProyectil;
	}
}
