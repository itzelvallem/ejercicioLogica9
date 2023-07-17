package ejercicio10;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 
- Crear un programa en `Java` que realice lo siguiente:
- Crear un diccionario Español-Inglés, que contenga al menos 20 palabras su respectiva traducción
- Utilizar un *objeto* `HashMap` para almacenar los pares de palabras
- Escoger al azar 5 palabars en español del mini diccionario

- Input
- Pedir al usuario que teclee la traducción al inglés de cada una de las palabras
- Comprobar si el input es correcto
- Output
  - Mostrar cuántas respuestas correctas e incorrectas tiene el usuario
 * 
 * */

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Crear un HashMap de tipo String como clave y String como valor
		Map<String, String> miMapa = new HashMap<>();
		
		//agregar elementos al mapa (20) espaniol y inglés
		miMapa.put("gato", "cat");
		miMapa.put("puerta", "door");
		miMapa.put("hola", "hello");
		miMapa.put("adios", "goodbye");
		miMapa.put("uva", "grape");
		miMapa.put("sol", "sun");  //6
		miMapa.put("ventana", "window");
		miMapa.put("cortina", "curtain");
		miMapa.put("mesa", "table");
		miMapa.put("cocina", "kitchen"); //10
		miMapa.put("lapiz", "pencil");
		miMapa.put("carro", "car");
		miMapa.put("silla", "chair");
		miMapa.put("blusa", "blouse");
		miMapa.put("pluma", "pen");
		miMapa.put("caja", "box");  //16
		miMapa.put("techo", "roof");
		miMapa.put("perro", "dog");
		miMapa.put("queso", "cheese");
		miMapa.put("tenedor", "fork"); //20
		
		//inicializar los contadores en 0
		int contadorRespuestasCorrectas = 0;
		int contadorRespuestasInorrectas = 0;
		
		// Escoger al azar 5 palabras en español del mini diccionario
        List<String> palabrasEspaniol = new ArrayList<>(miMapa.keySet());
        //Es un método estático que reordena aleatoriamente los elementos de una lista.
        Collections.shuffle(palabrasEspaniol);
        //es la lista resultante que contiene las primeras 5 palabras de palabrasEspaniol en el orden aleatorio generado por shuffle.
        List<String> palabrasSeleccionadas = palabrasEspaniol.subList(0, 5);
		
		// Comprobar si la palabra está en el diccionario
        for (String palabra : palabrasSeleccionadas) {
            System.out.println("Ingrese la traducción al inglés de la palabra '" + palabra + "'");
          //Pedir al usuario ingresar una palabra en espaniol
            String traduccionUsuario = scanner.next();

            if (traduccionUsuario.equalsIgnoreCase(miMapa.get(palabra))) {
                contadorRespuestasCorrectas++;
            } else {
                System.out.println("Respuesta incorrecta. La traducción correcta es: " + miMapa.get(palabra));
                contadorRespuestasInorrectas++;
            }
        }

		
		 System.out.println("Cantidad de respuestas correctas: " + contadorRespuestasCorrectas);
		 System.out.println("Cantidad de respuestas incorrectas: " + contadorRespuestasInorrectas);
		scanner.close(); //Cerrar el Scanner

	} //Fin main :)

}