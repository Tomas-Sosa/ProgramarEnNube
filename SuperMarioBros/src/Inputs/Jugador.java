package Inputs;
import Datos.Parseo;
import Logica.Mario;
public class Jugador {
	private Mario mario;
	
	public Jugador() {
		this.mario = Mario.getInstancia();
	}

	public Mario getMario(){
		return mario;
	}
	
/*	 public void moverIzquierda() {
	        mario.moverHorizontal(-1);
	        System.out.println("Mario se movio a la izq");
    }

    public void moverDerecha() {
        mario.moverHorizontal(1);
        System.out.println("Mario se movio a la derecha");
    }
    
    public void detener() {
    	mario.detener();
    	System.out.println("Mario se detuvo");
    }
  */
	public void moverIzquierda(boolean b) {
		mario.setIzquierda(b);
	//	System.out.println("izquierda test");hasta aca lee
	}
	public void moverDerecha(boolean b) {
		mario.setDerecha(b);
	}
	
	
    public void saltar() {
    	if (!mario.isSaltando()) {
    		mario.saltar();
    		System.out.println("Mario saltó");
    	}
    }
    
    public void actualizarPosicion() {
        // Imprimir el hilo actual
        System.out.println("Hilo actual" + Thread.currentThread().getName());
        getMario().traza();;
        // Lógica de actualización de la posición de Mario
        // Por ejemplo: x += velocidadX;
    }
}
