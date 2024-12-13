package Datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mapa {
    private HashMap<Integer, List<Coordenada>> mapaCoordenadas;

    public Mapa() {
        mapaCoordenadas = new HashMap<>();
    }

    // Método para obtener las coordenadas por su clave
    public List<Coordenada> obtenerCoordenadas(int clave) {
        return mapaCoordenadas.get(clave);
    }

    // Método para cargar las coordenadas desde el archivo
    public void cargarMapa() {
        FileReader archivo;
        BufferedReader lector;

        try {
            archivo = new FileReader(Parseo.MapaDesdeDibujo());
            lector = new BufferedReader(archivo);

            String lineaLeida;

            // Leemos línea por línea hasta llegar al final del archivo
            while ((lineaLeida = lector.readLine()) != null) {
                // Separar la línea en partes usando espacios como delimitador
                String[] lineaActual = lineaLeida.split("\\s+");

                // Convertir las partes a enteros
                int id = Integer.parseInt(lineaActual[0]);
                int coordX = Integer.parseInt(lineaActual[1]);
                int coordY = Integer.parseInt(lineaActual[2]);

                // Crear una coordenada
                Coordenada origen = new Coordenada(coordX* Constantes.OFFSET, coordY * Constantes.OFFSET);

                // Si el ID ya existe, agregar la coordenada a la lista existente
                mapaCoordenadas.putIfAbsent(id, new ArrayList<>());
                mapaCoordenadas.get(id).add(origen);

                // Imprimir los números leídos
                //System.out.println("Números leídos: " + id + ", " + coordX + ", " + coordY);
            }

            lector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para obtener el mapa de coordenadas
    public HashMap<Integer, List<Coordenada>> getMapaCoordenadas() {
        return mapaCoordenadas;
    }
}
