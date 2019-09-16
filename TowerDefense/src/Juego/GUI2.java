package Juego;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Personajes.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Personajes.*;

public class GUI2 extends JFrame{
	protected static int pixel=96;
	protected Mapa map;
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
		setBounds(30,30,1000,620);
		contentPane= new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		map=new Mapa(null,null);
		fondo=new JLabel(new ImageIcon("./src/Sprites/Mapa/Mapa.jpg"));
		fondo.setBounds(0,0,pixel*10,pixel*6);
		interfaz=new JLabel();
		interfaz.setBounds(0,0,pixel*10,pixel*6);
		interfaz.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent arg0) {
				int x=(int)interfaz.getMousePosition().getX()/pixel;
				int y=(int)interfaz.getMousePosition().getY()/pixel;
				if(x>=0&&x<10&&y>=0&&y<6) {
					Torre t=new Dragon();
					map.crearTorre(t, x, y);
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
		contentPane.add(fondo);
	}
	private void agregarDibujo() {
		celdas=new JLabel[10][6];
		for(int i=0;i<10;i++)
			for(int j=0;j<6;j++) {
				celdas[i][j]=new JLabel();
				celdas[i][j].setBounds(i*pixel,j*pixel,pixel,pixel);
				this.add(celdas[i][j]);
			}
		Torre[] torres={new Alien(),new Dragon(),new Fantasma(),new Golem(),new Hada(),new Dinosaurio(),new Fenix()};
		Enemigo[]enemigos= {new Enemigo1(),new Enemigo2(), new Enemigo3(),new Enemigo4(),new Enemigo5(),new Enemigo6()};
		for(int i=0;i<7;i++) {
			map.crearTorre(torres[i], 2*(i/6), i%6);
			celdas[2*(i/6)][i%6].setIcon(new ImageIcon(torres[i].getRutaImagen()));
			celdas[2*(i/6)+1][i%6].setIcon(new ImageIcon(torres[i].Atacar().getRutaImagen()));
		}
		for(int i=0;i<6;i++) {
			celdas[9][i].setIcon(new ImageIcon(enemigos[i].getRutaImagen()));
		}
	}
	
}
