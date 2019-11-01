package Juego;

public class Celda {
	protected int x;
	protected int y;
	protected Elemento elem;
	
	public Celda(int x,int y) {
		this.x=x;
		this.y=y;
		elem=null;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Elemento getElem() {
		return elem;
	}

	public void setElem(Elemento elem) {
		this.elem = elem;
	}
}
