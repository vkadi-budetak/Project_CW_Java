import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

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

        assertTrue(strings.add("aaa", strings.size()));
        assertTrue(strings.add("aaa", -1));
        assertFalse(strings.add(null, -1));

    }

    @Test
    void getAtIndex() {
        assertEquals(10, numbers.get(0));
        assertNull(numbers.get(-555));

        assertEquals("abc", strings.get(4));
        assertNull(strings.get(-555));

    }

    @Test
    void size() {
        assertEquals(6, numbers.size());
        assertEquals(4, strings.size());
    }

    @Test
    void indexOf() {
        assertEquals(0, numbers.indexOf(10));
        assertEquals(-1, numbers.indexOf(-1111));


        assertEquals(0, strings.indexOf("abc"));
        assertEquals(-1, strings.indexOf("abcccc"));
    }

    @Test
    void lastIndexOf() {
        assertEquals(5, numbers.indexOf(10));
        assertEquals(-1, numbers.indexOf(10000));
        assertEquals(1, numbers.indexOf(7));

        assertEquals(3, strings.indexOf("abc"));
        assertEquals(1, strings.indexOf("lmn"));
        assertEquals(-1, strings.indexOf("abcccc"));
        assertEquals(-1, strings.indexOf(null));
    }

    @Test
    void removeAtIndex() {
        assertEquals(7, numbers.remove(1));
        assertEquals("abc", strings.remove(0));
        assertNull(numbers.remove(-555));
        assertNull(strings.remove(-5555));
        assertEquals(5, numbers.size());
        assertEquals(3, numbers.size());

    }

    @Test
    void removeByObject() {
        assertEquals(true, numbers.remove((Integer)7));
        assertTrue(numbers.remove((Integer)10));
        assertFalse(numbers.remove((Integer)7));

        assertTrue(strings.remove("lmn"));
        assertFalse(strings.remove("lmn"));

        assertEquals(4, numbers.size());
        assertEquals(3, numbers.size());
    }

    @Test
    void contains() {
        assertTrue(numbers.contains(10));
        assertTrue(strings.contains("abc"));

        assertFalse(numbers.contains(10000));
        assertFalse(strings.contains("aaaaaaaa"));
        assertFalse(strings.contains(null));

    }

    @Test
    void toArray() {
        Object[] expNumbers = {10, 7, 11, -2, 13, 10};
        Object[] expString = {"abc", "lmn", "fg", "abc"};

        assertArrayEquals(expNumbers, numbers.toArray());
        assertArrayEquals(expString, strings.toArray());
    }
}