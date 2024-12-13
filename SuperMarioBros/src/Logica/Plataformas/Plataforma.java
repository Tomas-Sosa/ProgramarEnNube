package Logica.Plataformas;

import Datos.Coordenada;
import Grafica.Observer;
import Grafica.Sprite;
import Logica.Entidad;
import Logica.Hitbox;

public abstract class Plataforma extends Entidad{
    // Constructor
    public Plataforma(Coordenada coord,Sprite spr, int ancho, int alto) {
    	super(coord,spr,ancho,alto);
    }

	public void colisionar(Entidad entidad) {
		// TODO Auto-generated method stub
		
	}
}
