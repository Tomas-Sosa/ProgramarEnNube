package Logica;

import Grafica.Observer;
import Grafica.Sprite;

public abstract class Entidad extends EntidadBase{
	protected Coordenada coordenada; // Atributo para la coordenada
	protected Observer observer;
	protected Sprite spr;
    protected Hitbox hitbox;

    // Constructor
    public Entidad(Coordenada coord,Sprite spr, int ancho, int alto) {
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
	
	public abstract String getTipo();
	
	public abstract void colisionar(Entidad entidad);
	public abstract void accept(ColisionVisitor visitor);
	public abstract void mover();
	public abstract void isColisionCheck(Entidad entidadEntrante);
	//A partir del alto, ancho y coordenadas de entidad entrante y local, se hacen los calculos.

	protected abstract void mostrarDetalles();
}
