package Juego;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import java.util.Map;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import PowerUps.*;
import Personajes.*;
import Objetos.*;

public class GUI extends JFrame{
	protected JButton[] botones;
	protected JPanel contentPane;
	protected JLabel [][] celdas;
	protected JLabel puntaje;
	protected JLabel oro;
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
		Jugador jugador=controlador.getMapa().getJugador();
		puntaje=new JLabel("Puntos: 0");
		oro=new JLabel("Oro: "+jugador.getOro());
		puntaje.setBounds(1110,0,100,30);
		oro.setBounds(1110,30,100,30);
		contentPane.add(puntaje);
		contentPane.add(oro);
		jugador.setPuntosGrafica(puntaje);
		jugador.setOroGrafica(oro);
	}
	
	public void actualizarPuntos(int puntos) {
		puntaje.setText("Puntos: "+puntos);
	}
	
	public void eliminarComponente(Component c) {
		contentPane.remove(c);
	}
	
	public void setearLabel(Elemento elem, String rutaImagen) {
		Rectangle r=elem.getComponenteGrafica().getBounds();
		elem.getComponenteGrafica().setIcon(null);
		JLabel nuevo = new JLabel(new ImageIcon(rutaImagen));
		elem.setComponenteGrafica(nuevo);
		nuevo.setBounds(r);
		contentPane.add(nuevo);
		contentPane.setComponentZOrder(nuevo, 0);
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
		botones= new JButton[9];
		ActionListener [] oyentes= {new OyenteAlien(),new OyenteDinosaurio(),new OyenteDragon(), new OyenteFantasma(), new OyenteFenix(), new OyenteGolem(), new OyenteHada(),new OyenteLeviatan(),new OyenteOleada()};
		String[] nombres= {"Alien","Dinosaurio","Dragon","Fantasma","Fenix","Golem","Hada","Leviatan","Oleada"};
		for(int i=0;i<9;i++) {
			botones[i]= new JButton(nombres[i]);
			botones[i].setBounds(10*pixel,i*64, 150, 64);
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
	public class OyenteLeviatan implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			controlador.setProxTorre(7);
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
	
	public class OyenteMousePower implements MouseListener{
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
			
				
			}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	public void crearElemento(int x, int y, Elemento e) {
		JLabel elemento= new JLabel(new ImageIcon(e.getRutaImagen()));
		elemento.setBounds(x*pixel, y*pixel, e.getTamano()*pixel, pixel);
		contentPane.add(elemento);
		contentPane.setComponentZOrder(elemento, 0);
		e.setComponenteGrafica(elemento);
	}

}