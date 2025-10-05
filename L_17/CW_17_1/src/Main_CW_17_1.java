import java.sql.SQLOutput;

public class Main_CW_17_1 {
    public static void main(String[] args) {

        int stars = 5;
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
        System.out.println();

        stars = 5;
        int count = 1;
        while (count <= stars) {
            System.out.print("*");
            count++;
        }
        System.out.println();

        System.out.println("------------");
        // распечатять цифры целого положительного числа в столбик в обратном порядке
        int number = 12345;
        do {
            System.out.println(number % 10);
            number /= 10;
        } while (number != 0);

        System.out.println("------------");
        // посчитать сумму положительных чисел до указанного включительно
        number = 15;
        int summa = 0;
        for (int i = 0; i <= number; i++) {
            summa += i;
        }
        System.out.println(number + " -->> " + summa);

        System.out.println("------------");
        // расспечатать обратный отсчет до старта
        int time = 10;
        System.out.println("Время до старта " + time + " секунд");
        for ( ; time>0; time--){
            System.out.println(time);
        }
        System.out.println("START");


    }
}

