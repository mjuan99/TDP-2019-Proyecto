package Tienda;

import Personajes.*;

public class DragonTienda extends TorreTienda {
	protected static int precio=50;
	protected static String nombre="Dragon";
	protected static String rutaImagen="./src/Sprites/Tienda/Dragon.png";
	protected static int rango=6;
	protected static int dano=50;
	protected static int vida=600;
	protected static int tamano=1;
	
	public Torre getTorre() {
		return new Dragon(null,null);
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
