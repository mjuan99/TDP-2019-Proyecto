package Juego;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame{
	protected JButton[] botones;
	protected JPanel contentPane;
	protected JLabel [][] celdas;
	protected Controlador controlador;
	protected static int pixel=96;
	
	public GUI(Controlador controlador) {
		super("Juego");
		this.controlador=controlador;
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30,30,1150,620);
		contentPane= new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
