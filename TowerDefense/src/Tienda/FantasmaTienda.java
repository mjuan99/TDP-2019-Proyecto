package Tienda;

import Personajes.*;

public class FantasmaTienda {
	protected static int precio=50;
	protected static String nombre="Fantasma";
	protected static String rutaImagen="./src/Sprites/Tienda/Fantasma.png";
	protected static int rango=4;
	protected static int dano=50;
	protected static int vida=250;
	protected static int tamano=1;
	
	public static Torre getTorre() {
		return new Fantasma(null,null);
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
