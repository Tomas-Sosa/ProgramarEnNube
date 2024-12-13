

/*

package Datos;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CaracterPosiciones {

    public static void main(String[] args) {
        // Ruta del archivo dentro de src
        String archivoEntrada = "src/Datos/premapa1";  // Ruta correcta desde la raíz del proyecto
        String archivoSalida = "src/Datos/mapa1.txt";  // Ruta de salida en el directorio de trabajo

        try {
            procesarArchivo(archivoEntrada, archivoSalida);
            System.out.println("Archivo procesado correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al procesar el archivo: " + e.getMessage());
        }
    }

    public static void procesarArchivo(String archivoEntrada, String archivoSalida) throws IOException {
        // Crear un mapa de reemplazo para los caracteres
        Map<Character, String> reemplazos = new HashMap<>();
        reemplazos.put('Q', "20");
        reemplazos.put('W', "25");
        reemplazos.put('E', "21");
        reemplazos.put('R', "22");
        reemplazos.put('T', "24");
        reemplazos.put('Y', "23");
        reemplazos.put('U', "26");
        reemplazos.put('A', "13");
        reemplazos.put('S', "11");
        reemplazos.put('D', "14");
        reemplazos.put('Z', "00");
        reemplazos.put('X', "02");
        reemplazos.put('C', "04");
        reemplazos.put('V', "03");
        reemplazos.put('B', "01");

        // Lee el archivo usando FileReader
        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {

            String linea;
            int numeroLinea = 1;

            // Procesa cada línea del archivo de entrada
            while ((linea = br.readLine()) != null) {
                // Procesa cada carácter de la línea
                for (int i = 0; i < linea.length(); i++) {
                    char caracter = linea.charAt(i);
                    int columna = i + 1; // Se suma 1 para que las columnas empiecen en 1

                    // Solo escribimos si el carácter no es un espacio en blanco
                    if (!Character.isWhitespace(caracter)) {
                        String caracterSalida = String.valueOf(caracter);

                        // Verificar si el carácter tiene un reemplazo en el mapa
                        if (reemplazos.containsKey(caracter)) {
                            caracterSalida = reemplazos.get(caracter); // Reemplaza el carácter por su valor correspondiente
                        }

                        // Escribimos el resultado en el archivo de salida
                        bw.write(caracterSalida + " " + columna + " " + numeroLinea + "\n");
                    }
                }
                numeroLinea++;
            }
        }
    }
}



*/