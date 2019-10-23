package Juego;

import javax.swing.ImageIcon;

public class AutoRemove extends Thread {
	protected Elemento e;
	protected int t;
	protected String rutaImagen;
	public AutoRemove(Elemento e, int t, String rutaImagen) {
		this.e=e;
		this.t=t;
		this.rutaImagen=rutaImagen;
	}

	
	public void run() {
		ImageIcon img = new ImageIcon(rutaImagen);
		img.getImage().flush();
		e.getComponenteGrafica().setIcon(img);
		//e.getComponenteGrafica().disable();
		e.getComponenteGrafica().setEnabled(false);
			try {
				Thread.sleep(t);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		e.getMapa().getControlador().getGui().eliminarComponente(e.getComponenteGrafica());
		e.getComponenteGrafica().setIcon(null);
	}
	
}
