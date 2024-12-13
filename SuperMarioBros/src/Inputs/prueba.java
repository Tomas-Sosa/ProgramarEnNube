package Inputs;
import Grafica.Juego;
import javax.swing.JFrame; // Importar JFrame para crear la ventana

public class prueba {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Juego"); // Crear un marco para el juego
        Juego juego = new Juego(); // Crear la instancia del juego

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        ventana.setSize(800, 800); // Establecer el tamaño de la ventana
        ventana.add(juego); // Agregar el panel de juego a la ventana
        ventana.setVisible(true); // Hacer visible la ventana
        juego.iniciar(); // Iniciar el juego
    }
}