package EstadosAliado;

import Juego.Mapa;
import Objetos.ProyectilAliado;
import Personajes.Torre;

public class EstadoDefaultAtaque extends EstadoAtaqueAliado{
	public EstadoDefaultAtaque(Torre t) {
		super(t);
	}

	@Override
	public void atacar() {
		Mapa.getMapa().crearElementoIntangible(new ProyectilAliado(miTorre.getCelda(),miTorre , miTorre.getDano(),miTorre.getAlcance(),miTorre.getRutaProyectil()));
	}

}
