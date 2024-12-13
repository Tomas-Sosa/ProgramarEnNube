package Logica;

import Grafica.ControladorVista;
import Grafica.Juego;

public class HiloMario {
	
protected Juego juego;
	
	public HiloMario(Juego juego) {
		this.juego = juego;	
		}
	
	
	public void run() {
        while (true) {
        	Mario.getInstancia().MovimientoMario();
            
            //repaint();

            try {
                Thread.sleep(16);  // Aproximadamente 60 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
