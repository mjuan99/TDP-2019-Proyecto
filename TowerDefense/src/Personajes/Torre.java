package Personajes;
import java.util.Iterator;

import EstadosAliado.EstadoAtaqueTorre;
import EstadosAliado.EstadoDefaultAtaque;
import EstadosAliado.EstadoDefaultDefensaT;
import EstadosAliado.EstadoDefensaTorre;
import Juego.Celda;
import Juego.Elemento;
import Juego.Jugador;
import Juego.Mapa;
import Visitor.Visitor;
import Visitor.VisitorTorre;

public abstract class Torre extends Personaje{
	protected EstadoAtaqueTorre estadoAtaque;
	protected EstadoDefensaTorre estadoDefensa;
	protected int vidaBase;
	protected int precio;
	protected String nombre;
	protected String miniatura;
	protected String estadoDobleFuerza;
	protected String estadoProtegido;
	
	protected Torre(Celda celda,int vidaMax,int tamano,String rutaImagen,String estadoProtegido,int dano,int alcance,String rutaProyectil,int precio,String miniatura,String nombre) {
		super(celda,vidaMax,tamano,rutaImagen,dano,alcance,rutaProyectil);
		this.nombre=nombre;
		this.precio=precio;
		this.estadoProtegido=estadoProtegido;
		vidaBase=vidaMax;
		this.miniatura=miniatura;
		visitor=new VisitorTorre(this);
		estadoAtaque=new EstadoDefaultAtaque(this);
		estadoDefensa=new EstadoDefaultDefensaT(this);
	}
	public String getEstadoProtegido() {
		return (estadoProtegido);
	}
	public int getPrecio() {
		return precio;
	}
	
	public void vender() {
		if(vida==vidaBase)
			Jugador.getJugador().aumentarOro(precio);
		else
			Jugador.getJugador().aumentarOro(precio/2);
		morir();
	}
	
	public void danar(Elemento e,int dano) {
		estadoDefensa.danar(e, dano);
	}
	
	public void setEstadoAtaque(EstadoAtaqueTorre e) {
		estadoAtaque=e;
	}
	
	public void setEstadoDefensa(EstadoDefensaTorre e) {
		estadoDefensa=e;
	}
	
	public void atacar() {
		ataco=true;
		estadoAtaque.atacar();
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void actuar() {
		Iterator<Elemento> it;
		if(contadorPulsos==0) {
			it=Mapa.getMapa().elementosRango(this).iterator();
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
	
	public String getRutaProyectil() {
		return rutaProyectil;
	}
	
	public abstract Torre nueva();
	
	public String getMiniatura() {
		return miniatura;
	}
	
	public String descripcion() {
		return nombre+"\n"+"$"+precio+"\n"+"Vida: "+vida+"\n"+"Daño: "+dano+"  ("+alcance+")";
	}
}
