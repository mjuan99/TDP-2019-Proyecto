package EstadosAliado;

import Juego.Mapa;
import Objetos.ProyectilAliado;
import Personajes.Torre;

public class EstadoDobleFuerzaAtaque implements EstadoAtaqueAliado {
	protected Torre miTorre;
	protected long inicio;
	protected int duracion=7000;
	public EstadoDobleFuerzaAtaque(Torre t) {
		miTorre=t;
		inicio=System.currentTimeMillis();
	}
	
	public void atacar() {
		if(System.currentTimeMillis()<inicio+duracion)
			Mapa.getMapa(0).crearProyectil(new ProyectilAliado(miTorre.getCelda(),miTorre , 2*miTorre.getDano(),miTorre.getAlcance(),miTorre.getRutaProyectil()));
		else {
			miTorre.setEstadoAtaque(new EstadoDefaultAtaque(miTorre));
			miTorre.atacar();
		}
	}
}
