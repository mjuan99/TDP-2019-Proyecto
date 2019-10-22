package Tienda;

import Personajes.*;

public class FantasmaTienda extends TorreTienda {
	protected static int precio=50;
	protected static String nombre="Fantasma";
	protected static String rutaImagen="./src/Sprites/Torres/Fantasma.gif";
	protected static int rango=4;
	protected static int dano=50;
	protected static int vida=250;
	protected static int tamano=1;
	
	public Torre getTorre() {
		return new Fantasma(null,null);
	}
	
	public String getImagen() {
		return rutaImagen;
	}
	
	public String descripcion() {
		String cadena="";
		cadena+=nombre+"\n"+"$"+precio+"\n"+"Vida:"+vida+"\n"+"Daño:"+dano+"\n"+"Rango:"+rango+"\n"+"Tamaño:"+tamano+"\n";
		return cadena;
	}
}
