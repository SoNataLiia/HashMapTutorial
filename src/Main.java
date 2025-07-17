import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;

    do {
        System.out.println("\n=== Menú de Aprendizaje: HashMap en Java ===");
        System.out.println(" 1. Crear un HashMap.");
        System.out.println(" 2. Insertar elementos.");
        System.out.println(" 3. Obtener un valor por clave.");
        System.out.println(" 4. Reemplazar un valor por clave.");
        System.out.println(" 5. Eliminar in elementa.");
        System.out.println(" 6. Recorrer un HashMap.");
        System.out.println(" 7. Verificar clave o valor.");
        System.out.println(" 8. Métodos avanzados.");
        System.out.println(" 9. Cúando usar HashMap.");
        System.out.println(" 0. Salir.");
        System.out.print("Elige un opcíon: ");
        opcion = sc.nextInt();

        switch(opcion) {
            case 1 -> CrearHashMap.ejecutar();
            case 2 -> InsertarElementos.ejecutar();
            case 3 -> ObtenerElemento.ejecutar();
            case 4 -> ReemplazarElementos.ejecutar();
            case 5 -> EliminarElementos.ejecutar();
            case 6 -> RecorrerHashMap.ejecutar();
            case 7 -> VerificarClaveValor.ejecutar();
            case 8 -> MetodosAvanzados.ejecutar();
            case 9 -> UsosReales.ejecutar();
            case 0 -> System.out.println("Fin del tutorial. ¡Buena suerte!");
            default -> System.out.println("Opcíon no válida.");

        }
    } while (opcion != 0);
    sc.close();
    }
}