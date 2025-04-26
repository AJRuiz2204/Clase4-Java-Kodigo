# Clase4-Java-Kodigo

Este proyecto contiene dos ejercicios en Java que demuestran el uso de estructuras de datos como `Map` y el operador ternario para resolver problemas comunes.

## Ejercicios

### Ejercicio 1: Uso de Map y Operador Ternario
**Descripción:**  
Este programa permite al usuario ingresar una lista de personas con sus respectivas edades. Luego, utiliza un `Map` para almacenar esta información y el operador ternario para determinar si cada persona es mayor o menor de edad.

**Instrucciones de uso:**
1. Ejecute el programa `Ejercicio1`.
2. Ingrese la cantidad de personas que desea registrar.
3. Proporcione el nombre y la edad de cada persona.
4. El programa mostrará una lista indicando si cada persona es mayor o menor de edad.

**Ejemplo de salida:**
```
Cuantas personas desea ingresar?
2
Ingrese el nombre de la persona: 
Juan
Ingrese la edad de Juan: 
20
Ingrese el nombre de la persona: 
Ana
Ingrese la edad de Ana: 
16
Lista de personas y su estado de edad:
-------------------------------------
Juan tiene 20 años y es Mayor de edad
Ana tiene 16 años y es Menor de edad
```

---

### Ejercicio 2: Contar Frecuencia de Palabras
**Descripción:**  
Este programa permite al usuario ingresar una lista de frases separadas por comas. Luego, utiliza un `Map` para contar la frecuencia de cada palabra y el operador ternario para determinar si una palabra aparece más de una vez.

**Instrucciones de uso:**
1. Ejecute el programa `Ejercicio2`.
2. Ingrese una lista de frases separadas por comas.
3. El programa mostrará la frecuencia de cada palabra y si aparece más de una vez.

**Ejemplo de entrada:**
```
hello world, hello, world hello, hello world world
```

**Ejemplo de salida:**
```
Frecuencia de palabras:
hello: 4 veces (aparece más de una vez)
world: 5 veces (aparece más de una vez)
```

---

## Requisitos
- Java 8 o superior.
- Un entorno de desarrollo como IntelliJ IDEA, Eclipse o la terminal con `javac` y `java`.

## Cómo ejecutar
1. Compile los archivos `.java`:
   ```bash
   javac src/Ejercicio1.java src/Ejercicio2.java
   ```
2. Ejecute el programa deseado:
   ```bash
   java -cp src Ejercicio1
   ```
   o
   ```bash
   java -cp src Ejercicio2
   ```

## Autor
Este proyecto fue desarrollado como parte de los ejercicios de la clase 4 del curso de Java en Kodigo.
