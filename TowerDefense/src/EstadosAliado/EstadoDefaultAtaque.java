package EstadosAliado;

import Juego.Mapa;
import Personajes.ProyectilTorre;
import Personajes.Torre;

public class EstadoDefaultAtaque extends EstadoAtaqueTorre{
	public EstadoDefaultAtaque(Torre t) {
		super(t);
	}

	@Override
	public void atacar() {
		Mapa.getMapa().crearElementoIntangible(new ProyectilTorre(miTorre.getCelda(),miTorre , miTorre.getDano(),miTorre.getAlcance(),miTorre.getRutaProyectil()));
	}

}
