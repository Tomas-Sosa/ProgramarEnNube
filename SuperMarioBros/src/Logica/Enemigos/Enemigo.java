package Logica.Enemigos;

import Datos.Coordenada;
import Grafica.Sprite;
import Logica.Entidad;
import Logica.Mario;
import Logica.Plataformas.Plataforma;
import Visitantes.ColisionVisitor;

public abstract class Enemigo extends Entidad{
	protected int VELOCIDAD_X = 1; // Velocidad de movimiento
    protected int direccionX = -1; // 1 = derecha, -1 = izquierda
    
	public Enemigo(Coordenada coord, Sprite spr, int alto, int ancho) {
        super(coord,spr, alto, ancho);  // Inicializa el enemigo con una coordenada y tamaño
    }
	
	// Método para mover el enemigo
    public void mover() {
        // Calcula la nueva coordenada según la dirección actual
        int nuevaX = this.coordenada.getX() + (VELOCIDAD_X * direccionX);

        // Cambia de dirección si alcanza el borde izquierdo (x = 0)
        if (nuevaX <= 0) {
            direccionX = 1; // Cambia de dirección hacia la derecha
            nuevaX = 0; // Asegúrate de que no pase de 0
        } 
        // Puedes agregar otra condición si quieres que también cambie en el borde derecho
        // if (nuevaX >= LIMITE_DERECHO) {
        //     direccionX = -1; // Cambia de dirección hacia la izquierda
        //     nuevaX = LIMITE_DERECHO; // Asegúrate de que no pase del límite derecho
        // }

        // Actualiza la coordenada del enemigo
        this.coordenada.setX(nuevaX);
        //System.out.println("La posición del enemigo es: " + this.coordenada.getX());

        // Notifica al observador
        this.observer.actualizar();
    }
    

	@Override
	public void colisionar(Mario mario) {
		mario.getState().colisionar(this);
	}
	
	public void colisionar(Plataforma plataforma) {
		// TODO Auto-generated method stub
	}

	@Override
	public void accept(ColisionVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}


	@Override
	protected void mostrarDetalles() {
		// TODO Auto-generated method stub
		
	}


}
