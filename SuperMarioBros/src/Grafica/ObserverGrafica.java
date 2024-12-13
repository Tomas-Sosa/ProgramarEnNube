package Grafica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Datos.Constantes;
import Logica.Entidad;

public abstract class ObserverGrafica extends JLabel implements Observer{

	private static final long serialVersionUID = 1L;
	private Entidad entidad;

	protected ObserverGrafica(Entidad entidad_observada) {
		super();
		entidad = entidad_observada;
	}
	
	public void actualizar(String ruta) {
		actualizar_imagen(ruta);
		actualizar_posicion_tamano();
	}
	
	public void actualizar() {
		actualizar_imagen();
		actualizar_posicion_tamano();
	}
	
	protected void actualizar_imagen(String ruta) {
		if(ruta == "nada")
			this.setVisible(false);
		else{
			entidad.getSprite().setRutaImagen(ruta);
			String ruta_imagen = ruta;
			ImageIcon icono = new ImageIcon(getClass().getClassLoader().getResource(ruta_imagen));
			setIcon(icono);
		}
	}
	
	protected void actualizar_imagen() {
		String ruta_imagen = entidad.getSprite().getRutaImagen();
		ImageIcon icono = new ImageIcon(getClass().getClassLoader().getResource(ruta_imagen));
		setIcon(icono);
	}
	
	protected void actualizar_posicion_tamano() {
		int x = entidad.getCoordenada().getX();
		int y = entidad.getCoordenada().getY();
		int ancho = this.getIcon().getIconWidth() ;
		int alto = this.getIcon().getIconHeight() ;
		setBounds(x, y - alto, ancho, alto);
	}
	
}
