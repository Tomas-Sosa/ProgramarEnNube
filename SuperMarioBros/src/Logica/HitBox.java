package Logica;

import Datos.Coordenada;

public class Hitbox{
	protected Coordenada coord;
	protected int alto;
	protected int ancho;
	
	public Hitbox(Coordenada coord, int alto,int ancho) {
		this.coord = coord;
		this.alto = alto;
		this.ancho = alto;
	}
	
	public int getTop() {
		return coord.getY();
	}
	
	public int getBottom() {
		return coord.getY() + alto;
	}
	
	public int getLeft() {
		return coord.getX();
	}
	
	public int getRight() {
		return coord.getX() + ancho;
	}
}
