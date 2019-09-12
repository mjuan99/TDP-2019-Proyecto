package Juego;

import java.awt.EventQueue;
import Personajes.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Personajes.Alien;
import Personajes.Dinosaurio;
import Personajes.Dragon;
import Personajes.Enemigo;
import Personajes.Enemigo1;
import Personajes.Enemigo2;
import Personajes.Enemigo3;
import Personajes.Enemigo4;
import Personajes.Enemigo5;
import Personajes.Enemigo6;
import Personajes.Fantasma;
import Personajes.Fenix;
import Personajes.Golem;
import Personajes.Hada;
import Personajes.Torre;

public class GUI extends JFrame {
	protected JPanel contentPane;
	protected JLabel [] dibujo;
	protected JLabel [] disparos;	
	protected JLabel fondo;
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame=new GUI();
					frame.setVisible(true);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public GUI() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30,30,1000,620);
		contentPane= new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		fondo=new JLabel(new ImageIcon("./src/Sprites/Mapa/Mapa.jpg"));
		fondo.setBounds(0,0,960,576);
		Mapa map=new Mapa(null,null);
		this.agregarDibujo(map);
		contentPane.add(fondo);
	}
	private void agregarDibujo(Mapa map) {
		dibujo=new JLabel[7];
		Torre[] torres={new Alien(),new Dragon(),new Fantasma(),new Golem(),new Hada(),new Dinosaurio(),new Fenix()};
		for(int i=0;i<7;i++) {
			map.crearTorre(torres[i], 2*(i/6), i%6);
		}
		ImageIcon image;
		for(int i=0;i<7;i++) {
			image=new ImageIcon(torres[i].getRutaImagen());
			dibujo[i]=new JLabel(image);
			dibujo[i].setBounds(torres[i].getCelda().getY()*96,torres[i].getCelda().getX()*96,96,96);
			this.add(dibujo[i]);
		}
		disparos= new JLabel[7];
		for(int i=0;i<7;i++) {
			image=new ImageIcon(torres[i].Atacar().getRutaImagen());
			disparos[i]=new JLabel(image);
			disparos[i].setBounds((2*(i/6)+1)*96,(i%6)*96,96,96);
			this.add(disparos[i]);
		}
		Enemigo[]enemigos= {new Enemigo1(),new Enemigo2(), new Enemigo3(),new Enemigo4(),new Enemigo5(),new Enemigo6()};
		for(int i=0;i<6;i++) {
			map.crearEnemigo(enemigos[i], 9, i);
		}
		JLabel[] dibujo2=new JLabel[6];
		for(int i=0;i<6;i++) {
			image= new ImageIcon(enemigos[i].getRutaImagen());
			dibujo2[i]=new JLabel(image);
			dibujo2[i].setBounds(enemigos[i].getCelda().getY()*96,enemigos[i].getCelda().getX()*96 , 96, 96);
			this.add(dibujo2[i]);
		}
	}
}
