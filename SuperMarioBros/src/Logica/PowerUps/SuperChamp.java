package Logica.PowerUps;

import Datos.Coordenada;
import Grafica.Sprite;
import Logica.Mario;
import Logica.Enemigos.Enemigo;
import Logica.Estados.Super;
import Logica.Plataformas.Plataforma;
import Visitantes.ColisionVisitor;

public class SuperChamp extends PowerUp {

	public SuperChamp(Coordenada coord, Sprite spr) {
		super(coord, spr, 16, 16);
	}


	@Override
	
	public void colisionar(Mario mario) {
		mario.setState(new Super());
		this.observer.actualizar("nada"); //esto podria ser llamado mediante super.colisionar de powerup, asi todos los power ups lo usan
	}

	@Override
	public void accept(ColisionVisitor visitor) {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void mostrarDetalles() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void colisionar(Enemigo enemigo) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void colisionar(PowerUp power_up) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void colisionar(Plataforma plataforma) {
		// TODO Auto-generated method stub
		
	}

}