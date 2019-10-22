package Tienda;

import Personajes.Alien;
import Personajes.Torre;

public class AlienTienda {
	protected static int precio;
	protected static String nombre;
	protected static String rutaImagen;
	protected static int rango;
	protected static int dano;
	protected static int vida;
	protected static int tamano;
	
	public static Torre getTorre() {
		return new Alien(null,null);
	}
	
	
}
