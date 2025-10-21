import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyMethodsTest {

    @Test
    void parseAndSum() {
        // ПОЗИТИВНЫЕ СЦЕНАРИИ
        System.out.println("Positisve parseAndSum");
        int res = AnyMethods.parseAndSum("23", "31");
        assertTrue(54 == res);
        res = AnyMethods.parseAndSum("+23", "+31");
        assertTrue(54 == res);
        res = AnyMethods.parseAndSum("-23", "31");
        assertTrue(8 == res);
        res = AnyMethods.parseAndSum("-23", "-31");
        assertTrue(-54 == res);
        res = AnyMethods.parseAndSum("0", "0");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("-23", "+23");
        assertTrue(0 == res);


        // НЕГАТИВНЫЕ СЦЕНАРИИ
        System.out.println("Negative parseAndSum");
        // Первая - часть проверок на негативный сценарий
        res = AnyMethods.parseAndSum(" 23 ", " 31 ");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum(null, " 31 ");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("23", null);
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum(null, null);
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("", "25");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("25", "");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("", "");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum(" ", "25");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("25", " ");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum(" ", " ");
        assertTrue(0 == res);


        // Вторая - часть проверок на негативный сценарий
        res = AnyMethods.parseAndSum("25a1", "34");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("25 1", "34");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("25.1", "34");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("--25", "34");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("++25", "34");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("-+25", "34");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("+-25", "34");
        assertTrue(0 == res);

        res = AnyMethods.parseAndSum("34", "25a1");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("34", "25 1");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("34", "25.1");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("34", "--25");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("34", "++25");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("34", "-+25");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("34", "+-25");
        assertTrue(0 == res);

        res = AnyMethods.parseAndSum("2500000000", "35"); // *
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("9999999999999", "35");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("35", "2500000000");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("35", "9999999999999");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("35", "9".repeat(50));
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("9".repeat(50), "35");
        assertTrue(0 == res);

        res = AnyMethods.parseAndSum("+", "25");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("-", "25");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("25", "+");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("25", "-");
        assertTrue(0 == res);

        res = AnyMethods.parseAndSum("q", "25");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("$", "25");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("25", "q");
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum("25", "$");
        assertTrue(0 == res);

        // НЕГАТИВНЫЕ СЦЕНАРИИ ПРИ ПЕРЕПОЛНЕНИИ во время сложения
        // Третья - часть проверок на негативный сценарий
        String s1 = "2000000000";
        String s2 = "1000000000";
        res = AnyMethods.parseAndSum(s1, s2);
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum(s2, s1);
        assertTrue(0 == res);
        s1 = "2147483647"; // Возможно это излишний тест см *
        s2 = "1";
        res = AnyMethods.parseAndSum(s1, s2);
        assertTrue(0 == res);
        s1 = "-2147483648"; // Возможно это излишний тест см *
        s2 = "-1";
        res = AnyMethods.parseAndSum(s1, s2);
        assertTrue(0 == res);
        res = AnyMethods.parseAndSum(s2, s1);
        assertTrue(0 == res);
        s1 = "-2000000000";
        s2 = "-1000000000";
        res = AnyMethods.parseAndSum(s1, s2);
        assertTrue(0 == res);
    }

    @Test
    void parseAndSumElementInArray() {
        int[] arr={10,-5, 0, Integer.MAX_VALUE,Integer.MIN_VALUE};
        int[] ar1={};

        // positive
        assertEquals(15, AnyMethods.parseAndSumElementInArray("5",arr,0)); // 15 == 5+10
        assertEquals(5, AnyMethods.parseAndSumElementInArray("-5",arr,0));
        assertEquals(15, AnyMethods.parseAndSumElementInArray("+5",arr,0));
        assertEquals(0, AnyMethods.parseAndSumElementInArray("0",arr,2));
        assertEquals(0, AnyMethods.parseAndSumElementInArray("5",arr,1));

        //negative

    }
}

/*
HW_36_TEXT
Написать в классной работе негативные тесты для второго метода по аналогии с классной
работой и поправить текст метода, чтобы он правильно обрабатывал эти тесты

null, arr, 0
"3", ar1, 0
"3", arr, -10
"qwert", arr, 0
..........

 */