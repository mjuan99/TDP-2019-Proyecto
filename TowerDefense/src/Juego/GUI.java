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
	protected JButton[] botones;
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
	
	public void ganar() {
		JOptionPane.showMessageDialog(null, "Ganaste\nPuntos: "+Jugador.getJugador().getPuntos());
		System.exit(0);
	}
	
	public void perder() {
		JOptionPane.showMessageDialog(null, "Perdiste\nPuntos: "+Jugador.getJugador().getPuntos());
		System.exit(0);
	}
	
	public void activarBotonOleada() {
		botones[8].setEnabled(true);
	}
	
	public void agregarJugador() {
		puntaje=new JLabel("Puntos: 0");
		oro=new JLabel("Oro: "+Jugador.getJugador().getOro());
		puntaje.setBounds(960,0,100,30);
		oro.setBounds(960,30,100,30);
		contentPane.add(puntaje);
		contentPane.add(oro);
		Jugador.getJugador().setPuntosGrafica(puntaje);
		Jugador.getJugador().setOroGrafica(oro);
	}
	
	public void actualizarPuntos(int puntos) {
		puntaje.setText("Puntos: "+puntos);
	}
	
	public void eliminarComponente(Component c) {
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
		botones= new JButton[9];
		TorreTienda[] torres= {new AlienTienda(),new DinosaurioTienda(),new DragonTienda(),new FantasmaTienda(),new FenixTienda(),new GolemTienda(),new HadaTienda(),new LeviatanTienda()};
		for(int i=0;i<8;i++) {
			botones[i]= new BotonTienda(torres[i]);
			botones[i].setBounds(i*100,6*pixel, 100, 64);
			this.add(botones[i]);
		}
		botones[8]=new JButton("Oleada");
		botones[8].addActionListener(new OyenteOleada());
		botones[8].setBounds(9*pixel,6*pixel,pixel,64);
		this.add(botones[8]);
	}
	public class OyenteOleada implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			botones[8].setEnabled(false);
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
	public void crearElemento(Elemento e) {
		int x=e.getCelda().getX();
		int y=e.getCelda().getY();
		JLabel elemento= new JLabel(new ImageIcon(e.getRutaImagen()));
		elemento.setBounds(x*pixel, y*pixel, pixel, e.getTamano()*pixel);
		contentPane.add(elemento);
		contentPane.setComponentZOrder(elemento, 0);
		e.setComponenteGrafica(elemento);
		elemento.repaint();
	}
}
