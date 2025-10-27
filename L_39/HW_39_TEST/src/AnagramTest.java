import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    String word = "electricity";

    @Test
    void isAnagram() {
        assertTrue(Anagram.isAnagram(word,"city"));
        assertTrue(Anagram.isAnagram(word,"tet"));
        assertTrue(Anagram.isAnagram(word,"try"));
        assertTrue(Anagram.isAnagram(word,"let"));

        assertFalse(Anagram.isAnagram(word,"electricityqqqqq"));
        assertFalse(Anagram.isAnagram(word,"tetttt"));
        assertFalse(Anagram.isAnagram(word,"tetatet"));
        assertFalse(Anagram.isAnagram(word,""));
        assertFalse(Anagram.isAnagram(word,"    "));
        assertFalse(Anagram.isAnagram(word,null));
        assertFalse(Anagram.isAnagram(word,"a"));
        assertFalse(Anagram.isAnagram(word,"e"));// слово из 1 буквы не анаграмма

    }
}

/*
HW_39_TEXT
1. Реализуйте метод проверки того что короткое слово
является анаграммой по отношению к длинному-заданному.
Слова могут быть любыми. Язык может быть англ-нем-русск.
Тесты, определяющие критерии анаграмности слова написанные
в классной работе должны проходить.
При решении задачи следует использовать мэп...

 */
