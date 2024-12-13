package Datos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class Puntaje {
    private int puntajeActual;
    private List<RegistroRanking> ranking;

    // Clase interna para representar un registro en el ranking
    private static class RegistroRanking {
        @SuppressWarnings("rawtypes")
		public static ToIntFunction getPuntaje;
		String nombre;
        int puntaje;

        public RegistroRanking(String nombre, int puntaje) {
            this.nombre = nombre;
            this.puntaje = puntaje;
        }
        
    }

    public Puntaje() {
        puntajeActual = 0;
        ranking = new ArrayList<>();
    }

    
    public void sumarPuntos(int puntos) {
        puntajeActual += puntos;
    }


    public int getPuntajeActual() {
        return puntajeActual;
    }

    // Método para agregar un nuevo registro al ranking
    @SuppressWarnings("unchecked")
	public void agregarAlRanking(String nombre) {
        ranking.add(new RegistroRanking(nombre, puntajeActual));
        // Ordenar el ranking de mayor a menor puntaje
        Collections.sort(ranking, Comparator.comparingInt(RegistroRanking.getPuntaje).reversed());
    }

    // Método para mostrar el ranking por pantalla
    public void mostrarRanking() {
        System.out.println("Ranking:");
        for (RegistroRanking registro : ranking) {
            System.out.println(registro.nombre + ": " + registro.puntaje);
        }
    }
}