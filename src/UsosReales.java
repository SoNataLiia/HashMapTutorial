import java.util.HashMap;
import java.util.Scanner;
import java.util.SimpleTimeZone;
/*
1. Счётчик слов

Используется в анализе текстов, например, чтобы узнать, сколько раз встречается каждое слово.
Метод getOrDefault() — незаменим!
🔹 2. Конфигурация программы

HashMap удобен для хранения ключей настроек (язык, тема и т.д.).
🔹 3. Контакты/агенда

Имена → телефоны. Быстрый поиск по имени.
 */
public class UsosReales {
    public static void ejecutar(){
        System.out.println("\n=== USOS REALES DE HASHMAP ===");

        System.out.println(" 1 Contador de palabras");
        System.out.println(" 2 Tabla de configuración");
        System.out.println(" 3 Agenda de contactos");
        System.out.println(" Selecciona un ejemplo (1-3): ");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        switch (opcion) {
            case 1 -> contadorPalabras();
            case 2 -> tablaConfiguracion();
            case 3 -> agendaContactos();
            default -> System.out.println("Opción no válida.");
        }
    }
    //Ejemplo 1: Contar cuántas veces aparece cada palabra
    private static  void contadorPalabras(){
        System.out.println("\n Contador de palabras: ");

        String texto = "java python java kotlin python java";
        String[] palabras = texto.split(" ");

        HashMap<String, Integer> contador = new HashMap<>();

        for (String palabra : palabras) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);

        }

        System.out.println("Texto analizado: " + texto);
        System.out.println("Frecuencia de palabras: " + contador);


    }
    // Ejemplo 2: Configuraciones del sistema
    private static void tablaConfiguracion() {
        System.out.println("\n Tabla de configuración del sistema:");

        HashMap<String, String> config = new HashMap<>();
        config.put("idioma", "español");
        config.put("tema", "oscuro");
        config.put("resolucion", "1920x1080");

        System.out.println("Configuración actual: ");
        for (String clave : config.keySet()) {
            System.out.println(clave + " = " + config.get(clave));
        }

    }
    // Ejemplo 3: Agenda de contactos
    private static void agendaContactos() {
        System.out.println("\nAgenda de contactos: ");

        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Ana", "123456789");
        agenda.put("Luis", "987654321");
        agenda.put("Marta", "555444333");

        System.out.println("Agenda: ");
        for (String nombre : agenda.keySet()) {
            System.out.println( nombre + " -> " + agenda.get(nombre));
        }
    }
}
