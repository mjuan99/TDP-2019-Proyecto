package Tienda;

import Personajes.*;

public class FenixTienda extends TorreTienda {
	protected static int precio=50;
	protected static String nombre="Fenix";
	protected static String rutaImagen="./src/Sprites/Tienda/Fenix.png";
	protected static int rango=5;
	protected static int dano=50;
	protected static int vida=250;
	protected static int tamano=1;
	
	public Torre getTorre() {
		return new Fenix(null,null);
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
