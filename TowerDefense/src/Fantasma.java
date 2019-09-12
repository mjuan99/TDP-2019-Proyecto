
public class Fantasma extends Torre {
		protected static int vidaMax=250;
		protected static int dano=50;
		protected static int alcance=8;
		protected static String rutaImagen="./src/Sprites/Torres/Fantasma.png";
		protected static String rutaProyectil="./src/Sprites/Ataques/AtaqueFantasma.gif";
		
		public Fantasma(Celda celda) {
			vida=vidaMax;
			this.celda=celda;
		}
		
		public Proyectil Atacar() {
			return new Proyectil(dano,alcance,rutaProyectil);
		}
	


}
