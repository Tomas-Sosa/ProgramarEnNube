package Logica;

import Grafica.Sprite;

public class Enemigo extends Entidad{

	public Enemigo(Coordenada coord, Sprite spr, int alto, int ancho) {
        super(coord,spr, alto, ancho);  // Inicializa el enemigo con una coordenada y tamaño
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
	public void isColisionCheck(Entidad ente) {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void mostrarDetalles() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Enemigo";
	}

}
