package Logica.PowerUps;
import Datos.Coordenada;
import Grafica.Sprite;
import Logica.Entidad;
import Logica.Mario;

public abstract class PowerUp extends Entidad{
	
    public PowerUp(Coordenada coord,Sprite spr, int ancho, int alto) {
    	super(coord,spr,ancho,alto);
    }
    
}
