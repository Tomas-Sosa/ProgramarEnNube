package Grafica;

public class Sprite {

	protected String ruta_imagen;
	
	public Sprite (String ruta_imagen) {
		this.ruta_imagen = ruta_imagen;
	}
	
	public String getRutaImagen() {
		return ruta_imagen;
	}
	
	public void setRutaImagen(String ruta_imagen) {
		this.ruta_imagen = ruta_imagen;
	}
}
