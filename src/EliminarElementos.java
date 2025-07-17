import java.util.HashMap;
import java.util.Scanner;
/*
Метод remove(clave) удаляет элемент по ключу и возвращает его значение.

Если ключа нет — возвращает null.

Это способ безопасно удалять данные из карты.
 */
public class EliminarElementos {
    public static void ejecutar(){
        System.out.println("\n=== ELIMINAR ELEMENTOS DE UN HASHMAP ===");

        // Creamos y llenamos el HashMap
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(100, "Inicio");
        mapa.put(200, "Proceso");
        mapa.put(300, "Fin");

        //Mostramos contenido actual
        System.out.println("HashMap actual: " + mapa);

        // Pedimos clave para eliminar
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la clave que deseas eliminar (ej. 100, 200, 300): " );
        int clave = sc.nextInt();

        //Eliminamos usando remove()
        String eliminado = mapa.remove(clave);

        //Verificamos resultado
        if (eliminado != null) {
            System.out.println("Elemento eliminado: " + eliminado);
        } else {
            System.out.println("No se encontró esa clave. No se eliminó nada");
        }

        //Mostramos contenido después
        System.out.println("HashMap después de eliminar: " + mapa);




    }
}
