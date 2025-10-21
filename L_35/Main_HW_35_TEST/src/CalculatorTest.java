import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        System.out.println("======= add===========");
        assertEquals(4,Calculator.add(2,2));
        assertEquals(-3,Calculator.add(2,-5));
        assertEquals(0,Calculator.add(0,0));

        int i1=2_000_000_000;
        int i2=1_000_000_000;
        assertEquals(0,Calculator.add(i1,i2));

        i1=-2_000_000_000;
        i2=-1_000_000_000;
        assertEquals(0,Calculator.add(i1,i2));
    }

    @Test
    void sub() {
        System.out.println("======= sub===========");
        assertEquals(2,Calculator.sub(4,2));
        assertEquals(7,Calculator.sub(2,-5));
        assertEquals(0,Calculator.sub(0,0));

        int i1=-2_000_000_000;
        int i2=1_000_000_000;
        assertEquals(0,Calculator.sub(i1,i2));

        i1= 2_000_000_000;
        i2=-1_000_000_000;
        assertEquals(0,Calculator.sub(i1,i2));
    }

    @Test
    void mul() {
        System.out.println("======= mul===========");
        assertEquals(8,Calculator.mul(4,2));
        assertEquals(-10,Calculator.mul(2,-5));
        assertEquals(0,Calculator.mul(0,0));

        int i1=2_000_000;
        int i2=1_000_000;
        assertEquals(0,Calculator.mul(i1,i2));

        i1= 2_000_000;
        i2=-1_000_000;
        assertEquals(0,Calculator.mul(i1,i2));
    }

    @Test
    void div() {
        System.out.println("======= div===========");
        assertEquals(2,Calculator.div(4,2));
        assertEquals(-2,Calculator.div(10,-5));
        assertEquals(0,Calculator.div(0,-5));

        assertEquals(0,Calculator.div(5,0));
        int num1=Integer.MIN_VALUE;
        int num2=-1;
        assertEquals(0,Calculator.div(num1,num2));

    }
}