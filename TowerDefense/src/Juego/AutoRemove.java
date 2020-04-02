package Juego;

import javax.swing.JLabel;

public class AutoRemove extends Thread {
	protected JLabel componente;
	protected int t;
	public AutoRemove(JLabel componente, int t) {
		this.componente=componente;
		this.t=t;
	}

	@Override
	public void run() {
			try {
				Thread.sleep(t);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		GUI.getGUI().eliminarComponente(componente);
	}
}