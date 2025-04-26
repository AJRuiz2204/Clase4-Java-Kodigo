import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Ejercicio 2 Intermedio: Contar Frecuencia de Palabras
 * Descripción: Crear un mapa para contar la frecuencia de palabras en una lista de frases y usar
 * el operador ternario para determinar si una palabra aparece más de una vez.
 *
 * Usa estas frases: "hello world", "hello", "world hello", "hello world world"
 * */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un mapa para almacenar la frecuencia de palabras
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        // Ingresar las frases
        System.out.println("Ingrese las frases (separadas por comas): ");
        String input = scanner.nextLine();
        String[] frases = input.split(",");

        // Contar la frecuencia de palabras
        for (String frase : frases) {
            String[] palabras = frase.trim().split(" "); // Corregir para usar cada frase
            for (String palabra : palabras) {
                // Usar el operador ternario para actualizar la frecuencia
                frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
            }
        }

        // Mostrar la frecuencia de palabras
        System.out.println("Frecuencia de palabras:");
        for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
            String palabra = entrada.getKey();
            int frecuencia = entrada.getValue();

            // Usar el operador ternario para determinar si la palabra aparece más de una vez
            String resultado = (frecuencia > 1) ? "aparece más de una vez" : "aparece una vez";

            // Imprimir el resultado
            System.out.println(palabra + ": " + frecuencia + " veces (" + resultado + ")");
        }

        // Cerrar el escáner
        scanner.close();
    }
}
