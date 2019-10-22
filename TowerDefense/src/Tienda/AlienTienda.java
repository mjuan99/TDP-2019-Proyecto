package Tienda;

import Personajes.*;
public class AlienTienda {
	protected static int precio=50;
	protected static String nombre="Alien";
	protected static String rutaImagen="./src/Sprites/Torres/Alien.gif";
	protected static int rango=3;
	protected static int dano=70;
	protected static int vida=500;
	protected static int tamano=1;
	
	public static Torre getTorre() {
		return new Alien(null,null);
	}
	
	public static String getImagen() {
		return rutaImagen;
	}
	
	public static String descripcion() {
		String cadena="";
		cadena+=nombre+"\n"+"$"+precio+"\n"+"Vida:"+vida+"\n"+"Da�o:"+dano+"\n"+"Rango:"+rango+"\n"+"Tama�o:"+tamano+"\n";
		return cadena;
	}
}
