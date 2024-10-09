package Logica;

public class Coordenada {
    private double x;
    private double y;

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters (opcional, si quieres permitir la modificación de las coordenadas)
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para mostrar las coordenadas
    public void mostrarCoordenada() {
        System.out.printf("Coordenada: (%.2f, %.2f)%n", x, y); // Formato más elegante
    }

    // Método para calcular la distancia a otra coordenada
    public double distancia(Coordenada otra) {
        double dx = this.x - otra.x;
        double dy = this.y - otra.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}