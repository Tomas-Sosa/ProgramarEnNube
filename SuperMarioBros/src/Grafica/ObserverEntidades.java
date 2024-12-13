package Grafica;

import Logica.Entidad;

public class ObserverEntidades extends ObserverGrafica{

	protected ObserverEntidades(Entidad entidad_observada) {
		super(entidad_observada);
		actualizar();
	}

}
