public class Main_HW_15_1 {
    public static void main(String[] args) {
        double flask1 = 25;
        double flask2 = 80.5;

        boolean correctWorkFlask1 = flask1 >= 20 && flask1 <= 40;
        boolean correctWorkFlask2 = flask2 > 75;
        boolean correctWork = correctWorkFlask1 && correctWorkFlask2;

        // v2
//        boolean f1In  = flask1 >= 20 && flask1 <= 40;
//        boolean f2In  = flask2 >= 20 && flask2 <= 40;
//        boolean f1Hot = flask1 > 75;
//        boolean f2Hot = flask2 > 75;
//
//        boolean correctWork = (f1In && f2Hot) || (f2In && f1Hot);


        if (correctWork) {
            System.out.println("Прибор работает корректно");
        } else {
            System.out.println("Прибор работает некорректно");
        }
    }
}

/*
        1.Даны температуры в двух колбах: `flask1` и `flask2`.
Прибор работает корректно, если **в одной** колбе температура
в диапазоне `[20; 40]`, а **в другой** — строго больше `75`.
Определите корректность работы прибора и выведите результат.

 */