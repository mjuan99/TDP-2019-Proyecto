package Tienda;

import Juego.Celda;
import Juego.Elemento;
import Juego.GUI;
import Juego.Jugador;
import Objetos.Obstaculo;
import Personajes.Torre;
import PowerUpsEfecto.*;
import PowerUpsRecolectable.*;

public class Tienda {
	protected int ultPowerUp;
	protected TiendaEstado estado;
	private static Tienda tienda;
	protected Jugador jugador;
	protected Torre proxTorre;
	protected boolean premiosDisponibles[];
	
	private Tienda () {
		estado=new TiendaDefaultEstado();
		premiosDisponibles=new boolean[5];
		for(int i=0;i<5;i++)
			premiosDisponibles[i]=false;
	}
	
	public void setEstado(TiendaEstado e){
		estado=e;
	}
	
	public static Tienda getTienda() {
		if (tienda==null)
			return (tienda=new Tienda());
		else
			return tienda;
	}
	
	public void seleccionar(Torre t) {
		estado.seleccionar(t);
	}
	
	public void seleccionar(Celda c) {
		estado.selecciontar(c);
	}
	
	public void usar(BombaEfecto b) {
		ultPowerUp=2;
		estado=new TiendaPowerUpCelda(b);
	}
	
	public void usar(CongelarEfecto c) {
		GUI.getGUI().habilitarBotonPremio(0, false);
		c.activar();
	}
	
	public void usar(DobleFuerzaEfecto d) {
		GUI.getGUI().habilitarBotonPremio(1, false);
		d.activar();
	}
	
	public void usar(EscudoEfecto e) {
		ultPowerUp=3;
		estado=new TiendaPowerUpTorre(e);
	}
	
	public void usar(TorreAleatoriaEfecto t) {
		ultPowerUp=4;
		estado=new TiendaPowerUpCelda(t);
	}
	
	public void deshabilitarUltimoPowerUp() {
		GUI.getGUI().habilitarBotonPremio(ultPowerUp, false);
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
		GUI.getGUI().habilitarBotonPremio(i,true);
	}
	
	public void comprar(Torre t) {
		estado=new TiendaComprarTorre(t);
	}
	
	public void comprar(Obstaculo o) {
		estado=new TiendaComprarObstaculo(o);
	}
	
	public void vender() {
		estado=new TiendaVenderTorre();
	}
	
	/*public void ubicar(int x, int y) {
		if(proxTorre!=null&&Controlador.getControlador().agregarTorre(proxTorre,x, y)) {
			//jugador.decrementarOro(proxTorre.getPrecio());
			proxTorre=null;
			GUI.getGUI().deseleccionarBotones();
		}
	}*/
	
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