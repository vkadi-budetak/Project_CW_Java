import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        List<String> list = List.of(
                "key1:8",
                "key2:Vasya",
                "key3:28",
                "key4:33",
                "key4:asd"
        );
        Map<String, String> map = listToMap(list);
        System.out.println(map);

        Map<String, List<String>> map2 = mapToMap(map);
        System.out.println(map2);

        Map<String, List<String>> map3 = listToMap2(list);
        System.out.println(map3);

        Map<String, List<String>> map4 = listToMap3(list);
        System.out.println(map4);
    }

    private static Map<String, List<String>> listToMap3(List<String> list) {
        Map<String, List<String>> result = new HashMap<>();
        for (String str : list) {
            String[] keyAndValueArray = str.replaceAll(" ", "").split(":");
            String key = keyAndValueArray[0];
            String newValue = keyAndValueArray[1];

            List<String> valueList = result.getOrDefault(key,
                    new ArrayList<>());
            valueList.add(newValue);
            result.put(key, valueList);
        }
        return result;
    }

    private static Map<String, List<String>> listToMap2(List<String> list) {
        Map<String, List<String>> result = new HashMap<>();
        for (String str : list) {
            String[] keyAndValueArray = str.trim().split(":"); // разбиваем на два елемента и записываем в массив
            String key = keyAndValueArray[0];
            String newValue = keyAndValueArray[1];

            List<String> valueList = new ArrayList<>();
            List<String> oldValueList = result.putIfAbsent(key, valueList);
            if (oldValueList == null) {
                valueList.add(newValue);
            } else {
                oldValueList.add(newValue);
            }
        }
        return result;
    }

    private static Map<String, List<String>> mapToMap(
            Map<String, String> map) {
        Map<String, List<String>> result = new HashMap<>();
        for (var entry : map.entrySet()) {
            List<String> value = Arrays.asList(entry.getValue().split(","));
            result.put(entry.getKey(), value);
        }
        return result;
    }


    private static Map<String, String> listToMap(List<String> list) {
        Map<String, String> result = new HashMap<>();
        for (String str : list) {
            String[] keyAndValueArray = str.trim().split(":"); // разбиваем на два елемента и записываем в массив
            System.out.println(">>>>>>>>" + Arrays.toString(keyAndValueArray));
            String key = keyAndValueArray[0];
            String newValue = keyAndValueArray[1];
            String value = result.get(key);
            result.put(key, value == null ? newValue : value + "," + newValue);
        }
        return result;
    }
}

/*
Дан список параметр:значение
Получить мэп где параметр это ключ его значение - значение
Если в списке дважды встретился оди и тот же параметр,
то значения должны быть через запятую.

2. Тоже что и 1, но результат Мэп, где ключ - параметр а значения - список для этого ключа
 */
