package Logica.Estados;

import Logica.Mario;
import Logica.Enemigos.Enemigo;

public class Invencible implements MarioStates {

	@Override
	public void getChampi(Mario mario) {
	}

	@Override
	public void getFlor(Mario mario) {
	}

	@Override
	public void getEstrella(Mario mario) {
	}
	
	@Override
	public void dañado(Mario mario) {
	}

	@Override
	public void muerto(Mario mario) {
		mario.setState(new Muerto());
	}

	@Override
	public void update(Mario mario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void colisionar(Enemigo enemigo) {
		// TODO Auto-generated method stub
		
	}

}
