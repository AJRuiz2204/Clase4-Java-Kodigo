import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Ejercicio 1(Facil): Uso de Map y Operador Ternario.
 * Descripción: Crear un mapa de nombres y edades, y utilizar el operador ternario para determinar
 * si una persona es mayor de edad.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un mapa para almacenar los nombres y edades de las personas
        Map<String, Integer> personas = new HashMap<>();

        // Solicitar al usuario la cantidad de personas que desea ingresar
        System.out.println("Cuantas personas desea ingresar?");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea restante

        // Bucle para ingresar los datos de las personas
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre de la persona: ");
            String nombre = scanner.nextLine(); // Leer el nombre

            System.out.println("Ingrese la edad de " + nombre + ": ");
            int edad = scanner.nextInt(); // Leezr la edad
            scanner.nextLine(); // Consumir el salto de línea restante

            // Agregar el nombre y la edad al mapa
            personas.put(nombre, edad);
        }

        // Mostrar la lista de personas y su estado de edad
        System.out.println("Lista de personas y su estado de edad:");
        System.out.println("-------------------------------------");
        System.out.println("\nResultados:");

        // Iterar sobre las entradas del mapa y determinar si son mayores o menores de edad
        for (Map.Entry<String, Integer> entradas : personas.entrySet()) {
            String nombre = entradas.getKey(); // Obtener el nombre
            int edad = entradas.getValue(); // Obtener la edad

            // Usar el operador ternario para determinar si es mayor o menor de edad
            String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

            // Imprimir el resultado
            System.out.println(nombre + " tiene " + edad + " años y es " + resultado);
        }
    }
}
