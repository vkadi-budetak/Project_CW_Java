import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
// TestLast -> interface -> realization -> test
// TestFirst -> interface -> test -> realization
// TDD(test driven design) -> test -> interface -> realization


class CalculatorTest {

//    @Disabled
    @Test
    public void testEquals(){
        assertEquals(4,2+2);
        assertEquals("Hello world", "Hello "+"world");
        assertNotEquals(5,2+2);
        System.out.println("1. Test finish");

    }

    @Test
    public void testBoolean(){
        assertTrue(2+2==4);
        assertFalse(2+2==5);
        System.out.println("2. Test finish");
    }

    @Test
    void testNull(){
        assertNull(null);
        assertNotNull(" ");
        System.out.println("3. Test finish");
    }

    @Test
    void testSame(){
        String str=new String("Hello");
        String str1=new String("Hello");
        String str2=str;

        assertSame(str,str2);
        assertNotSame(str,str1);
        System.out.println("4. Test finish");
    }

    @Test
    void testArrays(){
        int[] array={1,2,3};
        int[] array1={1,2,3};
        int[] array2={1,2,3,4};

        assertArrayEquals(array,array1);
        System.out.println("5. Test finish");
    }

    @Test
    void testPrint(){
        System.out.println("Print test result....");
        System.out.println("4. Test finish");
    }

    @BeforeEach
    void setUp(){
        System.out.println(">>>>BeforeEach");
    }

    @AfterEach
    void tearDown(){
        System.out.println(">>>>AfterEach");
    }

    @BeforeAll
    static void setBeforeClass(){
        System.out.println("--------BeforeAll");
    }

    @AfterAll
    static void setUpAfterAll(){
        System.out.println("---------AfterAll");
    }

    @Disabled
    @Test
    void add() {
        System.out.println("===== positive tests add ==========");
        assertEquals(4,Calculator.add(2,2));
        assertEquals(-3,Calculator.add(2,-5));
        assertEquals(0,Calculator.add(0,0));

        System.out.println("===== negative tests add ==========");
        int i1=2_000_000_000;
        int i2=1_000_000_000;
        assertEquals(0,Calculator.add(i1,i2));

        i1=-2_000_000_000;
        i2=-1_000_000_000;
        assertEquals(0,Calculator.add(i1,i2));

    }

    @Test
    void sub() {
    }

    @Test
    void mul() {
        int i1=2_000_000_000;
        int i2=1_000_000_000;
        assertEquals(0,Calculator.mul(i1,i2));

        i1=-2_000_000;
        i2=1_000_000;
        assertEquals(0,Calculator.mul(i1,i2));
    }

//    @Disabled
    @Test
    void div() {
        System.out.println("===== positive tests div ==========");
        assertEquals(1,Calculator.div(2,2));
        assertEquals(-2,Calculator.div(10,-5));
        assertEquals(3,Calculator.div(7,2));
        assertEquals(-3,Calculator.div(7,-2));

        int i1=2_000_000_000;  //byte  -128  127  -128/-1 - overflow
        int i2=1;
        assertEquals(1_000_000_000, Calculator.div(i1,i2));

        System.out.println("===== negative tests div ==========");
        assertEquals(0,Calculator.div(4,0));
        i1=Integer.MIN_VALUE;
        i2=-1;
        assertEquals(0,Calculator.div(i1,i2));


    }
}

/*
HW_35_TEXT
1. Доработать тесты для всех методов калькулятора.
2. Поправить сам калькулятор в соответствии с требованиями ТЗ,
так что бы все тесты проходили.

 */