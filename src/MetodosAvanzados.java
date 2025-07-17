import java.util.HashMap;
/*
putIfAbsent — вставляет только если ключа ещё нет.

replace(k, oldV, newV) — заменяет, только если текущее значение совпадает с oldV.

compute(k, (k, v) -> ...) — позволяет изменить значение по ключу через функцию.

merge(k, v, function) — объединяет старое и новое значение (например, суммирует).

clear() — очищает карту.

isEmpty() — возвращает true, если карта пустая.
 */
public class MetodosAvanzados {
    public static void ejecutar(){
        System.out.println("\n=== MÉTODOS AVANZADOS DE HASHMAP ===");

        HashMap<String, Integer> mapa = new HashMap<>();

        // putIfAbsent: solo inserta si la clave no existe
        mapa.put("A", 1);
        mapa.putIfAbsent("A", 100); // No se inserta
        mapa.putIfAbsent("B", 2); // Sí se inserta

        System.out.println("Después de putIfAbsent: " + mapa);

        // replace(clave, antiguoValor, nuevoValor): reemplaza si y solo si el valor actual coincide
        boolean reemplazo = mapa.replace("A", 1, 99);
        System.out.println("¿Se reemplazó 'A'? " + reemplazo);
        System.out.println("Contenido: " + mapa);

        //compute(): actualiza el valor asociado a una clave usando una función
        mapa.compute("B", (k, v) -> v == null ? 1 : v + 10);
        System.out.println("Después de compute en 'B': " +  mapa);

        // compute() : actualiza el valor asociado a una clave usando una función
        mapa.merge("A", 5, Integer::sum); // A ya existe: 999 + 5 = 1004
        mapa.merge("C", 3, Integer::sum); // C no existe :  se crea
        System.out.println("Después de merge: " + mapa);

        //isEmpty() y clear()
        System.out.println("¿Está vacío el mapa?" + mapa.isEmpty());
        mapa.clear();
        System.out.println("Después de clear(): " + mapa);
        System.out.println("¿Ahora está vacío?" + mapa.isEmpty());



    }
}
/*


Después de putIfAbsent: {A=1, B=2}
¿Se reemplazó 'A'? true
Contenido: {A=99, B=2}
Después de compute en 'B': {A=99, B=12}
Después de merge: {A=104, B=12, C=3}
¿Está vacío el mapa? false
Después de clear(): {}
¿Ahora está vacío? true

🧠 Пошаговое объяснение:
🔹 Шаг 1. putIfAbsent

mapa.put("A", 1);               // вставляем ключ "A" со значением 1
mapa.putIfAbsent("A", 100);     // не вставляет 100, потому что ключ "A" уже есть
mapa.putIfAbsent("B", 2);       // вставляет, потому что ключа "B" ещё нет

📌 Результат:

{A=1, B=2}

🔍 Зачем нужно putIfAbsent:
Чтобы не перезаписывать значение, если ключ уже существует. Это полезно, когда хочешь установить значение только один раз, например, при инициализации.
🔹 Шаг 2. replace(clave, antiguoValor, nuevoValor)

boolean reemplazo = mapa.replace("A", 1, 99); // заменит значение "A" на 99 только если текущее — 1

📌 До этого "A" = 1, значит — замена произойдёт ✅
Теперь mapa = {A=99, B=2}

🔍 Зачем нужен этот метод:
Для безопасной замены. Он работает только если ты точно знаешь старое значение — это предотвращает ошибки при многопоточности или проверках.
🔹 Шаг 3. compute()

mapa.compute("B", (k, v) -> v == null ? 1 : v + 10);

📌 Ключ "B" = 2 → 2 + 10 = 12
Теперь mapa = {A=99, B=12}

🔍 Что делает compute:
Позволяет модифицировать значение по ключу, применяя функцию.
(k, v) -> v + 10 — означает "прибавить 10 к текущему значению".
🔹 Шаг 4. merge()

mapa.merge("A", 5, Integer::sum);  // "A" = 99 → 99 + 5 = 104
mapa.merge("C", 3, Integer::sum);  // "C" не существует → вставляется как "C" = 3

📌 Теперь mapa = {A=104, B=12, C=3}

🔍 Что делает merge:
Если ключ есть → объединяет старое и новое значение (например, складывает).
Если ключа нет → просто вставляет новое.

Очень полезно для подсчётов, сумм, объединений.
🔹 Шаг 5. isEmpty() и clear()

System.out.println(mapa.isEmpty()); // false → карта НЕ пустая
mapa.clear();                       // очищает ВСЁ
System.out.println(mapa);           // {}
System.out.println(mapa.isEmpty()); // true → теперь карта пустая

🔍 Эти методы:

    clear() — очищает карту.

    isEmpty() — проверяет, пуста ли карта.

✨ Резюме
Метод	Что делает	Когда использовать
putIfAbsent	Вставляет, только если ключа ещё нет	Инициализация по умолчанию
replace	Заменяет значение, если текущее = ожидаемое	Безопасная замена при проверке старого
compute	Изменяет значение по ключу с помощью формулы	Математическая логика, обработка значений
merge	Объединяет старое и новое значение	Суммирование, соединение строк и др.
clear	Удаляет все элементы	Обнуление карты
isEmpty	Проверяет, пустая ли карта	Для условий, проверок, логики
 */
