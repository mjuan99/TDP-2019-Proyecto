package Juego;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Personajes.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Personajes.*;

public class GUI2 extends JFrame{
	protected ContadorTiempo tiempo;
	protected int proxTorre=0;
	protected static int pixel=96;
	protected Mapa map;
	protected JButton[] botones;
	protected JPanel contentPane;
	protected JLabel [][] celdas;
	protected JLabel fondo;
	protected JLabel interfaz;
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 frame=new GUI2();
					frame.setVisible(true);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public GUI2() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30,30,1150,620);
		contentPane= new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		map=new Mapa(null,null,this);
		fondo=new JLabel(new ImageIcon("./src/Sprites/Mapa/Mapa.jpg"));
		fondo.setBounds(0,0,pixel*10,pixel*6);
		interfaz=new JLabel();
		interfaz.setBounds(0,0,pixel*10,pixel*6);
		interfaz.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent arg0) {
				int x=(int)interfaz.getMousePosition().getX()/pixel;
				int y=(int)interfaz.getMousePosition().getY()/pixel;
				if(x>=0&&x<9&&y>=0&&y<6) {
					Torre t=getTorre(proxTorre);
					map.crearTorre(t, x, y);
					t.setComponenteGrafica(celdas[x][y]);
					celdas[x][y].setIcon(new ImageIcon(t.getRutaImagen()));
				}
			}
			public void mouseEntered(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
		});
		this.add(interfaz);
		this.agregarDibujo();
		this.agregarBotones();
		contentPane.add(fondo);
		tiempo=new ContadorTiempo(map);
		tiempo.start();
	}
	private void agregarDibujo() {
		celdas=new JLabel[10][6];
		for(int i=0;i<10;i++)
			for(int j=0;j<6;j++) {
				celdas[i][j]=new JLabel();
				celdas[i][j].setBounds(i*pixel,j*pixel,pixel,pixel);
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
	
	public void mover(Enemigo e, int x, int y) {
		celdas[x][y].setIcon(new ImageIcon(e.getRutaImagen()));
		e.getComponenteGrafica().setIcon(null);
		e.setComponenteGrafica(celdas[x][y]);
	}
	
	private Torre getTorre(int i) {
		Torre t=null;
		switch(i) {
		case 0:{t=new Alien();break;}
		case 1:{t=new Dinosaurio();break;}
		case 2:{t=new Dragon();break;}
		case 3:{t=new Fantasma();break;}
		case 4:{t=new Fenix();break;}
		case 5:{t=new Golem();break;}
		case 6:{t=new Hada();break;}
		}
		return t;
	}
	public class OyenteAlien implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			proxTorre=0;
		}
	}
	public class OyenteDinosaurio implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			proxTorre=1;
		}
	}
	public class OyenteDragon implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			proxTorre=2;
		}
	}
	public class OyenteFantasma implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			proxTorre=3;
		}
	}
	public class OyenteFenix implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			proxTorre=4;
		}
	}
	public class OyenteGolem implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			proxTorre=5;
		}
	}
	public class OyenteHada implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			proxTorre=6;
		}
	}
	public class OyenteOleada implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Enemigo[]enemigos= {new Enemigo1(),new Enemigo2(), new Enemigo3(),new Enemigo4(),new Enemigo5(),new Enemigo6()};
			for(int i=0;i<6;i++) {
				enemigos[i].setComponenteGrafica(celdas[9][i]);
				enemigos[i].setMapa(map);
				celdas[9][i].setIcon(new ImageIcon(enemigos[i].getRutaImagen()));
				map.crearEnemigo(enemigos[i], 9, i);
			}
		}
	}
}
