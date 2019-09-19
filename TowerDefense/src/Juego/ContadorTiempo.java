package Juego;

public class ContadorTiempo extends Thread {
	Mapa mapa;
	ContadorTiempo(Mapa mapa){
		this.mapa=mapa;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			mapa.actuar();
		}
	}
}
