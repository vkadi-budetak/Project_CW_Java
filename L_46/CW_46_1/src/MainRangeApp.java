/**
 * Используем Exception
 * стрельба из лука
 */

public class MainRangeApp {
    private static final int MIN_RANGE = 10; // мишень от 10
    private static final int MAX_RANGE = 100; // мишень до 100
    private static final int MIN_RANDOM = 0; // выстрелы от 0 до 1000
    private static final int MAX_RANDOM = 1000; // выстрелы от 0 до 1000

    private static final int N_NUMBERS = 1000; // сколько выстрелов хочу я сделать

    public static void main(String[] args) {

        Range range = null; // выношу чтобы видить переменную везде и указываю null

        try {
            range = new Range(MIN_RANGE, MAX_RANGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            range = new Range(MAX_RANGE, MIN_RANGE);
        }

        if (range == null) return; // ???? если обьекта нет то выходим

        int countNormal = 0;
        int countLess = 0;
        int countGreater = 0;

        // делаем выстрелы
        for (int i = 0; i < N_NUMBERS; i++) {
            int number = (int) (MIN_RANDOM + Math.random() * (MAX_RANDOM - MIN_RANDOM + 1));
            try{ // если было попадание
                range.checkNumber(number);
                countNormal ++;
            } catch (NumberLessMinException e) { // если было не попадание ...
                countLess ++;
            } catch (NumberGreaterMaxException e) {
                countGreater ++;
            } catch (Exception e ) {
                System.out.println(e.getMessage());
            }
        }

        // печатаем результат
        System.out.printf("counter normal = %d\n" +
                "counter less = %d\ncounter greater = %d\n",
                countNormal, countLess, countGreater);
    }
}