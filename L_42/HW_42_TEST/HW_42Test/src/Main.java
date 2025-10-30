import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------Home work----------------");

        String text =  "lmn vf ab a lmn ab lmn";

        displayWordCounts(text);

    }

    private static void displayWordCounts(String text) {
        String[] words = text.split(" ");
        Map<String, Integer> wordMap = new HashMap<>();

        for (int i=0; i<words.length; i++) {
            boolean res = wordMap.containsKey(words[i]);
            if (!res) wordMap.put(words[i],1);
            else {
                int value = wordMap.get(words[i]);
                value++;
                wordMap.replace(words[i],value);
            }
        }

        wordMap.keySet().stream()
                .sorted((w1, w2) -> {
                    int countCompare = Integer.compare(wordMap.get(w2), wordMap.get(w1));
                    return countCompare != 0 ? countCompare : w1.compareTo(w2);
                })
                .forEach(word -> System.out.println(word + " -> " + wordMap.get(word)));
    }
}
/*


static void displayWordCounts(String text) - выведет на консоль,
сколько раз встречается то или иное слово в строке, отсортированное по количеству вхождений,
а если в нескольких строках встречается одно и то же значение, то по алфавиту,
используя функциональные стримы!!!!!!

String text = "lmn vf ab a lmn ab lmn" - на входе.
На выходе
lmn -> 3
ab -> 2
a -> 1
vf -> 1

*/