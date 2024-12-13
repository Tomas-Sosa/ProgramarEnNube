package Grafica;

import Logica.Entidad;

public class ObserverMario extends ObserverGrafica{

	protected ObserverMario(Entidad entidad_observada) {
		super(entidad_observada);
		actualizar();
	}

}
