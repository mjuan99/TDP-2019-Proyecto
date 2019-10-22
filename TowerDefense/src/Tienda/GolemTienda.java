package Tienda;

import Personajes.*;

public class GolemTienda {
	protected static int precio=50;
	protected static String nombre="Golem";
	protected static String rutaImagen="./src/Sprites/Tienda/Golem.png";
	protected static int rango=4;
	protected static int dano=50;
	protected static int vida=250;
	protected static int tamano=1;
	
	public static Torre getTorre() {
		return new Golem(null,null);
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

