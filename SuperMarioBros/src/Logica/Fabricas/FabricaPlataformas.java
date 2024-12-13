package Logica.Fabricas;

import Grafica.Sprite;
import Logica.Coordenada;
import Logica.Ladrillo;

public class FabricaPlataformas {
	protected FabricaSprites factory_spr;
	
	public FabricaPlataformas(FabricaSprites factory_spr) {
		this.factory_spr = factory_spr;
	}
	
	public Ladrillo getLadrillo(Coordenada origen) {
		Sprite spr = factory_spr.Get_Ladrillo();
		Ladrillo ladrillo= new Ladrillo(origen,spr);
		return ladrillo;
	}
}
