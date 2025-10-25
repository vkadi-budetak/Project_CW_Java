import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Anagram {
    public static boolean isAnagram(String word, String anagram) {
        if (word == null || anagram == null) return false;

        // приводим к одному регистру word и убираем пробелы
        String normWord = normalizeLetters(word);
        // приводим к одному регистру anagram и убираем пробелы
        String normAnagram = normalizeLetters(anagram);

        if (normWord.length() < 2) return false;
        if (normAnagram.length() < 2) return false;
        if (normWord.isEmpty() || normAnagram.isEmpty()) return false;
        if (normWord.length() < normAnagram.length()) return false;

        Map<Character, Integer> freq = countLetters(normWord);

        for (int i = 0; i < normAnagram.length(); i++) {
            char ch = normAnagram.charAt(i);
            if (!Character.isLetter(ch)) continue;

            Integer left = freq.get(ch);
            if (left == null || left == 0) {
                return false;
            }
            freq.put(ch, left - 1);
        }
        return true;
    }

    // считаю сколько раз букв повторяются
    private static Map<Character, Integer> countLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!Character.isLetter(ch)) continue;

            int current = map.getOrDefault(ch, 0);
            map.put(ch, current + 1);
        }
        return map;
    }


    private static String normalizeLetters(String s) {
        if (s == null) return "";
        String wordUpdate = s.trim().toLowerCase(Locale.ROOT);
        // Locale.ROOT - сравневаем на любой язык
        String noSpaces = wordUpdate.replaceAll("\\s+", "");
        // оставляем только буквы
        noSpaces = noSpaces.replaceAll("[^\\p{L}]", "");
        return noSpaces;
    }
}

// Anagram - из длинного слова составить короткие слова
/* HW_39_TEXT
1. Реализуйте мeтод проверки того что короткое слово является анограммой  по отношению к длинному-заданному.
Слова могут быть любыми. Язык может быть англ-русс-нем. Тесты определяющие критерии анаграмноcти слова
написанной в класной работе должны проходить.
При решение задачи следует использовать Map.
 */
