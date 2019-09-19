package Juego;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Personajes.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Personajes.*;

public class GUI1 extends JFrame {
	protected static int pixel=96;
	protected JPanel contentPane;
	protected JLabel [] dibujo;
	protected JLabel [] disparos;	
	protected JLabel fondo;
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI1 frame=new GUI1();
					frame.setVisible(true);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public GUI1() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30,30,1000,620);
		contentPane= new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Mapa map=new Mapa(null,null,null);
		fondo=new JLabel(new ImageIcon("./src/Sprites/Mapa/Mapa.jpg"));
		fondo.setBounds(0,0,pixel*10,pixel*6);
		fondo.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent arg0) {
					int x=(int)fondo.getMousePosition().getX();
					int y=(int)fondo.getMousePosition().getY();
					Torre t=new Dragon(map,null);
					map.crearTorre(t, x/pixel, y/pixel);
					JLabel img=new JLabel(new ImageIcon(t.getRutaImagen()));
					img.setBounds(t.getCelda().getX()*pixel,t.getCelda().getY()*pixel,pixel,pixel);
					contentPane.add(img);
				}
				public void mouseEntered(MouseEvent arg0) {}
				public void mouseExited(MouseEvent arg0) {}
				public void mousePressed(MouseEvent arg0) {}
				public void mouseReleased(MouseEvent arg0) {}
		});
		this.agregarDibujo(map);
		contentPane.add(fondo);
	}
	private void agregarDibujo(Mapa map) {
		dibujo=new JLabel[7];
		Torre[] torres={new Alien(map,null),new Dragon(map,null),new Fantasma(map,null),new Golem(map,null),new Hada(map,null),new Dinosaurio(map,null),new Fenix(map,null)};
		for(int i=0;i<7;i++) {
			map.crearTorre(torres[i], 2*(i/6), i%6);
		}
		ImageIcon image;
		for(int i=0;i<7;i++) {
			image=new ImageIcon(torres[i].getRutaImagen());
			dibujo[i]=new JLabel(image);
			dibujo[i].setBounds(torres[i].getCelda().getX()*pixel,torres[i].getCelda().getY()*pixel,pixel,pixel);
			this.add(dibujo[i]);
		}
		disparos= new JLabel[7];
		for(int i=0;i<7;i++) {
			image=new ImageIcon(torres[i].Atacar().getRutaImagen());
			disparos[i]=new JLabel(image);
			disparos[i].setBounds((2*(i/6)+1)*pixel,(i%6)*pixel,pixel,pixel);
			this.add(disparos[i]);
		}
		Enemigo[]enemigos= {new Enemigo1(map,null),new Enemigo2(map,null), new Enemigo3(map,null),new Enemigo4(map,null),new Enemigo5(map,null),new Enemigo6(map,null)};
		for(int i=0;i<6;i++) {
			map.crearEnemigo(enemigos[i], 9, i);
		}
		JLabel[] dibujo2=new JLabel[6];
		for(int i=0;i<6;i++) {
			image= new ImageIcon(enemigos[i].getRutaImagen());
			dibujo2[i]=new JLabel(image);
			dibujo2[i].setBounds(enemigos[i].getCelda().getX()*pixel,enemigos[i].getCelda().getY()*pixel , pixel, pixel);
			this.add(dibujo2[i]);
		}
	}
	public class OyenteClick implements MouseListener{
		public void mouseClicked(MouseEvent arg0) {
			double x=fondo.getMousePosition().getX();
			double y=fondo.getMousePosition().getY();
			
		}
		public void mouseEntered(MouseEvent arg0) {}
		public void mouseExited(MouseEvent arg0) {}
		public void mousePressed(MouseEvent arg0) {}
		public void mouseReleased(MouseEvent arg0) {}
	}
}
