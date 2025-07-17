import java.util.HashMap;
import java.util.Scanner;
/*
mapa.put(1, "Java") — добавляет элемент с ключом 1 и значением "Java".

mapa.put(2, "JavaScript") перезаписывает значение по ключу 2 (ранее был "Python").

Если ты вызываешь put() с уже существующим ключом, значение заменяется.

В конце пользователь может сам добавить значение — полезно для практики.
 */
public class InsertarElementos {
    public static void ejecutar() {
        System.out.println("\n=== INSERTAR ELEMENTOS EN HASHMAP ===");


        // Creamos un nuevo HashMap
        HashMap<Integer, String > mapa = new HashMap<>();

        //Insertamos elementos usando put()
        mapa.put(1, "Java");
        mapa.put(2, "Python");
        mapa.put(3, "C++");

        System.out.println("Elementos insertados: ");
        System.out.println(mapa);

        //Insertamos un nuevo par con una clave existente
        System.out.println("\nInsertamos un nuevo valor con clave 2: ");
        mapa.put(2, "JavaScript");

        //Permitir al usuario insertar más elementos manualmente
        Scanner sc = new Scanner(System.in);
        System.out.println("\n¿Deseas añadir tu propio elemento? (s/n): ");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Introduce la clave (enero): ");
            int clave = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            System.out.println("Introduce el valor  ( texto): ");
            String valor = sc.nextLine();

            mapa.put(clave, valor);
            System.out.println("Nuevo HashMap: ");
            System.out.println(mapa);
        } else {
            System.out.println("No se añadió ningún elemento nuevo");
        }

    }
}
