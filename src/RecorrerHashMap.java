import java.awt.print.PrinterGraphics;
import java.util.HashMap;
import java.util.Map;
/*
keySet() — возвращает множество всех ключей.

values() — возвращает коллекцию всех значений.

entrySet() — возвращает набор пар ключ-значение (Map.Entry).

Такой перебор позволяет обрабатывать каждый элемент, например, выводить, изменять или копировать.
 */

public class RecorrerHashMap {
    public static void ejecutar(){
        System.out.println("\n=== RECORRER UN HASHMAP ===");


        // Creamos HashMap con datos
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Lunes");
        mapa.put(2, "Martes");
        mapa.put(3, "Miércoles");

        System.out.println("Contenido actual del Hashmap: " + mapa);

        // Recorremos usando keySet()
        System.out.println("\n→ Claves del HashMap: ");
        for (Integer clave : mapa.keySet()) {
            System.out.println("Clave: " + clave );
        }

        //Recorremos usando values()
        System.out.println("\n→ Valores del HashMap: ");
        for (String valor : mapa.values()) {
            System.out.println("Valor" + valor);
        }

        // Recorremos usando entrySet()
        System.out.println("\n→ Clave y valor juntos:");
        for (Map.Entry<Integer, String> entrada : mapa.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + " | Valor : " + entrada.getValue());
        }
    }
}
