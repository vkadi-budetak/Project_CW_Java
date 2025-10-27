import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    String word = "electricity";


    @Test
    void isAnagram() {
        assertTrue(Anagram.isAnagram(word, "city"));
        assertTrue(Anagram.isAnagram(word, "tet"));
        assertTrue(Anagram.isAnagram(word, "try"));
        assertTrue(Anagram.isAnagram(word, "let"));

        assertFalse(Anagram.isAnagram(word, "electricityqqq"));
        assertFalse(Anagram.isAnagram(word, "tetttt"));
        assertFalse(Anagram.isAnagram(word, "tetatet"));
        assertFalse(Anagram.isAnagram(word, ""));
        assertFalse(Anagram.isAnagram(word, "     "));
        assertFalse(Anagram.isAnagram(word, null));
        assertFalse(Anagram.isAnagram(word, "a"));
        assertFalse(Anagram.isAnagram(word, "e")); // слово из одной буквы не Anagram


    }
}


/* HW_39_TEXT
1. Реализуйте мeтод проверки того что короткое слово является анограммой  по отношению к длинному-заданному.
Слова могут быть любыми. Язык может быть англ-русс-нем. Тесты определяющие критерии анаграмноcти слова
написанной в класной работе должны проходить.
При решение задачи следует использовать Map.
 */
