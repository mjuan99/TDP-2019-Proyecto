package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.ProyectilAliado;

public abstract class Torre extends Personaje{
	
	protected Torre(Mapa mapa,Celda celda,int vidaMax,String rutaImagen,int dano,int alcance,String rutaProyectil) {
		super(mapa,celda,vidaMax,rutaImagen,dano,alcance,rutaProyectil);
	}
	public ProyectilAliado atacar() {
		return new ProyectilAliado(mapa, celda, dano,alcance,rutaProyectil);
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
