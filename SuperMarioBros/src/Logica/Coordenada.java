package Logica;

public class Coordenada {
    private int x;
    private int y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters (opcional, si quieres permitir la modificación de las coordenadas)
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Método para mostrar las coordenadas
    public void mostrarCoordenada() {
        System.out.printf("Coordenada: (%.2f, %.2f)%n", x, y); // Formato más elegante
    }

    // Método para calcular la distancia a otra coordenada
    public double distancia(Coordenada otra) {
        int dx = this.x - otra.x;
        int dy = this.y - otra.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}