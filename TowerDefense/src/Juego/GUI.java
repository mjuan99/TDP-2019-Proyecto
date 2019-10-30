
package Juego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Personajes.Alien;
import Personajes.Dinosaurio;
import Personajes.Dragon;
import Personajes.Fantasma;
import Personajes.Fenix;
import Personajes.Golem;
import Personajes.Hada;
import Personajes.Leviatan;
import Personajes.Torre;
import PowerUpsEfecto.*;
import Tienda.*;

@SuppressWarnings("serial")
public class GUI extends JFrame{
	private static GUI gui;
	protected BotonTorre[] btTorres;
	protected BotonPowerUp[] btPowerUps;
	protected BotonTienda btOleada;
	protected BotonTienda btVender;
	protected JPanel contentPane;
	protected JLabel [][] celdas;
	protected JLabel puntaje;
	protected JLabel oro;
	protected static int pixel=96;
	
	private GUI() {
		super("Juego");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30,30,1100,700);
		contentPane= new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		crearFondo();
		agregarBotones();
		Integer[] niveles= {1,2};
		int nivel=JOptionPane.showOptionDialog(contentPane, "Elegir nivel", "Nivel",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, niveles, null)+1;
		Mapa.getMapa().setNivel(nivel);
		agregarJugador();
	}
	
	public static GUI getGUI() {
		if(gui==null) {
			return (gui= new GUI());
		}
		else {
			return gui;
		}
	}
	
	public void crearElemento(Elemento e) {
		int x=e.getCelda().getX();
		int y=e.getCelda().getY();
		Etiqueta elemento=new Etiqueta(e);
		elemento.setBounds(x*pixel, y*pixel, pixel, e.getTamano()*pixel);
		contentPane.add(elemento);
		contentPane.setComponentZOrder(elemento, 0);
		e.setComponenteGrafica(elemento);
		elemento.repaint();
	}
	
	public void eliminarComponente(JLabel c) {
		if(contentPane.isAncestorOf(c)) {
			c.setIcon(null);
			c.setBounds(0,0,0,0);
			contentPane.remove(c);
		}
	}
	
	public void actualizarOro() {
		int n=Jugador.getJugador().getOro();
		oro.setText("Oro: "+n);
		for(int i=0;i<btTorres.length;i++)
			btTorres[i].setEnabled(n>=btTorres[i].getTorre().getPrecio());
	}
	
	public void actualizarPuntos() {
		puntaje.setText("Puntos: "+Jugador.getJugador().getPuntos());
	}
	
	public void deseleccionarBotones() {
		for(int i=0;i<btTorres.length;i++)
			btTorres[i].deseleccionar();
		for(int i=0;i<btPowerUps.length;i++)
			btPowerUps[i].deseleccionar();
		btVender.deseleccionar();
	}
	
	public void activarBotonOleada() {
		btOleada.setEnabled(true);
	}
	
	public void habilitarBotonPremio(int i,boolean habilitar) {
		btPowerUps[i].setEnabled(habilitar);
		if(!habilitar)
			btPowerUps[i].deseleccionar();
	}
	
	public void ganar() {
		JOptionPane.showMessageDialog(null, "Ganaste\nPuntos: "+Jugador.getJugador().getPuntos());
		System.exit(0);
	}
	
	public void perder() {
		JOptionPane.showMessageDialog(null, "Perdiste\nPuntos: "+Jugador.getJugador().getPuntos());
		System.exit(0);
	}
	
	public void agregarJugador() {
		puntaje=new JLabel("Puntos: 0");
		oro=new JLabel("Oro: "+Jugador.getJugador().getOro());
		puntaje.setBounds(960,60,100,30);
		oro.setBounds(960,90,100,30);
		contentPane.add(puntaje);
		contentPane.add(oro);
		Jugador.getJugador().setPuntosGrafica(puntaje);
		Jugador.getJugador().setOroGrafica(oro);
	}
	
	private void crearFondo() {
		int x=Mapa.getMapa().getX();
		int y=Mapa.getMapa().getY();
		celdas=new CeldaGrafica[x][y];
		for(int i=0;i<x;i++)
			for(int j=0;j<y;j++) {
				celdas[i][j]=new CeldaGrafica(new ImageIcon("./src/Sprites/Mapa/celda2.png"));
				celdas[i][j].setBounds(i*pixel,j*pixel,pixel,pixel);
				this.add(celdas[i][j]);
			}
	}

	private void agregarBotones() {
		btTorres= new BotonTorre[8];
		Torre []torres={new Alien(null),new Dinosaurio(null),new Dragon(null),new Fantasma(null),new Fenix(null),new Golem(null),new Hada(null),new Leviatan(null)};
		for(int i=0;i<8;i++) {
			btTorres[i]= new BotonTorre(torres[i]);
			btTorres[i].setBounds(i*120,6*pixel, 120, 64);
			this.add(btTorres[i]);
		}
		btPowerUps=new BotonPowerUp[5];
		PowerUpEfecto[] powerups= {new CongelarEfecto(),new DobleFuerzaEfecto(),new BombaEfecto(),new EscudoEfecto(),new TorreAleatoriaEfecto()};
		for(int i=0;i<5;i++) {
			btPowerUps[i]=new BotonPowerUp(powerups[i]);
			btPowerUps[i].setBounds(960,256+i*64,pixel,64);
			this.add(btPowerUps[i]);
		}
		
		btOleada=new BotonTienda("Oleada",new OyenteOleada());
		btOleada.setBounds(10*pixel,0,pixel,64);
		this.add(btOleada);
		btVender=new BotonTienda("Vender",new OyenteVender());
		btVender.setBounds(960,576,pixel,64);
		btVender.setBorder(null);
		this.add(btVender);
	}
	
	public class OyenteVender implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			btVender.seleccionar();
			Tienda.getTienda().vender();
		}
		
	}
	
	public class OyenteOleada implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			btOleada.setEnabled(false);
			Controlador.getControlador().activarOleada();
		}
	}
	
	
}			
		