package Tienda;

import Juego.Celda;
import Juego.GUI;
import Objetos.ObjetoJugador;
import Personajes.Torre;
import PowerUps.*;

public final class Tienda {
	protected int ultPowerUp;
	protected TiendaEstado estado;
	private static Tienda tienda;
	protected boolean []premiosDisponibles;
	
	private Tienda () {
		estado=new TiendaDefaultEstado();
		premiosDisponibles=new boolean[5];
		for(int i=0;i<premiosDisponibles.length;i++)
			premiosDisponibles[i]=false;
	}
	
	public static Tienda getTienda() {
		if (tienda==null)
			return (tienda=new Tienda());
		else
			return tienda;
	}
	
	public void reset() {
		estado=new TiendaDefaultEstado();
		for(int i=0;i<premiosDisponibles.length;i++)
			premiosDisponibles[i]=false;
	}
	
	public void comprar(Torre t) {
		estado=new TiendaComprarTorre(t);
	}
	
	public void comprar(ObjetoJugador o) {
		estado=new TiendaComprarObjeto(o);
	}
	
	public void vender() {
		estado=new TiendaVenderTorre();
	}
	
	public void setEstado(TiendaEstado e){
		estado=e;
	}
	
	public void seleccionar(Torre t) {
		estado.seleccionar(t);
	}
	
	public void seleccionar(Celda c) {
		estado.seleccionar(c);
	}
	
	public void usar(CongelarEfecto c) {
		GUI.getGUI().habilitarBotonPremio(0, false);
		c.activar();
	}
	
	public void usar(DobleFuerzaEfecto d) {
		GUI.getGUI().habilitarBotonPremio(1, false);
		d.activar();
	}
	
	public void usar(BombaEfecto b) {
		ultPowerUp=2;
		estado=new TiendaPowerUpCelda(b);
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
	
}