import java.util.HashMap;
import java.util.Scanner;
/*
mapa.get(clave) — возвращает значение по ключу. Если ключа нет — возвращает null.

mapa.getOrDefault(clave, "значение") — возвращает значение по ключу, а если ключа нет — возвращает указанное по умолчанию.

Это безопасный способ получить значение без null.
 */

public class ObtenerElemento {
    public static void ejecutar(){
        System.out.println("\n=== OBTENER ELEMENTOS DE UN HASHMAP === ");

        //Creamos y llenamos el HashMap con datos de ejemplo
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(10, "Sol");
        mapa.put(20, "Luna");
        mapa.put(30, "Estrella");

        // Mostramos el contenido
        System.out.println("Contenido del HashMap: " + mapa);

        // Pedimos al usuario que ingrese una clave
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una clave ( ej. 10, 20, 30): ");
        int clave = sc.nextInt();

        // Obtenemos el valor usando get()
        String valor = mapa.get(clave);

        //Comprobamos si el valor existe
        if (valor != null) {
            System.out.println("Valor encontrado: " + valor);
        } else {
            System.out.println("No existe ningún valor con esa clave.");
        }

        //Mostramos cómo usar getOrDefault()
        System.out.println("\nUsamos getOrDefault para una clave que no existe:");
        String resultado = mapa.getOrDefault(40, "Valor por defecto");
        System.out.println("mapa.get.OrDefault(40, \" Valor por defecto\")->" + resultado);

    }
}
