import java.util.*;

public class MainMap1 {
    public static void main(String[] args) {
        String text="lmn va a ab a a lmn lmn ab";
        displayWordsCount(text); // создаю метод
    }

    private static void displayWordsCount(String text) {
        // превращаю массив строк в массив слов
        String[] words = getWords(text); // превратить строку в массив слов
        HashMap<String, Integer> map = getMapOccurrences(words); // из массива сформируй Map статистики
        // по каждому слову (String - слово, Integer - к-ство вхождений)
        List<Map.Entry<String, Integer>> list = getListEntries(map); // по Map сформируй лист
        // пар на слово-число повторов для дальнейшей хитрой сортировки(Переобразовую в лист чтобы потом перебирать)
        sortEntries(list); // отсортируй лист согласно требованиям
        displayList(list); // выводим на печать
    }

    private static void displayList(List<Map.Entry<String, Integer>> list) {
        for(Map.Entry<String, Integer> e : list) {
            System.out.printf("%s -> %d\n", e.getKey(), e.getValue());
        }
    }

    private static void sortEntries(List<Map.Entry<String, Integer>> list) {
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int res = Integer.compare(o2.getValue(), o1.getValue());
                return res == 0 ? o1.getKey().compareTo(o2.getKey()) : res;
            }
        });
    }

    private static List<Map.Entry<String, Integer>> getListEntries(HashMap<String, Integer> map) {
        return new ArrayList<>(map.entrySet());
    }

    private static HashMap<String, Integer> getMapOccurrences(String[] words) {
        HashMap<String, Integer> res = new HashMap<>();
        for (String str: words) {
            int count = res.getOrDefault(str, 0);
            res.put(str, count +1);
        }
        return res;
    }



    private static String[] getWords(String text) {
        return text.trim().split(" ");
//        return text.trim().split("[^A-Za-z]+"); // adv**************
    }
}
/* ЗАДАЧА
String text="lmn va a ab a a lmn lmn ab"
output
сортировать по вхождению от большего к меньшему,
если вхождения одинаковые то по порядку ключей в лексикографическом порядке.

a -> 3
lmn -> 3
ab -> 2
va -> 1
 */
