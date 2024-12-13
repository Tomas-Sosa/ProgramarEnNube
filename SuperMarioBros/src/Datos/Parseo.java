

package Datos;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Parseo {

    public static String MapaDesdeDibujo() {
        String archivoEntrada = "src/Datos/premapa1";  // Ruta desde la raíz del proyecto
        String archivoSalida = "src/Datos/mapa1.txt";  // Ruta de salida en el directorio de trabajo

        try {
            procesarArchivo(archivoEntrada, archivoSalida);
            System.out.println("Archivo procesado correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al procesar el archivo: " + e.getMessage());
            
        }
		return archivoSalida;
    }

    public static void procesarArchivo(String archivoEntrada, String archivoSalida) throws IOException {
        // Crear un mapa de reemplazo para los caracteres
        Map<Character, String> reemplazos = new HashMap<>();
        reemplazos.put('Z', "00"); // SuperChamp
        reemplazos.put('B', "01"); // ChampVerde
        reemplazos.put('X', "02"); // FlorFuego
        reemplazos.put('V', "03"); // Moneda
        reemplazos.put('C', "04"); // Estrella
        
        reemplazos.put('S', "11");	//Bloque Ladrillo

        reemplazos.put('F', "12");	//Tubo Inferior
        							//Tubo Inferior
        reemplazos.put('A', "13");  //Bloque Misterioso
        reemplazos.put('D', "14"); //Bloque Solido
        
        reemplazos.put('Q', "20"); //Goomba
        reemplazos.put('E', "21"); //Koopa
        reemplazos.put('R', "22"); //Piranha
        reemplazos.put('Y', "23"); //Lakitu
        reemplazos.put('T', "24"); //Spiny
        reemplazos.put('W', "25"); //Buzzy
        
        reemplazos.put('U', "26");
        

        // Lee el archivo usando FileReader
        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {

            String linea;
            int numeroLinea = 0;

            // Procesa cada línea del archivo de entrada
            while ((linea = br.readLine()) != null) {
                // Procesa cada carácter de la línea
                for (int i = 0; i < linea.length(); i++) {
                    char caracter = linea.charAt(i);
                    int columna = i;

                    // Solo escribimos si el carácter no es un espacio en blanco
                    if (!Character.isWhitespace(caracter) && (caracter != 'U') && (caracter != '\t')) {
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
    public static Coordenada PosicionInicialMario() {
        Coordenada CoordRetornar = new Coordenada(Constantes.OFFSET,Constantes.OFFSET);
        String archivoEntrada = "src/Datos/premapa1";
        
        // Utilizamos try-with-resources para asegurarnos de cerrar el BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada))) {
            
            boolean encontre = false;
            String linea;
            int numeroLinea = 0;

            // Procesa cada línea del archivo de entrada
            while ((linea = br.readLine()) != null && !encontre) {
                // Procesa cada carácter de la línea
                for (int i = 0; i < linea.length(); i++) {
                    char caracter = linea.charAt(i);
                    int columna = i;

                    // Si encontramos a Mario ('U')
                    if (caracter == 'U') {
                        CoordRetornar = new Coordenada(columna*Constantes.OFFSET, numeroLinea*Constantes.OFFSET);
                        encontre = true; // Marcamos que lo encontramos
                    }
                }
                numeroLinea++; // Aumentamos el número de línea
            }

        } catch (IOException e) {
            // Manejo de la excepción
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
        return CoordRetornar; // Retornamos la coordenada encontrada (o null si no se encontró)
    }
}