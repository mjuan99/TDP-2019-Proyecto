package EstadosAliado;

import Juego.Mapa;
import Objetos.ProyectilAliado;
import Personajes.Torre;

public class EstadoDefaultAtaque implements EstadoAtaqueAliado{
	protected Torre miTorre;
	public EstadoDefaultAtaque(Torre t) {
		miTorre=t;
	}

	@Override
	public void atacar() {
		Mapa.getMapa(0).crearElementoIntangible(new ProyectilAliado(miTorre.getCelda(),miTorre , miTorre.getDano(),miTorre.getAlcance(),miTorre.getRutaProyectil()));
	}

}
