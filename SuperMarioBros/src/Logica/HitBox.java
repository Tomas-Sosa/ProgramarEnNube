package Logica;

public class HitBox {
	
	private Coordenada punto;
	private int altura;
	private int ancho;
	
	public HitBox(Coordenada coor, int h, int b) {
		punto= coor;
		setAltura(h);
		setAncho(b);
		
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	public Coordenada getpunto() {
		return punto;
	}

}
