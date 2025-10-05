import java.util.Arrays;

public class Main_CW_16_2 {
    public static void main(String[] args) {
        System.out.println("=====Случайные числа======");
        double randomNumber = Math.random();  // Math.random - рандомные числа
        System.out.println(randomNumber);

        int min = 1, max = 36, randiInt = 0; // [1...36]
        randiInt = (int) (min + randomNumber * (max - min + 1)); /// ПОЛУЧИТЬ СЛУЧАЙНОЕ ЧИСЛО
        System.out.println(randiInt);

        System.out.println("--Заполним массив целыми случаными числами-- ");
        int[] arRand = new int[10]; // указываем их количество [10] штук
        for (int i = 0; i < arRand.length; i++)
            arRand[i] = getIntRandom(min, max);

        System.out.println(Arrays.toString(arRand));
        System.out.println("--Таблица умножения--");
        int size = 10; // первый множитель(он же номер строки) x второй множитель = произвовидение
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%2d x %2d = %2d ", i, j, (i * j));
            }
            System.out.println();
        }

        System.out.println("--Номера розыгрыша лотереи--");
        min = 1;
        max = 36;
        int quantity = 5;
        int[] numbers = new int[quantity];

//        for (int i = 0; i < quantity; i++) {    // в этом варианте есть дубли в цыфрах
//            numbers[i] = getIntRandom(min, max);
//        }

        int counter = 0;
        while (counter < quantity) {
            int randNumber = getIntRandom(min, max);
            if (!checkArray(numbers, randNumber)) {
                numbers[counter++] = randNumber;
            }
        }


        System.out.println("Итоги розыгрыша лотереи" + System.lineSeparator() // универсальный разделитель строк  - аналог \n
                + Arrays.toString(numbers));

        Arrays.sort(numbers); // сортирует от меншего до большего
        System.out.println("Итоги розыгрыша лотереи по порядку" + System.lineSeparator() // универсальный разделитель строк  - аналог \n
                + Arrays.toString(numbers));


    }

    private static boolean checkArray(int[] numbers, int randNumber) {
//        boolean res = false;
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] == randNumber) return true;
        return false;
    }

    private static int getIntRandom(int min, int max) {
        return (int) (min + Math.random() * (max - min + 1)); /// ПОЛУЧИТЬ СЛУЧАЙНОЕ ЧИСЛО
    }
}
