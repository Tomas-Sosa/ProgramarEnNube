package Logica;

import Datos.Coordenada;
import Grafica.Observer;
import Grafica.Sprite;

public abstract class EntidadBase {
	public abstract Coordenada getCoordenada();
	public abstract Sprite getSprite();
	public abstract Hitbox getHitbox();
	public abstract void setObserver(Observer observer);
	public void colisionar(Entidad entidad) {
		// TODO Auto-generated method stub
		
	}
}
