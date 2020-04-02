package Juego;

public class ContadorTiempo extends Thread {
	ContadorTiempo(){
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			Mapa.getMapa().actuar();
		}
	}
}
