package PowerUpsEfecto;

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

public class TorreAleatoriaEfecto extends PowerUpCelda {

	@Override
	public void activar(Celda c) {
		if(c.getElem()==null&&c.getX()<9)
			Mapa.getMapa(0).crearElemento(getTorre((int)(Math.random()*7)), c.getX(), c.getY());
	}
	
	private Torre getTorre(int i) {
		Torre t=null;
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
