package Logica.Plataformas;

import Datos.Coordenada;
import Grafica.Sprite;
import Logica.Entidad;
import Logica.Mario;
import Logica.Enemigos.Enemigo;
import Logica.PowerUps.PowerUp;
import Visitantes.ColisionVisitor;

public class Ladrillo extends Plataforma{
	
	public Ladrillo(Coordenada coord, Sprite spr) {
		super(coord,spr,16,16);
	}

	public String getTipo() {
		// TODO Auto-generated method stub
		return "Ladrillo";
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
