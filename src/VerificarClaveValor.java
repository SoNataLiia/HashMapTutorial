import java.util.HashMap;
import java.util.Scanner;
/*
containsKey(clave) — возвращает true, если ключ есть в HashMap.

containsValue(valor) — возвращает true, если значение есть в карте.

Используется, когда нужно убедиться, что не дублируешь данные, или перед get(), чтобы не получить null.
 */
public class VerificarClaveValor {
    public static void ejecutar(){

        System.out.println("\n===VERIFICAR CLAVE O VALOR EN HASHMAP ===");


        // Creamos y llenamos un HashMap
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("usuario1", "admin");
        mapa.put("usuario2", "editor");
        mapa.put("usuario3", "lector");

        // Mostramos contenido
        System.out.println("Contenido del HashMap: " + mapa);
        Scanner sc = new Scanner(System.in);

        // Verificamos clave
        System.out.println("\nIntroduce una clave a buscar ( ej. usuario1, usuario2, usuario3");
        String clave = sc.nextLine();

        if (mapa.containsKey(clave)) {
            System.out.println("✅ La clave existe: " + clave);
        } else {
            System.out.println("❌ La clave no existe.");
        }

        // Verificamos valor
        System.out.println("Introduce un valor a buscar ( ej. admin): ");
        String valor = sc.nextLine();

        if ( mapa.containsValue(valor)){
            System.out.println("✅ El valor existe: " + valor);
        } else {
            System.out.println("❌ El valor no existe.");
        }

    }
}
