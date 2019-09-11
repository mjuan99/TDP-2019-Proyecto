
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

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
		fondo=new JLabel(new ImageIcon(this.getClass().getResource("/Sprites/Mapa/Mapa.jpg")));
		fondo.setBounds(0,0,960,576);
		this.agregarDibujo();
		contentPane.add(fondo);
	}
	private void agregarDibujo() {
		dibujo=new JLabel[7];
		String [] rutas1= {"Alien.png","Dragon.png","Fantasma.png","Golem.png","Hada.png","Dinosaurio.png","Fenix.png"};
		String[] rutas2= {"AtaqueAlien.gif","AtaqueDragon.gif","AtaqueFantasma.gif","AtaqueGolem.gif","AtaqueHada.gif"};
		ImageIcon image;
		for(int i=0;i<7;i++) {
			image=new ImageIcon(this.getClass().getResource("/Sprites/Torres/"+rutas1[i]));
			dibujo[i]=new JLabel(image);
			dibujo[i].setBounds(0,i*96,96,96);
			this.add(dibujo[i]);
		}
		dibujo[6]=new JLabel(new ImageIcon(this.getClass().getResource("/Sprites/Torres/"+rutas1[6])));
		dibujo[6].setBounds(96,5*96,96,96);
		this.add(dibujo[6]);
		disparos= new JLabel[5];
		for(int i=0;i<5;i++) {
			image=new ImageIcon(this.getClass().getResource("/Sprites/Ataques/"+rutas2[i]));
			disparos[i]=new JLabel(image);
			disparos[i].setBounds(96,i*96,96,96);
			this.add(disparos[i]);
		}
	}
}
