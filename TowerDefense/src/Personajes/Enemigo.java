package Personajes;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Juego.AutoRemove;
import Juego.Celda;
import Juego.Mapa;
import Objetos.ProyectilEnemigo;

public abstract class Enemigo extends Personaje{
	
	protected int contadorMov=0;
	protected boolean moviendo=false;
	protected int celdaDestino;
	protected String animacionMuerte;
	
	protected Enemigo(Mapa mapa,Celda celda,int vidaMax,String rutaImagen,String animacionMuerte,int dano,int alcance,String rutaProyectil) {
		super(mapa,celda,vidaMax,rutaImagen,dano,alcance,rutaProyectil);
		this.animacionMuerte=animacionMuerte;
	}
	
	public ProyectilEnemigo Atacar() {
		return new ProyectilEnemigo(mapa, celda, dano,alcance,rutaProyectil);
	}
	
	public void accept() {
		visitor.visit(this);
	}
	
	public void actuar() {
		//System.out.println(componenteGrafica);
		Rectangle r=componenteGrafica.getBounds();
		if(!moviendo) {
			if(mapa.puedeAvanzar(this)) {
				celdaDestino=celda.getX()-1;
				mapa.avanzar(this);
				moviendo=true;
			}else {
				morir();
			}
		}
		else
			if(celdaDestino*96<componenteGrafica.getBounds().getX()) 
				componenteGrafica.setBounds((int)r.getX()-12,(int)r.getY(),96,96);
			else
				moviendo=false;
	}
	public void setMapa(Mapa mapa) {
		this.mapa=mapa;
	}
	
	public void danar(int dano) {
		if(vida<=dano)
			morir();
		else
			vida-=dano;
		System.out.println(vida);
	}
	
	public void morir() {
		//ImageIcon img=new ImageIcon("./src/Sprites/Efectos/Explosion2.gif");
		//img.getImage().flush();
		//mapa.getControlador().getGui().setearLabel(this,"./src/Sprites/Efectos/Explosion2.gif");
		mapa.getJugador().sumarPuntos(50);
		mapa.eliminarElemento(this);
		AutoRemove a=new AutoRemove(this,2000,animacionMuerte);
		a.start();
	}
}
