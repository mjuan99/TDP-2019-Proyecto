package Tienda;

import Personajes.*;

public class DinosaurioTienda {
	protected static int precio=50;
	protected static String nombre="Dinosaurio";
	protected static String rutaImagen="./src/Sprites/Tienda/Dinosaurio.png";
	protected static int rango=1;
	protected static int dano=80;
	protected static int vida=600;
	protected static int tamano=1;
	
	public static Torre getTorre() {
		return new Dinosaurio(null,null);
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
