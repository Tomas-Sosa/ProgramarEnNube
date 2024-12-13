package Logica.Fabricas;

import Grafica.Sprite;

public abstract class FabricaSpritesBase {
	
	protected String ruta_al_sprite;
	
	protected FabricaSpritesBase(String ruta_al_sprite) {
		this.ruta_al_sprite = ruta_al_sprite;
	}
	
	public Sprite getFondo() {
		return new Sprite(ruta_al_sprite + "Escenario/bkgd_main.png");
	}
	
	public Sprite getSuperMario() {
		return new Sprite(ruta_al_sprite + "Entidades/Mario/spr_mario_grande_caminando.gif");
	}
	
	public Sprite getMario() {
		return new Sprite(ruta_al_sprite + "Entidades/Mario/spr_mario_caminando.gif");
	}
	
	public Sprite getGoomba() {
		return new Sprite(ruta_al_sprite + "Entidades/Enemigos/spr_goomba_caminando.gif");
	}
	
	public Sprite getKoopa() {
		return new Sprite(ruta_al_sprite + "Entidades/Enemigos/spr_koopa_caminando.gif");
	}
	
	public Sprite getLakitu() {
		return new Sprite(ruta_al_sprite + "Entidades/Enemigos/spr_lakitu.png");
	}
	
	public Sprite getPiranha() {
		return new Sprite(ruta_al_sprite + "Entidades/Enemigos/spr_piranha.gif");
	}
	
	public Sprite getSpiny() {
		return new Sprite(ruta_al_sprite + "Entidades/Enemigos/spr_spiny_caminando.gif");
	}
	
	public Sprite getBuzzy() {
		return new Sprite(ruta_al_sprite + "Entidades/Enemigos/spr_buzzy_caminando.gif");
	}
	
	public Sprite getSuperChamp() {
		return new Sprite(ruta_al_sprite + "Entidades/PowerUps/spr_champiñon_rojo.png");
	}
	
	public Sprite getChampVerde() {
		return new Sprite(ruta_al_sprite + "Entidades/PowerUps/spr_champiñon_verde.png");
	}
	
	public Sprite getFlor() {
		return new Sprite(ruta_al_sprite + "Entidades/PowerUps/spr_flor.gif");
	}
	
	public Sprite getEstrella() {
		return new Sprite(ruta_al_sprite + "Entidades/PowerUps/spr_estrella.gif");
	}
	
	public Sprite getMoneda() {
		return new Sprite(ruta_al_sprite + "Entidades/PowerUps/spr_moneda.gif");
	}
	
	public Sprite getBloquePregunta() {
		return new Sprite(ruta_al_sprite + "Escenario/spr_bloque_pregunta.gif");
	}
	
	public Sprite getLadrillo() {
		return new Sprite(ruta_al_sprite + "Escenario/spr_labrillo.png");
	}
	
	public Sprite getTuboInferior() {
		return new Sprite(ruta_al_sprite + "Escenario/spr_tubo_inferior.png");
	}
	
	public Sprite getTuboSuperior() {
		return new Sprite(ruta_al_sprite + "Escenario/spr_tubo_superior.png");
	}
	
	public Sprite getVacio() {
		return new Sprite(ruta_al_sprite + "Escenario/spr_vacio.png");
	}
	
	public Sprite getBloqueSolido(){
		return new Sprite(ruta_al_sprite + "Escenario/spr_bloque_solido.png");
	}
	
	public Sprite getBloquePiso(){
		return new Sprite(ruta_al_sprite + "Escenario/spr_bloque_piso.png");
	}
}
