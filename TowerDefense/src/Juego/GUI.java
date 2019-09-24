package Juego;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Personajes.*;

public class GUI extends JFrame{
	protected JButton[] botones;
	protected JPanel contentPane;
	protected JLabel [][] celdas;
	protected JLabel puntaje;
	protected Controlador controlador;
	protected static int pixel=96;
	
	public GUI(Controlador controlador) {
		super("Juego");
		this.controlador=controlador;
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30,30,1300,620);
		contentPane= new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		crearFondo();
		agregarBotones();
		agregarJugador();
	}
	
	public void agregarJugador() {
		puntaje=new JLabel("Puntos: 0");
		puntaje.setBounds(1110,0,100,100);
		contentPane.add(puntaje);
	}
	
	public void actualizarPuntos(int puntos) {
		puntaje.setText("Puntos: "+puntos);
	}
	
	public void eliminarComponente(Component c) {
		contentPane.remove(c);
	}
	
	private void crearFondo() {
		int x=controlador.getMapa().getX();
		int y=controlador.getMapa().getY();
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
		botones= new JButton[8];
		ActionListener [] oyentes= {new OyenteAlien(),new OyenteDinosaurio(),new OyenteDragon(), new OyenteFantasma(), new OyenteFenix(), new OyenteGolem(), new OyenteHada(),new OyenteOleada()};
		String[] nombres= {"Alien","Dinosaurio","Dragon","Fantasma","Fenix","Golem","Hada","Oleada"};
		for(int i=0;i<8;i++) {
			botones[i]= new JButton(nombres[i]);
			botones[i].setBounds(10*pixel,i*72, 150, 72);
			botones[i].addActionListener(oyentes[i]);
			this.add(botones[i]);
		}
	}
	
	public class OyenteAlien implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			controlador.setProxTorre(0);
		}
	}
	public class OyenteDinosaurio implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			controlador.setProxTorre(1);
		}
	}
	public class OyenteDragon implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			controlador.setProxTorre(2);
		}
	}
	public class OyenteFantasma implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			controlador.setProxTorre(3);
		}
	}
	public class OyenteFenix implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			controlador.setProxTorre(4);
		}
	}
	public class OyenteGolem implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			controlador.setProxTorre(5);
		}
	}
	public class OyenteHada implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			controlador.setProxTorre(6);
		}
	}
	public class OyenteOleada implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			controlador.agregarOleadaPrueba();
		}
	}
	
	public class OyenteMouseCelda implements MouseListener{
		JLabel celda;
		public OyenteMouseCelda(JLabel celda) {
			this.celda=celda;
		}
		public void mouseClicked(MouseEvent e) {
			int x=celda.getX()/96;
			int y=celda.getY()/96;
			controlador.agregarTorre(x, y);
		}
		public void mouseEntered(MouseEvent e) {
			celda.setIcon(new ImageIcon("./src/Sprites/Mapa/celda4.png"));
		}
		public void mouseExited(MouseEvent e) {
			celda.setIcon(new ImageIcon("./src/Sprites/Mapa/celda2.png"));
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
	}
	public JLabel crearElemento(int x, int y, String rutaImagen) {
		JLabel elemento= new JLabel(new ImageIcon(rutaImagen));
		elemento.setBounds(x*pixel, y*pixel, pixel, pixel);
		contentPane.add(elemento);
		contentPane.setComponentZOrder(elemento, 0);
		elemento.repaint();
		return elemento;
	}
}
