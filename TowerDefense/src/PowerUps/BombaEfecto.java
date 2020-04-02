package PowerUps;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Juego.AutoRemove;
import Juego.Celda;
import Juego.Elemento;
import Juego.GUI;
import Juego.Mapa;
import Tienda.Tienda;

public class BombaEfecto extends PowerUpCelda {
	protected static int dano=500;
	protected static String imagen="./src/Sprites/Premios/Bomba.png";
	protected static String desc="Bomba";
	protected static String explosion="./src/Sprites/Efectos/Explosiones/Explosion.gif";
	
	public BombaEfecto() {
		super(imagen,desc);
	}

	@Override
	public void activar(Celda c) {
		AutoRemove a;
		Elemento e;
		JLabel exp;
		ImageIcon img=new ImageIcon(explosion);
		img.getImage().flush();
		for(int i=(c.getX()<1?0:c.getX()-1);i<=(c.getX()>8?9:c.getX()+1);i++) {
			for(int j=(c.getY()<1?0:c.getY()-1);j<=(c.getY()>4?5:c.getY()+1);j++) {
				e=Mapa.getMapa().getGrilla()[i][j].getElem();
				exp=new JLabel(img);
				exp.setBounds(96*i,96*j,96,96);
				GUI.getGUI().getContentPane().add(exp);
				GUI.getGUI().getContentPane().setComponentZOrder(exp, 0);
				exp.repaint();
				a=new AutoRemove(exp,2000);
				a.start();
				assert e!=null;
				e.danar(null, dano);
			}
		}
	}
	public void usar() {
		Tienda.getTienda().usar(this);
	}
	
	
}
