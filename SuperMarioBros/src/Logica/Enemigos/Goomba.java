package Logica.Enemigos;

import Datos.Coordenada;
import Grafica.Sprite;
import Logica.PowerUps.PowerUp;

public class Goomba extends Enemigo{
	public Goomba(Coordenada coord,Sprite spr) {
		super(coord,spr,16,16);
	}

	@Override
	public void colisionar(Enemigo enemigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void colisionar(PowerUp power_up) {
		// TODO Auto-generated method stub
		
	}
}