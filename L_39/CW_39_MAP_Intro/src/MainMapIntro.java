import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;

public class MainMapIntro {
    public static void main(String[] args) {
//    Map<String, Integer> map1 = new HashMap<>(); // HashMap<>() - выводит на печать как удобно компьютеру
//    Map<String, Integer> map2 = new LinkedHashMap<>(); // LinkedHashMap<>() - выводит на печать елементы как мы их занесли
        Map<String, Integer> map = new TreeMap<>(); // TreeMap<>() - выводит на печать елементы по алфавиту
        fillMap(map); // создаю метод
        System.out.println(map);

        /**
         * Методы Put
         */
        System.out.println(map.put("Jan", 100)); // CRUD - create, read, update, and delete
        System.out.println(map);
        System.out.println(map.put("May", 5));
        System.out.println(map);

        System.out.println(map.putIfAbsent("Jun", 6)); // еще один метод добавляния - ДОБАВИТ ЕСЛИ НЕТ ЕЛЕМЕНТА В КОЛЕКЦИИ, возвращает null
        System.out.println(map);
        System.out.println(map.putIfAbsent("Jun", 600)); // если елемент был? то возырат старого значения и не изменяет его
        System.out.println(map);

        map.putAll(map); // Добавляем все элементы в коллекцию
        System.out.println(map);

        /**
         * Методы replace (заменить)
         */
        System.out.println(map.replace("Jan", 111));
        System.out.println(map);
        System.out.println(map.replace("Sep", 25)); // работет если такой элемент был
        System.out.println(map);

        /**
         * Методы contains (есть ли запись или нет)
         */
        System.out.println(map.containsKey("Jan")); // ли есть определенный ключ
        System.out.println(map.containsKey("Sep")); // ли есть определенный ключ

        System.out.println(map.containsValue(111)); // поиск по значению
        System.out.println(map.containsValue(9));

        /**
         * Методы get (по ключу получить значения )
         */
        System.out.println(map.get("Jan"));
        System.out.println(map.get("Sep"));

        System.out.println(map.getOrDefault("Jan", 0)); // когда есть элемент возвращает значения 111
        System.out.println(map.getOrDefault("Sep", 0)); // когда нету элемента возвращает 0

        /**
         * Методы remove (удаление)
         */
        System.out.println(map.remove("Jan")); // удаляет и возвращает старое значения
        System.out.println(map);

        System.out.println(map.remove("Sep")); // если нет значения, возвращвет null
        System.out.println(map);

        System.out.println(map.remove("Feb", 2)); // удаляется целая пара
        System.out.println(map);

        System.out.println(map.remove("ЬMar", 333)); // если значения неверное будет возврат falce
        System.out.println(map);

        /**
         * Методы clear (очистка)
         */
        map.clear(); // чистим map от всех элементов
        System.out.println(map.isEmpty());
        System.out.println(map);

        /**
         * Методы fillMap (записываем)
         */
        fillMap(map);
        System.out.println(map);

        /**
         * Перебираем MAP
         */
        // создаю метод
        iterationKeys(map); // перебор по ключам
        iterationValies(map); // перебор по значению
        iterationEntries(map); // пары "Ключ - значения" -> Map.Entry


        // ЗАДАЧА - фильтрую элементы те которые четные
        map.values().removeIf(new Predicate<Integer>() {
            @Override                            // new Predicate<Integer>() анонимный клас (new Predicate)
            public boolean test(Integer t) {
                return t % 2 == 0;
            }
        });
        System.out.println(map);

        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 10 + 1); // получаю случайное число
            // Var 1 - перебора и так не пишут, много кода!!!
//            if (!res.containsKey(num)) // если этот ключ выпал первый раз
//                res.put(num, 1); // заносим первую запись для этого ключа со значением 1
//            else { // если такой ключ уже есть, то нам надо
//                int value = res.get(num); // достаем старое значение по этому ключу
//                value ++; // увеличываем значение на 1 так как выпал этот ключ еще раз
//                res.put(num, value); // res.replace(num, value);  // запоминаем новый результат
//            }
            // Var 2
//            Integer value = res.get(num); // сколько раз число выпадало ранее
//            res.put(num, value==null ? 1 : value+1); // если такого ключа в Map нет,
            // то есть такое число выпало первый раз, то я записываю значения 1.
            // иначе беру старое значения и увеличываю на 1
            // после чего заношу новую пару в Map.

            // Var 3
            Integer value = res.getOrDefault(num, 0); // возвращает значения по ключу
            // если такое значения есть или вернет 0 если значения нет
            res.put(num, value+1); // res.replace(num, value); // увиличываем на 1 то что было ранее

        }
        System.out.println(res);

    }

    // метод перебор пары "Ключ - значения" -> Map.Entry
    private static void iterationEntries(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Map.Entry<String, Integer> temp = entry;
            System.out.println(temp);
            System.out.println(entry.getKey() + "-->" + entry.getValue());
//            System.out.println(temp.getKey() + "--->" + temp.getValue()); // или так
        }
    }

    // метод перебор по значению
    private static void iterationValies(Map<String, Integer> map) {
        for (Integer value : map.values())
            System.out.println(value);

    }

    // метод перебор по ключам
    private static void iterationKeys(Map<String, Integer> map) {
        for (String key : map.keySet())
            System.out.println(key);
    }

    private static void fillMap(Map<String, Integer> map) {
        map.put("Jan", 1); // добавлять в конец
        map.put("Feb", 2);
        map.put("Mart", 3);
        map.put("Apr", 4);
    }
}