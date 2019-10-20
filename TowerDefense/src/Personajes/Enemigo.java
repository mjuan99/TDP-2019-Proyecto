package Personajes;

import java.awt.Rectangle;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Juego.AutoRemove;
import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;
import Objetos.ProyectilEnemigo;
import Visitor.Visitor;
import Visitor.VisitorEnemigo;

public abstract class Enemigo extends Personaje{
	
	protected int contadorMov=0;
	protected boolean moviendo=false;
	protected int celdaDestino;
	protected String animacionMuerte;
	
	protected Enemigo(Mapa mapa,Celda celda,int vidaMax,int tamano,String rutaImagen,String animacionMuerte,int dano,int alcance,String rutaProyectil) {
		super(mapa,celda,vidaMax,tamano,rutaImagen,dano,alcance,rutaProyectil);
		this.animacionMuerte=animacionMuerte;
		visitor=new VisitorEnemigo(this);
	}
	
	public void atacar() {
		ataco=true;
		mapa.crearProyectil(new ProyectilEnemigo(mapa, celda, dano,alcance,rutaProyectil));
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void actuar() {
		if (contadorPulsos==0) {
			Rectangle r = componenteGrafica.getBounds();
			if (!moviendo) {
				ataco=false;
				Iterator<Elemento> it=mapa.elementosRango(this).iterator();
				while(!ataco&&it.hasNext())
					it.next().accept(visitor);
				if(ataco)
					contadorPulsos++;
				else
					if (mapa.puedeAvanzar(this)) {
						celdaDestino = celda.getX() - 1;
						mapa.avanzar(this);
						moviendo = true;
					}
			} else 
				if (celdaDestino * 96 < componenteGrafica.getBounds().getX())
					componenteGrafica.setBounds((int) r.getX() - 12, (int) r.getY(), 96, 96);
				else
					moviendo = false;
		}else
			contadorPulsos=(contadorPulsos+1)%topePulso;
	}
	
	public void setMapa(Mapa mapa) {
		this.mapa=mapa;
	}
	
	public void morir() {
		//ImageIcon img=new ImageIcon("./src/Sprites/Efectos/Explosion2.gif");
		//img.getImage().flush();
		//mapa.getControlador().getGui().setearLabel(this,"./src/Sprites/Efectos/Explosion2.gif");
		mapa.getJugador().sumarPuntos(50);
		mapa.eliminarElemento(this);
		vivo=false;
		AutoRemove a=new AutoRemove(this,2000,animacionMuerte);
		a.start();
	}
}
