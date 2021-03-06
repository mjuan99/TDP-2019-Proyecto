package EstadosAliado;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Juego.Mapa;
import Personajes.ProyectilTorre;
import Personajes.Torre;

public class EstadoDobleFuerzaAtaque extends EstadoAtaqueTorre {
	protected long inicio;
	protected int duracion=7000;
	private JLabel componente= new JLabel(new ImageIcon("./src/Sprites/Efectos/DobleFuerza/DobleFuerza.gif"));
	public EstadoDobleFuerzaAtaque(Torre t) {
		super(t);
		componente.setBounds(0, 0, 96, 96);
		miTorre.getComponenteGrafica().add(componente);
		inicio=System.currentTimeMillis();
	}
	
	public void atacar() {
		if(System.currentTimeMillis()<inicio+duracion) {
			Mapa.getMapa().crearElementoIntangible(new ProyectilTorre(miTorre.getCelda(),miTorre , 2*miTorre.getDano(),miTorre.getAlcance(),miTorre.getRutaProyectil()));
		
		}
		else {
			miTorre.getComponenteGrafica().remove(componente);
			miTorre.setEstadoAtaque(new EstadoDefaultAtaque(miTorre));
			miTorre.atacar();
		}
	}
}
