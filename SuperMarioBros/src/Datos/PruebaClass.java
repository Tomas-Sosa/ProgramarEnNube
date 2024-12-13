package Datos;

import Logica.NivelBuilder;
import Logica.Fabricas.FabricaElementos;
import Logica.Fabricas.FabricaSpritesBase;
import Logica.Fabricas.FabricaSprites;

public class PruebaClass {
    public static void main(String[] args) {
    	// Crear una instancia de NivelBuilder
    	FabricaSpritesBase factory_spr = new FabricaSprites("Assets/");
		FabricaElementos factory_elem = new FabricaElementos(factory_spr);
        NivelBuilder nivelBuilder = new NivelBuilder(factory_elem, null); 

        // Construir las entidades
        nivelBuilder.buildEntidades();
    }
}
