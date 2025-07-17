import java.util.HashMap;
import java.util.Scanner;

/*
Метод replace(clave, nuevoValor) заменяет значение только если ключ существует.

Если ключа нет — ничего не происходит.

Метод containsKey(clave) проверяет, есть ли такой ключ.
 */

public class ReemplazarElementos {
    public static void ejecutar(){
        System.out.println("\n=== REEMPLAZAR ELEMENTOS EN HASMAP ===");

        //Creamos un HashMap de ejemplo
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Rojo");
        mapa.put(2, "Verde");
        mapa.put(3, "Azul");

        //Mostramos el contenido original
        System.out.println("Contenido original del Hashmap: " + mapa);

        //Pedimos al usuario una clave
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la clave que quieres reemplazar ( ej. 1, 2, 3): ");
        int clave = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        // Pedimos un nuevo valor
        System.out.println("Introduce el nuevo valor: ");
        String nuevoValor = sc.nextLine();

        // Reemplazamos el valor si existe la clave
        if (mapa.containsKey(clave)) {
            mapa.replace(clave, nuevoValor);
            System.out.println("Valor reemplazado correctamente.");
        } else {
            System.out.println("La clave no existe. No se hizo ningún cambio.");

        }

        //Mostramos el mapa actualizado
        System.out.println("Contenido del HashMap: " + mapa);


    }
}
