
public abstract class Personaje extends Elemento {
	protected int dano;
	protected int alcance;
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	public int getAlcance() {
		return alcance;
	}
	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}
}
