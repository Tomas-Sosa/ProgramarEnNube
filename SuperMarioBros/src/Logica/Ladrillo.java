package Logica;

import Grafica.Sprite;

public class Ladrillo extends Plataforma{
	
	public Ladrillo(Coordenada coord, Sprite spr) {
		super(coord,spr,16,16);
	}

	public String getTipo() {
		// TODO Auto-generated method stub
		return "Ladrillo";
	}

	@Override
	public void colisionar(Entidad entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(ColisionVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isColisionCheck(Entidad entidadEntrante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void mostrarDetalles() {
		// TODO Auto-generated method stub
		
	}
}
