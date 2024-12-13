package Logica.Enemigos;

import Datos.Coordenada;
import Grafica.Sprite;
import Logica.PowerUps.PowerUp;

public class Piranha extends Enemigo{
	public Piranha(Coordenada coord,Sprite spr) {
		super(coord,spr,16,16);
	}

	
	
	
	public void mover() {

        int nuevaY = this.coordenada.getY() + (VELOCIDAD_X * direccionX);


        if (nuevaY <= 0) {
            direccionX = 1; // Cambia de dirección hacia la derecha
            nuevaY = 0; // Asegúrate de que no pase de 0
        } 

        // Actualiza la coordenada del enemigo
        this.coordenada.setY(nuevaY);

        // Notifica al observador
        this.observer.actualizar();

		
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
