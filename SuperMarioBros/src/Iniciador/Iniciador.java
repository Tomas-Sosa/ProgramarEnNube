
package Iniciador;
import Grafica.Juego;
import javax.swing.JFrame; // Importar JFrame para crear la ventana

public class iniciador {
    public static void main(String[] args) {
    	Juego juego = new Juego(); // Crear la instancia del juego
        /*JFrame ventana = new JFrame("Juego"); // Crear un marco para el juego
        

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        ventana.setSize(800, 800); // Establecer el tamaño de la ventana
        ventana.add(juego); // Agregar el panel de juego a la ventana
        ventana.setVisible(true); // Hacer visible la ventana*/
        juego.iniciar(); // Iniciar el juego
    }
//<<<<<<< HEAD
}

//=======
    
    
//}
//>>>>>>> f85485aa7213d914193b444546a27cbd6f8dd8b6
