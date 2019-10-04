package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.ProyectilAliado;
import Visitor.Visitor;
import Visitor.VisitorAliado;

public abstract class Torre extends Personaje{
	
	protected Torre(Mapa mapa,Celda celda,int vidaMax,String rutaImagen,int dano,int alcance,String rutaProyectil) {
		super(mapa,celda,vidaMax,rutaImagen,dano,alcance,rutaProyectil);
		visitor=new VisitorAliado(this);
	}
	public ProyectilAliado atacar() {
		return new ProyectilAliado(mapa, celda, dano,alcance,rutaProyectil);
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void accept() {
		visitor.visit(this);
	}
	
	public void actuar() {
		
		if(contadorPulsos==0) {
			mapa.crearProyectil(atacar());
		}
		contadorPulsos=(contadorPulsos+1)%topePulso;
	}
}
