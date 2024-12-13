package Logica.Fabricas;

import Datos.Coordenada;
import Grafica.Sprite;
import Logica.Plataformas.*;
import Logica.Enemigos.*;
import Logica.PowerUps.*;

public class FabricaElementos {

	protected FabricaSpritesBase factory_spr;
	
	public FabricaElementos(FabricaSpritesBase factory_spr) {
		this.factory_spr = factory_spr;
	}
	
	//PowerUps
	public ChampVerde getChampVerde(Coordenada origen) {
	    Sprite spr = factory_spr.getChampVerde();
	    ChampVerde champVerde = new ChampVerde(origen, spr);
	    return champVerde;
	}

	public Estrella getEstrella(Coordenada origen) {
	    Sprite spr = factory_spr.getEstrella();
	    Estrella estrella = new Estrella(origen, spr);
	    return estrella;
	}

	public FlorFuego getFlorFuego(Coordenada origen) {
	    Sprite spr = factory_spr.getFlor();
	    FlorFuego florFuego = new FlorFuego(origen, spr);
	    return florFuego;
	}

	public Moneda getMoneda(Coordenada origen) {
	    Sprite spr = factory_spr.getMoneda();
	    Moneda moneda = new Moneda(origen, spr);
	    return moneda;
	}

	public SuperChamp getSuperChamp(Coordenada origen) {
	    Sprite spr = factory_spr.getSuperChamp();
	    SuperChamp superChamp = new SuperChamp(origen, spr);
	    return superChamp;
	}


	//Enemigos
	
	public Goomba getGoomba(Coordenada origen) {
		Sprite spr = factory_spr.getGoomba();
		Goomba goomba= new Goomba(origen,spr);
		return goomba;
	}
	
	public Koopa getKoopa(Coordenada origen) {
	    Sprite spr = factory_spr.getKoopa();
	    origen.setY(origen.getY() - 8);
	    Koopa koopa = new Koopa(origen, spr);
	    return koopa;
	}

	public Lakitu getLakitu(Coordenada origen) {
	    Sprite spr = factory_spr.getLakitu();
	    origen.setY(origen.getY() - 8);
	    Lakitu lakitu = new Lakitu(origen, spr);
	    return lakitu;
	}

	public Spiny getSpiny(Coordenada origen) {
	    Sprite spr = factory_spr.getSpiny();
	    Spiny spiny = new Spiny(origen, spr);
	    return spiny;
	}

	public Piranha getPiranha(Coordenada origen) {
	    Sprite spr = factory_spr.getPiranha();
	    origen.setY(origen.getY() - 8);
	    Piranha piranha = new Piranha(origen, spr);
	    return piranha;
	}
	
	public Buzzy getBuzzy(Coordenada origen) {
	    Sprite spr = factory_spr.getBuzzy();
	    Buzzy buzzy = new Buzzy(origen, spr);
	    return buzzy;
	}
	
	//Plataformas
	
	public Ladrillo getLadrillo(Coordenada origen) {
		Sprite spr = factory_spr.getLadrillo();
		Ladrillo ladrillo= new Ladrillo(origen,spr);
		return ladrillo;
	}
	
	public Vacio getVacio(Coordenada origen) {
	    Sprite spr = factory_spr.getVacio();
	    Vacio vacio = new Vacio(origen, spr);
	    return vacio;
	}

	public TuboSuperior getTuboSuperior(Coordenada origen) {
	    Sprite spr = factory_spr.getTuboInferior();
	    TuboSuperior tubo = new TuboSuperior(origen, spr);
	    return tubo;
	}
	
	public TuboInferior getTuboInferior(Coordenada origen) {
	    Sprite spr = factory_spr.getTuboInferior();
	    TuboInferior tubo = new TuboInferior(origen, spr);
	    return tubo;
	}
	
	
	public BloqueSolido getBloqueSolido(Coordenada origen) {
	    Sprite spr = factory_spr.getBloqueSolido();
	    BloqueSolido bloqueSolido = new BloqueSolido(origen, spr);
	    return bloqueSolido;
	}

	public BloquePregunta getBloquePregunta(Coordenada origen) {
	    Sprite spr = factory_spr.getBloquePregunta();
	    BloquePregunta bloquePregunta = new BloquePregunta(origen, spr);
	    return bloquePregunta;
	}
	
	public BloquePiso getBloquePiso(Coordenada origen) {
	    Sprite spr = factory_spr.getBloquePregunta();
	    BloquePiso bloquePregunta = new BloquePiso(origen, spr);
	    return bloquePregunta;
	}
}
