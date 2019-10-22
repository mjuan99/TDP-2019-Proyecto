package Tienda;

import Personajes.*;
public class AlienTienda extends TorreTienda {
	protected static int precio=50;
	protected static String nombre="Alien";
	protected static String rutaImagen="./src/Sprites/Tienda/Alien.png";
	protected static int rango=3;
	protected static int dano=70;
	protected static int vida=500;
	protected static int tamano=1;
	
	public Torre getTorre() {
		return new Alien(null,null);
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
