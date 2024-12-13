package Logica.Estados;

import Logica.Mario;
import Logica.Enemigos.Enemigo;

public class Super implements MarioStates{

	@Override
	public void getChampi(Mario mario) {
	}

	@Override
	public void getFlor(Mario mario) {
		mario.setState(new Fuego());
	}

	@Override
	public void getEstrella(Mario mario) {
		mario.setState(new Invencible());
	}

	@Override
	public void dañado(Mario mario) {
		mario.setState(new Normal());
	}

	@Override
	public void muerto(Mario mario) {
		mario.setState(new Muerto());
	}
	
	public void update(Mario mario) {
		mario.getSprite().setRutaImagen("./Assets//Entidades/Mario/spr_mario_grande_caminando.gif");
	}

	@Override
	public void colisionar(Enemigo enemigo) {
		Mario.getInstancia().setState(new Normal());
	}

}
