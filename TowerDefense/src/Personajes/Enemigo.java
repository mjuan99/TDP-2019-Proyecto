package Personajes;

import java.awt.Rectangle;
import java.util.Iterator;

import javax.swing.ImageIcon;

import EstadosEnemigo.EstadoActuarEnemigo;
import EstadosEnemigo.EstadoDefaultActuar;
import EstadosEnemigo.EstadoDefaultDefensaE;
import EstadosEnemigo.EstadoDefensaEnemigo;
import Juego.AutoRemove;
import Juego.Celda;
import Juego.Controlador;
import Juego.Elemento;
import Juego.Jugador;
import Juego.Mapa;
import Objetos.ProyectilEnemigo;
import Visitor.Visitor;
import Visitor.VisitorEnemigo;

public abstract class Enemigo extends Personaje{
	
	protected int oroMin;
	protected int oroMax;
	protected int puntos;
	protected EstadoDefensaEnemigo estadoDefensa;
	protected EstadoActuarEnemigo estadoActuar;
	protected int contadorMov=0;
	protected int velocidad;
	protected boolean moviendo=false;
	protected int celdaDestino;
	protected String imagenCongelado;
	protected String animacionMuerte;
	protected String imagenProtegido;
	
	protected Enemigo(Celda celda,int vidaMax,int tamano,String rutaImagen,String imagenCongelado,String imagenProtegido,String animacionMuerte,int dano,int alcance,String rutaProyectil,int velocBase, int oroMin, int oroMax, int puntos) {
		super(celda,vidaMax,tamano,rutaImagen,dano,alcance,rutaProyectil);
		this.animacionMuerte=animacionMuerte;
		this.imagenCongelado=imagenCongelado;
		this.imagenProtegido=imagenProtegido;
		velocidad=velocBase;
		visitor=new VisitorEnemigo(this);
		estadoActuar=new EstadoDefaultActuar(this);
		estadoDefensa=new EstadoDefaultDefensaE(this);
		this.oroMin=oroMin;
		this.oroMax=oroMax;
		this.puntos=puntos;
	}
	
	public void atacar() {
		ataco=true;
		Mapa.getMapa().crearElementoIntangible(new ProyectilEnemigo(celda,this, dano,alcance,rutaProyectil));
	}
	
	public void danar(Elemento e,int dano) {
		estadoDefensa.danar(e, dano);
	}
	
	public void setEstadoDefensa(EstadoDefensaEnemigo e) {
		estadoDefensa=e;
	}
	
	public void setEstadoActuar(EstadoActuarEnemigo e) {
		estadoActuar=e;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void actuar() {
		estadoActuar.actuar();
	}
	
	public void actuarDefault() {
		Celda anterior;
		if (contadorPulsos==0) {
			Rectangle r = componenteGrafica.getBounds();
			if (!moviendo) {
				ataco=false;
				Iterator<Elemento> it=Mapa.getMapa().elementosRango(this).iterator();
				while(!ataco&&it.hasNext())
					it.next().accept(visitor);
				if(ataco)
					contadorPulsos++;
				else
					if (Mapa.getMapa().puedeAvanzar(this)) {
						celdaDestino = celda.getX() - 1;
						anterior=celda;
						celda=Mapa.getMapa().getGrilla()[anterior.getX()-1][anterior.getY()];
						anterior.setElem(null);
						celda.setElem(this);
						moviendo = true;
					}
			} else 
				if (celdaDestino * 96 < componenteGrafica.getBounds().getX())
					componenteGrafica.setBounds((int) r.getX() - velocidad, (int) r.getY(), 96, 96);
				else
					moviendo = false;
		}else
			contadorPulsos=(contadorPulsos+1)%topePulso;
	}
	
	public String getImagenCongelado() {
		return imagenCongelado;
	}
	
	public String getImagenProtegido() {
		return imagenProtegido;
	}
	
	public void morir() {
		Jugador.getJugador().sumarPuntos(puntos);
		Jugador.getJugador().aumentarOro((int)(Math.random()*(oroMax-oroMin))+oroMin);
		Celda celda= this.getCelda();
		Mapa.getMapa().eliminarElemento(this);
		Mapa.getMapa().decrementarEnemigos();
		vivo=false;
		ImageIcon img = new ImageIcon(animacionMuerte);
		img.getImage().flush();
		componenteGrafica.setIcon(img);
		componenteGrafica.setEnabled(false);
		AutoRemove a=new AutoRemove(componenteGrafica,2000);
		a.start();
		Controlador.getControlador().crearPowerUpAleatorio(celda);
	
	}
	

}
