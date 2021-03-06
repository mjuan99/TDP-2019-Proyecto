package PowerUps;

import java.util.Random;

import Juego.Celda;
import Juego.Mapa;
import Personajes.Alien;
import Personajes.Dinosaurio;
import Personajes.Dragon;
import Personajes.Fantasma;
import Personajes.Fenix;
import Personajes.Golem;
import Personajes.Hada;
import Personajes.Torre;
import Tienda.Tienda;

public class TorreAleatoriaEfecto extends PowerUpCelda {
	protected static String imagen="./src/Sprites/Premios/TorreAleatoria.png";
	protected static String desc="TorreAleatoria";
	private Random random = new Random();
	
	public TorreAleatoriaEfecto() {
		super(imagen,desc);
	}

	@Override
	public void activar(Celda c) {
		if(c.getElem()==null&&c.getX()<9)
			Mapa.getMapa().crearElemento(getTorre(), c.getX(), c.getY());
	}
	public void usar() {
		Tienda.getTienda().usar(this);
	}
	
	private Torre getTorre() {
		Torre t=null;
		int i= this.random.nextInt(7);
		switch(i) {
		case 0:{t=new Alien(null);break;}
		case 1:{t=new Dragon(null);break;}
		case 2:{t=new Dinosaurio(null);break;}
		case 3:{t=new Fantasma(null);break;}
		case 4:{t=new Fenix(null);break;}
		case 5:{t=new Golem(null);break;}
		case 6:{t=new Hada(null);break;}
		}
		return t;
	}

}
