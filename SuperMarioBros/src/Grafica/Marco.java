package Grafica;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Marco {
    private Image fondoMapa; // Imagen del fondo del mapa

    public Marco() { // Constructor que recibe la ruta de la imagen
        fondoMapa = new ImageIcon("./src/Assets/Escenario/bkgd_main.png").getImage(); // Cargar la imagen
    }

    public Image getFondoMapa() { // Método para obtener la imagen del fondo
        return fondoMapa;
    }
}