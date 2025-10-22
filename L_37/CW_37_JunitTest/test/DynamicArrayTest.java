import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {
    DynamicArray numbers;
    DynamicArray strings;

    Integer[] arNumbers = {10, 7, 11, -2, 13, 10};
    String[] arStrings = {"abc", "lmn", "fg", "abc"};

    @BeforeEach
    public void setUp(){

        // создаю, заливаю и перебераю елементы
        numbers = new DynamicArray(1); // len=16
        for (int i=0; i< arNumbers.length; i++) //var 1
            numbers.add(arNumbers[i]);

        strings = new DynamicArray(1); // len=16
        for (String str:arStrings) //var 2
            strings.add(str);
    }

    @Test
    void testSetUp() {
        assertEquals(arNumbers.length, numbers.size());
        assertEquals(arStrings.length, strings.size());

        for (int i=0; i<arNumbers.length; i++)
            assertEquals(arNumbers[i], numbers.get(i));

        for(int i=0; i<arStrings.length; i++)
            assertEquals(arStrings[i],strings.get(i));

        assertFalse(numbers.add(null));
        assertFalse(strings.add(null));

    }

    @Test
    void testAddAtIndex() {
        Integer[] exp={10, 7, 11,   5   ,  -2, 13, 10};
        assertTrue(numbers.add(5,3));
        int sizeNumbers=numbers.size();

        for (int i=0; i<sizeNumbers;i++)
            assertEquals(exp[i], numbers.get(i));

        assertFalse(numbers.add(numbers.size()+1,100));
        assertFalse(numbers.add(null,1));

        // продублируйте тоже для строк
        // допишите все тесты

    }

    @Test
    void get() {
    }

    @Test
    void size() {
    }

    @Test
    void indexOf() {
    }

    @Test
    void lastIndexOf() {
    }

    @Test
    void remove() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void contains() {
    }

    @Test
    void toArray() {
    }
}