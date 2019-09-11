

public class Mapa {
	Celda[][] grilla;
	final static int x=12;
	final static int y=8;
	Nivel nivel;
	Jugador jugador;
	
	public Mapa(Nivel nivel,Jugador jugador) {
		this.nivel=nivel;
		this.jugador=jugador;
		grilla=new Celda[x][y];
		for(int i=0;i<y;i++)
			for(int j=0;j<x;j++)
				grilla[i][j]=new Celda(i,j);
	}

	public Celda[][] getGrilla() {
		return grilla;
	}

	public void setGrilla(Celda[][] grilla) {
		this.grilla = grilla;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
}
