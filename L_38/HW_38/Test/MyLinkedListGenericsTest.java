import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListGenericsTest {
    MyLinkedListGenerics<Integer> numbers;
    MyLinkedListGenerics<String> strings;

    Integer[] arNumbers = {10, 7, 11, -2, 13, 10};
    String[] arStrings = {"abc", "lmn", "fg", "abc"};


    @BeforeEach
    void setUp() { // Начинаем с одного и того стану
        numbers = new MyLinkedListGenerics<>();
        strings = new MyLinkedListGenerics<>();

        for (Integer n : arNumbers) numbers.add(n);
        for (String s : arStrings) strings.add(s);
    }


    @Test
    void add() {
        MyLinkedListGenerics<Integer> list = new MyLinkedListGenerics<>();

        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));

    }

    @Test
    void size() {
        assertEquals(arNumbers.length, numbers.size());

        MyLinkedListGenerics<String> empty = new MyLinkedListGenerics<>();
        assertEquals(0, empty.size());
        empty.add("x");
        assertEquals(1, empty.size());
        empty.remove(0);
        assertEquals(0, empty.size());
    }

    @Test
    void get() {
        assertEquals(arNumbers[0], numbers.get(0));
        assertEquals(arNumbers[arNumbers.length - 1], numbers.get(numbers.size() - 1));
        assertEquals(arNumbers[2], numbers.get(2));
    }

    @Test
    void print() {
        // Arrange: підготуємо очікуваний вивід
        StringBuilder expected = new StringBuilder();
        for (String s : arStrings) {
            expected.append(s).append(System.lineSeparator());
        }

        // Перехоплення System.out
        java.io.PrintStream originalOut = System.out;
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(baos));

        try {
            // Act
            strings.print();

            // Assert
            String actual = baos.toString();
            assertEquals(expected.toString(), actual);
        } finally {
            // Повертаємо stdout
            System.setOut(originalOut);
        }
    }

    @Test
    void remove() {
        // 1) Видалення голови
        Integer removedHead = numbers.remove(0);
        assertEquals(arNumbers[0], removedHead);
        assertEquals(arNumbers.length - 1, numbers.size());
        assertEquals(arNumbers[1], numbers.get(0)); // нова голова

        // 2) Видалення середнього елемента (після попереднього видалення індекси змінились)
        int mid = numbers.size() / 2;
        Integer expectedMid = /* обчисли з масиву: це arNumbers[mid+1] з урахуванням попереднього зсуву */
                // простіше: зчитай поточні значення в тимчасовий масив/ліст і перевір далі
                numbers.get(mid);
        Integer removedMid = numbers.remove(mid);
        assertEquals(expectedMid, removedMid);
        assertEquals(arNumbers.length - 2, numbers.size());

        // 3) Видалення хвоста (останнього)
        Integer lastBefore = numbers.get(numbers.size() - 1);
        Integer removedTail = numbers.remove(numbers.size() - 1);
        assertEquals(lastBefore, removedTail);
        assertEquals(arNumbers.length - 3, numbers.size());
    }
}