package Tienda;

import Personajes.*;

public class LeviatanTienda {
	protected static int precio=100;
	protected static String nombre="Leviatan";
	protected static String rutaImagen="./src/Sprites/Torres/Onix.gif";
	protected static int rango=0;
	protected static int dano=0;
	protected static int vida=1500;
	protected static int tamano=2;
	
	public static Torre getTorre() {
		return new Hada(null,null);
	}
	
	public static String getImagen() {
		return rutaImagen;
	}
	
	public static String descripcion() {
		String cadena="";
		cadena+=nombre+"\n"+"$"+precio+"\n"+"Vida:"+vida+"\n"+"Daño:"+dano+"\n"+"Rango:"+rango+"\n"+"Tamaño:"+tamano+"\n";
		return cadena;
	}
}
