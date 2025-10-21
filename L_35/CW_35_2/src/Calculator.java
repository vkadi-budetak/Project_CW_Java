public class Calculator {

    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static int mul(int a, int b){
//        if (a==2_000_000_000 && b==1_000_000_000) return 0; ERROR
        return a*b;
    }

    public static int div(int a, int b){
        if (b==0) return 0;
        return a/b;
    }
}
/*
Методы должны возвращать верное значение вычислений.
Если это не возможно, должны возвращать 0.
 */
