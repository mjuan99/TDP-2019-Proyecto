package Personajes;
import Juego.Celda;
import Juego.Mapa;
import PowerUpsEfecto.CongelarEfecto;
import PowerUpsEfecto.DobleFuerzaEfecto;
import PowerUpsEfecto.TorreAleatoriaEfecto;

public class Leviatan extends Torre {
	
	protected static int vidaBase=1500;
	protected static int tam=2;
	protected static int danoBase=0;
	protected static int alcanceBase=0;
	protected static String imagen ="./src/Sprites/Torres/Onix.gif";
	protected static String proyectil="";
	
	public Leviatan(Celda celda) {
		super(celda,vidaBase,tam,imagen,danoBase,alcanceBase,proyectil);
		new TorreAleatoriaEfecto().activar(Mapa.getMapa(0).getGrilla()[(int)(Math.random()*9)][(int)(Math.random()*6)]);
	}
	
	public void actuar() {}
	
	
}