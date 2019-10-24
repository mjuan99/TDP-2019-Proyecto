package Personajes;

import java.awt.Rectangle;
import java.util.Iterator;

import Juego.AutoRemove;
import Juego.Celda;
import Juego.Controlador;
import Juego.Elemento;
import Juego.Jugador;
import Juego.Mapa;
import Objetos.ProyectilEnemigo;
import PowerUps.*;
import Visitor.Visitor;
import Visitor.VisitorEnemigo;

public abstract class Enemigo extends Personaje{
	
	protected int contadorMov=0;
	protected int velocidad;
	protected boolean moviendo=false;
	protected int celdaDestino;
	protected String animacionMuerte;
	
	protected Enemigo(Celda celda,int vidaMax,int tamano,String rutaImagen,String animacionMuerte,int dano,int alcance,String rutaProyectil,int velocBase) {
		super(celda,vidaMax,tamano,rutaImagen,dano,alcance,rutaProyectil);
		this.animacionMuerte=animacionMuerte;
		velocidad=velocBase;
		visitor=new VisitorEnemigo(this);
	}
	
	public void atacar() {
		ataco=true;
		Mapa.getMapa(0).crearProyectil(new ProyectilEnemigo(celda, dano,alcance,rutaProyectil));
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void actuar() {
		if (contadorPulsos==0) {
			Rectangle r = componenteGrafica.getBounds();
			if (!moviendo) {
				ataco=false;
				Iterator<Elemento> it=Mapa.getMapa(0).elementosRango(this).iterator();
				while(!ataco&&it.hasNext())
					it.next().accept(visitor);
				if(ataco)
					contadorPulsos++;
				else
					if (Mapa.getMapa(0).puedeAvanzar(this)) {
						celdaDestino = celda.getX() - 1;
						Mapa.getMapa(0).avanzar(this);
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
	
	public void morir() {
		//ImageIcon img=new ImageIcon("./src/Sprites/Efectos/Explosion2.gif");
		//img.getImage().flush();
		//mapa.getControlador().getGui().setearLabel(this,"./src/Sprites/Efectos/Explosion2.gif");
		Jugador.getJugador().sumarPuntos(50);
		Celda celda= this.getCelda();
		Mapa.getMapa(0).eliminarElemento(this);
		Mapa.getMapa(0).decrementarEnemigos();
		vivo=false;
		AutoRemove a=new AutoRemove(this,2000,animacionMuerte);
		a.start();
		if((int)(Math.random()*10)<3)
			Controlador.getControlador().crearPowerUp(getPowerUp((int)(Math.random()*5),celda),celda);
	
	}
	
	private PowerUp getPowerUp(int i,Celda celda) {
		PowerUp p=null;
		switch(i) {
		case 0:{p=new Bomba(celda);break;}
		case 1:{p=new Escudo(celda);break;}
		case 2:{p=new Congelar(celda);break;}
		case 3:{p=new DobleFuerza(celda);break;}
		case 4:{p=new TorreAleatoria(celda);break;}
		}
		return p;
	}
	

}
