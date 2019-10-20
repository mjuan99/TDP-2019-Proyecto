package Juego;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

import Personajes.Enemigo;
import Personajes.Enemigo1;
import Personajes.Enemigo2;
import Personajes.Enemigo3;
import Personajes.Enemigo4;
import Personajes.Enemigo5;
import Personajes.Enemigo6;

public class Oleada {
	protected Queue<Enemigo> [] colas;
	public Oleada(String rutaOleada) {
		colas=(ArrayDeque<Enemigo>[])new ArrayDeque[6];
		String [] filas=new String[6];
		FileReader fr=null;
		BufferedReader br;
		try {
			fr=new FileReader(new File(rutaOleada));
			br=new BufferedReader(fr);
			for(int i=0;i<6;i++)
				filas[i]=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fr!=null)
					fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		for(int i=0;i<6;i++){
			colas[i]=new ArrayDeque<Enemigo>(filas[i].length());
			for(int j=0;j<filas[i].length();j++)
				colas[i].add(getEnemigo(filas[i].charAt(j)));
		}
	}
	
	private Enemigo getEnemigo(char c) {
		Enemigo e=null;
		switch (c) {
		case '1':{e=new Enemigo1(null,null);break;}
		case '2':{e=new Enemigo2(null,null);break;}
		case '3':{e=new Enemigo3(null,null);break;}
		case '4':{e=new Enemigo4(null,null);break;}
		case '5':{e=new Enemigo5(null,null);break;}
		case '6':{e=new Enemigo6(null,null);break;}
		}
		return e;
	}

	public boolean quedanEnemigos(int i) {
		return !colas[i].isEmpty();
	}
	
	public Enemigo getEnemigo(int i) {
		return colas[i].poll();
	}
	
	public int cantEnemigos() {
		int cant=0;
		for(int i=0;i<6;i++)
			cant+=colas[i].size();
		return cant;
	}
}
