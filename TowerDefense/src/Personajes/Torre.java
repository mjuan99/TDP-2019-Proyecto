package Personajes;
import Juego.Celda;
import Juego.Mapa;
import Objetos.ProyectilAliado;

public abstract class Torre extends Personaje{
	
	protected Torre(Mapa mapa,Celda celda,int vidaMax,String rutaImagen,int dano,int alcance,String rutaProyectil) {
		super(mapa,celda,vidaMax,rutaImagen,dano,alcance,rutaProyectil);
	}
	public ProyectilAliado Atacar() {
		return new ProyectilAliado(dano,alcance,rutaProyectil);
	}
}
