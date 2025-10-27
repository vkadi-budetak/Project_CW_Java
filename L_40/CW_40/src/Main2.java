import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        String s = "dcddaaacbdd";
            // d -> 4; c -> 2; b-> 1; a->3 (сколько раз встречается буква) ТАКОЙ ВЫВОД!
        printCharsReversOrderAndCount(s);

        System.out.println("========================================");
        String s1 = "hello, money, hello, happy, hello, money, happy, bye, bye";
        // Хочу чтобы слова шли с конца и знать количество повторений слов  <<<<<<<<<<<<<<<<<<<<<<< ------------
        printWordsReversOrderAndCount(s1);

    }

    private static void printWordsReversOrderAndCount(String s) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        String[] ar = s.split(","); // разбиваем split на ','
        System.out.println("ar" + Arrays.toString(ar));
        for (int i = ar.length-1; i>=0; i--){
            boolean res = map.containsKey(ar[i].trim());
            if (res == false) map.put(ar[i].trim(),1);
            else {
                int value = map.get(ar[i].trim());
                value ++;
                map.replace(ar[i].trim(), value);
            }
        }
        Set<String> keys = map.keySet(); // выводим на печать
        for (String key: keys) System.out.println(key + "->" + map.get(key));
    }

    private static void printCharsReversOrderAndCount(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>(new Comparator<Character>() { // создаем Компоратор(анонимным класом)
            // и будем сравнивать и выводить в обратном порядке
            @Override
            public int compare(Character o1, Character o2) {
                return Character.compare(o2,o1);
            }
        });

        for( int i = 0; i<s.length(); i++){
            char sym = s.charAt(i);
            boolean res = map.containsKey(sym);
            if (res == false) map.put(sym, 1);
            else {
                int value = map.get(sym);
                value ++;
                map.replace(sym, value);
            }
        }
        Set<Character>dset = map.keySet(); // выводим на печать
        for (char ch : dset)
            System.out.println(ch + "->" + map.get(ch));
    }
}
