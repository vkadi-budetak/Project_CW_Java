public class Main_CW_17_3 {
    public static void main(String[] args) {
        int number = 1234567;
        System.out.println(number + " -->> " + sumDigitsInNumber(number)); // рассчитать сумму цифр
        number = 0;
        System.out.println(number + " -->> " + countDigitsInNumber(number)); // посчитать количество цифр
        number = 123111;
        System.out.println(number); // счастливый билет
        System.out.println((isTicketLucky(number) ? "Счастливый " : "Несчастливый") + " билетик");

        number = -129436; // вывести цыфры
        System.out.println(number);
        printNumberInCol(number);

        // для n подбрасивания монетки подсчитать число орлов и решек
        int n = 100, orel = 0, reshka = 0; //n - количество подбросов; 1 - orel;   0 - reshka
        for (int i = 1; i <= n; i++) {
            int intRand = (int) (0 + Math.random() * (1 - 0 + 1)); //(int)(min + Math.random(max-min+1))
            if (intRand == 1)
                orel++;
            else
                reshka++;
        }
        System.out.println(n + " : " + orel + " | " + reshka);


    }

    private static void printNumberInCol(int number) {
        if (number < 0) {
            System.out.println("-");
            number = -number;
        }
        if (number <= 9) {
            System.out.println(number);
            return;
        } // 12 / 10 = 1    12345 / 10000 = 1
        int div = (int) Math.pow(10, countDigitsInNumber(number) - 1);
        while (div > 0) {
            System.out.println(number / div);
            number %= div;
            div /= 10;
        }

    }

    private static boolean isTicketLucky(int number) {
        int first = number / 1000; // при / 1000 мы откажимся от 3 последних цыфр
        int last = number % 1000; // 123456 / 1000 = 123;    123456 % 1000 = 456;
        return sumDigitsInNumber(first) == sumDigitsInNumber(last);

    }

    private static int countDigitsInNumber(int number) {
        int counter = 0;
        do {
            counter++;
            number /= 10;
        } while (number != 0);
        return counter;
    }

    // рассчитать сумму цыфр
    private static int sumDigitsInNumber(int number) {
        int res = 0;
        number = Math.abs(number); // abs - считает числа как с + так и с -
        while (number > 0) {
            res += number % 10;
            number /= 10;
        }
        return res;
    }
}


