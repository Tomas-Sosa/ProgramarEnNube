package Logica;

import Datos.Coordenada;
import Grafica.Observer;
import Grafica.Sprite;
import Logica.Enemigos.Enemigo;
import Logica.Plataformas.Plataforma;
import Logica.PowerUps.PowerUp;
import Visitantes.ColisionVisitor;

public abstract class Entidad extends EntidadBase{
	protected Coordenada coordenada;
	protected Observer observer;
	protected Sprite spr;
    protected Hitbox hitbox;
    protected boolean es_colisionable;

    // Constructor
    public Entidad(Coordenada coord,Sprite spr, int ancho, int alto) {
    	this.spr = spr;
        this.coordenada = coord;
        this.es_colisionable = true;
        hitbox = new Hitbox (coord,alto,ancho);
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
	public int getY() {
		return this.coordenada.getY();
	}
	public void setY(int i) {
		this.coordenada.setY(i);
	}
	public int getX() {
		return this.coordenada.getX();
	}
	public void setX(int i) {
		this.coordenada.setX(i);
	}
	
	public void setObserver(Observer observer) {
		this.observer = observer;
	}
	
	public Observer getObserver() {
		return observer;
	}
	
	public abstract void colisionar(Enemigo enemigo);
	public abstract void colisionar(PowerUp power_up);
	public abstract void colisionar(Plataforma plataforma);
	public abstract void colisionar(Mario mario);
	
	//public abstract void colisionar(Entidad entidad);
	
	
	public abstract void accept(ColisionVisitor visitor);
	
	public boolean checkCollision(Entidad ent_entrante){
		Hitbox hitbox_entrante = ent_entrante.getHitbox();
		
		return hitbox.getRight() > hitbox_entrante.getLeft() &&
	               hitbox.getLeft() < hitbox_entrante.getRight() &&
	               hitbox.getBottom() > hitbox_entrante.getTop() &&
	               hitbox.getTop() < hitbox_entrante.getBottom();
	}
	
	//A partir del alto, ancho y coordenadas de entidad entrante y local, se hacen los calculos.

	protected abstract void mostrarDetalles();

	public void setColisionable(boolean valor) {
		this.es_colisionable = valor;
	}
	
	public boolean esColisionable() {
		return this.es_colisionable;
	}
	
	public abstract void mover();
}
