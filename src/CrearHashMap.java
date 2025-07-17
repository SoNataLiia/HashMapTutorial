import java.util.HashMap;
/*
HashMap<Integer, String> — это коллекция, где ключи — числа (Integer), а значения — строки (String).

new HashMap<>() — создаёт новую карту (пустую).

Метод put(ключ, значение) добавляет элемент.

Метод size() возвращает количество пар.

HashMap не гарантирует порядок элементов — они могут быть в любом порядке.
 */
public class CrearHashMap {
    public static void ejecutar() {
        System.out.println("\n=== CREAR HASHMAP ===");

        // Creamos un HashMap donde la clave es Integer  y el valor es String
        HashMap<Integer, String> mapa = new HashMap<>();

        //Mostramos el tamaño inicial
        System.out.println("HashMap creado. Tomaño inicial: " + mapa.size());

        //Añadimos elementos de ejemplo
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");

        //Mostramos el contenido
        System.out.println("Contenido del HashMap: " + mapa);

        //Mostramos tamaño actualizado
        System.out.println("Tamaño actual: " + mapa.size());

    }
}
