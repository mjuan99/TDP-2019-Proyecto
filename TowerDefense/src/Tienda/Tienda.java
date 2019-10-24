package Tienda;

import Juego.Controlador;
import Juego.Elemento;
import Juego.GUI;
import Juego.Jugador;
import Personajes.Torre;
import PowerUpsRecolectable.*;

public class Tienda {
	private static Tienda tienda;
	protected Jugador jugador;
	protected Torre proxTorre;
	protected boolean premiosDisponibles[];
	
	private Tienda () {
		premiosDisponibles=new boolean[5];
		for(int i=0;i<5;i++)
			premiosDisponibles[i]=false;
	}
	
	public static Tienda getTienda() {
		if (tienda==null)
			return (tienda=new Tienda());
		else
			return tienda;
	}
	
	public void click(Elemento elemento) {
		System.out.println(elemento);
	}
	
	public void disponibleCongelar() {
		setDisponible(0);
	}
	
	public void disponibleDobleFuerza() {
		setDisponible(1);
	}
	
	public void disponibleBomba() {
		setDisponible(2);
	}
	
	public void disponibleEscudo() {
		setDisponible(3);
	}
	
	public void disponibleTorreAleatoria() {
		setDisponible(4);
	}
	
	private void setDisponible(int i) {
		premiosDisponibles[i]=true;
		GUI.getGUI().habilitarBotonPremio(i);
	}
	
	//faltan metodos de torre
	public void comprar(Torre t) {
		//if(jugador.getOro()>=t.getPrecio()) {
			proxTorre=t;
		/*}
		else {
			//no lo agrega entrega, no deberia esta habilitado el boton
		}*/
	}
	
	public void ubicar(int x, int y) {
		if(proxTorre!=null&&Controlador.getControlador().agregarTorre(proxTorre,x, y)) {
			//jugador.decrementarOro(proxTorre.getPrecio());
			proxTorre=null;
			GUI.getGUI().deseleccionarBotones();
		}
	}
	
	public void comprar(PowerUpRecolectable p) {
		/*if(jugador.getOro()>=p.getPrecio()) {
			jugador.decrementarOro(p.getPrecio());
		}*/
	}
	//la tienda deberia ocuparse de habilitar o deshabilitar los botones de compra
	public boolean disponible(Elemento e) {
		/*boolean toReturn;
		if(jugador.getOro()>=e.getPrecio()) {
			toReturn=true;
		}
		else {
			toReturn=false;
		}*/
		return false;
	}
	
}