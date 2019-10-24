
package Juego;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import Tienda.*;

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
	
	public void habilitarBotonPremio(int i) {
		btPowerUps[i].setEnabled(true);
	}
	
	public void crearElemento(Elemento e) {
		int x=e.getCelda().getX();
		int y=e.getCelda().getY();
		//JLabel elemento= new JLabel(new ImageIcon(e.getRutaImagen()));
		Etiqueta elemento=new Etiqueta(e);
		elemento.setBounds(x*pixel, y*pixel, pixel, e.getTamano()*pixel);
		contentPane.add(elemento);
		contentPane.setComponentZOrder(elemento, 0);
		e.setComponenteGrafica(elemento);
		elemento.repaint();
	}
	
	public void deseleccionarBotones() {
		for(int i=0;i<btTorres.length;i++)
			btTorres[i].deseleccionar();
		for(int i=0;i<btPowerUps.length;i++)
			btPowerUps[i].deseleccionar();
		btVender.deseleccionar();
	}
	
	public void ganar() {
		JOptionPane.showMessageDialog(null, "Ganaste\nPuntos: "+Jugador.getJugador().getPuntos());
		System.exit(0);
	}
	
	public void perder() {
		JOptionPane.showMessageDialog(null, "Perdiste\nPuntos: "+Jugador.getJugador().getPuntos());
		System.exit(0);
	}
	
	public void activarBotonOleada() {
		btOleada.setEnabled(true);
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
	
	public void actualizarPuntos(int puntos) {
		puntaje.setText("Puntos: "+puntos);
	}
	
	public void eliminarComponente(Component c) {
		if(contentPane.isAncestorOf(c))
			contentPane.remove(c);
	}
	
	private void crearFondo() {
		int x=Mapa.getMapa(0).getX();
		int y=Mapa.getMapa(0).getY();
		celdas=new JLabel[x][y];
		for(int i=0;i<x;i++)
			for(int j=0;j<y;j++) {
				celdas[i][j]=new JLabel(new ImageIcon("./src/Sprites/Mapa/celda2.png"));
				celdas[i][j].setBounds(i*pixel,j*pixel,pixel,pixel);
				celdas[i][j].addMouseListener(new OyenteMouseCelda(celdas[i][j]));
				this.add(celdas[i][j]);
			}
	}

	private void agregarBotones() {
		btTorres= new BotonTorre[8];
		TorreTienda[] torres= {new AlienTienda(),new DinosaurioTienda(),new DragonTienda(),new FantasmaTienda(),new FenixTienda(),new GolemTienda(),new HadaTienda(),new LeviatanTienda()};
		for(int i=0;i<8;i++) {
			btTorres[i]= new BotonTorre(torres[i]);
			btTorres[i].setBounds(i*120,6*pixel, 120, 64);
			this.add(btTorres[i]);
		}
		btPowerUps=new BotonPowerUp[5];
		ImageIcon[] imagenes= {new ImageIcon("./src/Sprites/Premios/Congelar.png"),new ImageIcon("./src/Sprites/Premios/Fuerza.png"),new ImageIcon("./src/Sprites/Premios/Bomba.png"),new ImageIcon("./src/Sprites/Premios/Escudo.png"),new ImageIcon("./src/Sprites/Premios/TorreAleatoria.png")};
		String[] descripciones= {"Congelar","Fuerza","Bomba","Escudo","Torre Aleatoria"};
		for(int i=0;i<5;i++) {
			btPowerUps[i]=new BotonPowerUp(imagenes[i],descripciones[i]);
			btPowerUps[i].setBounds(960,256+i*64,pixel,64);
			this.add(btPowerUps[i]);
		}
		
		btOleada=new BotonTienda("Oleada");
		btOleada.addActionListener(new OyenteOleada());
		btOleada.setBounds(10*pixel,0,pixel,64);
		this.add(btOleada);
		btVender=new BotonTienda("Vender");
		btVender.addActionListener(new OyenteVender());
		btVender.setBounds(960,576,pixel,64);
		btVender.setBorder(null);
		this.add(btVender);
	}
	
	public class OyenteVender implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			btVender.seleccionar();
		}
		
	}
	
	public class OyenteOleada implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			btOleada.setEnabled(false);
			Controlador.getControlador().activarOleada();
		}
	}
	
	public class OyenteMouseCelda implements MouseListener{
		JLabel celda;
		public OyenteMouseCelda(JLabel celda) {
			this.celda=celda;
		}
		public void mouseClicked(MouseEvent e) {
		}
		public void mouseEntered(MouseEvent e) {
			celda.setIcon(new ImageIcon("./src/Sprites/Mapa/celda4.png"));
		}
		public void mouseExited(MouseEvent e) {
			celda.setIcon(new ImageIcon("./src/Sprites/Mapa/celda2.png"));
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			int x=celda.getX()/96;
			int y=celda.getY()/96;
			Tienda.getTienda().ubicar(x, y);}
	}
}	
	/*public class OyenteMousePower implements MouseListener{
		JLabel celda;

		
		public OyenteMousePower(JLabel celda) {
			this.celda=celda;
		}
		
		public void mouseClicked(MouseEvent e) {
			int x= celda.getX();
			int y = celda.getY();
			//eliminar imagen eliminar elemento del mapa
			Elemento elem= controlador.getMapa().getElemento(x, y);
			controlador.getGui().eliminarComponente(elem.componenteGrafica);
			elem.getComponenteGrafica().setIcon(null);
			controlador.getMapa().eliminarElemento(elem);
			
			//activar el estado en las torres
			/* LinkedList<Elemento> torres= controlador.getMapa().getTorres();
			 * for(Elemento t: torres){
			 * t.setEstado()}
			 * */
			
				
		