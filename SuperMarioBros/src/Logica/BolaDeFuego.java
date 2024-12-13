package Logica;

import Datos.Coordenada;
import Grafica.Sprite;
import Logica.Enemigos.Enemigo;
import Logica.Plataformas.Plataforma;
import Logica.PowerUps.PowerUp;
import Visitantes.ColisionVisitor;

public class BolaDeFuego extends Entidad{

	public BolaDeFuego(Coordenada coord, Sprite spr, int ancho, int alto) {
		super(coord, spr, 8, 8);
		// TODO Auto-generated constructor stub
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

	@Override
	public void colisionar(Mario mario) {
		// TODO Auto-generated method stub
		
	}


}
