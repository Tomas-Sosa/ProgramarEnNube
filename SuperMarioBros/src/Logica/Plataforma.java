package Logica;

import Grafica.Observer;
import Grafica.Sprite;

public abstract class Plataforma extends Entidad{
	protected Coordenada coordenada; // Atributo para la coordenada
	protected Observer observer;
	protected Sprite spr;
    protected Hitbox hitbox;

    // Constructor
    public Plataforma(Coordenada coord,Sprite spr, int ancho, int alto) {
    	super(coord,spr,ancho,alto);
    	this.spr = spr;
        this.coordenada = coord;
        hitbox = new Hitbox (alto,ancho);
    }
	
	public Coordenada getCoordenada() {
		return coordenada;
	}
	
	public Sprite getSprite() {
		return spr;
	}
	
	public Hitbox getHitbox() {
		return hitbox;
	}
	
	public void setObserver(Observer observer) {
		this.observer = observer;
	}

}
