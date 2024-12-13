package Logica.Fabricas;

import Grafica.Sprite;
import Logica.Coordenada;
import Logica.Goomba;

public class FabricaEntidades {

	protected FabricaSprites factory_spr;
	
	public FabricaElementos(FabricaSprites factory_spr) {
		this.factory_spr = factory_spr;
	}
	
	public Goomba getGoomba(Coordenada origen) {
		Sprite spr = factory_spr.Get_Goomba();
		Goomba goomba= new Goomba(origen,spr);
		return goomba;
	}
}
