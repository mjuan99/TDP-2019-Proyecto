package Juego;

public class ContadorTiempo extends Thread {
	ContadorTiempo(){
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			Mapa.getMapa(0).actuar();
		}
	}
}
