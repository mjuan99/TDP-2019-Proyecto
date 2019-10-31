package PowerUpsEfecto;

import Juego.Celda;
import Juego.Elemento;
import Juego.Mapa;
import Tienda.Tienda;

public class BombaEfecto extends PowerUpCelda {
	protected static int dano=500;
	protected static String imagen="./src/Sprites/Premios/Bomba.png";
	protected static String desc="Bomba";
	
	public BombaEfecto() {
		super(imagen,desc);
	}

	@Override
	public void activar(Celda c) {
		Elemento e;
		for(int i=c.getX()-1;i<=c.getX()+1;i++) {
			for(int j=c.getY()-1;j<=c.getY()+1;j++) {
				e=Mapa.getMapa().getGrilla()[i][j].getElem();
				if(e!=null) {
					e.danar(null, dano);
				}
			}
		}
	}
	public void usar() {
		Tienda.getTienda().usar(this);
	}
	
	
}
