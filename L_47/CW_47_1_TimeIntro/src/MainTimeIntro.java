/**
 * Package java.time
 * import java.time.*;
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

public class MainTimeIntro {
    public static void main(String[] args) {
        // LocalDate
        LocalDate date = LocalDate.now();
        System.out.println(date); // ISO 2025-11-05

        LocalDate date1 = LocalDate.of(2000, 10, 11);
        System.out.println(date1);

        LocalDate date2 = LocalDate.of(2000, Month.AUGUST, 10);
        System.out.println(date2);

        // парсим из строки
        LocalDate date3 = LocalDate.parse("1900-11-11");
        System.out.println(date3);

        // какой будет 321 день 2020 года?
        LocalDate date4 = LocalDate.ofYearDay(2020, 321);
        System.out.println(date4);

        // смотрим какая епоха - от какого числа начали отсчет
        System.out.println(LocalDate.EPOCH);
        System.out.println(LocalDate.ofEpochDay(10000));

        System.out.println(date.withYear(3000));

        // получить дату и что-то нужно плюсовать или минусовать
        System.out.println(date.plusWeeks(2).plusDays(2)
                .plusMonths(3).plusYears(1));
        System.out.println(date.minusWeeks(3));

        // плюсуем 10 декат от сегоднишнего дня
        System.out.println(date.plus(10, ChronoUnit.DECADES));

        // ERROR - будет ошибка так как минуты не относятся к дате
//        System.out.println(date.plus(10, ChronoUnit.MINUTES));

        // Период - плюсую 10 лет
        System.out.println(date.plus(Period.ofYears(10)));
        // отнимаю 1 год 1 месяц 1 день
        System.out.println(date.minus(Period.of(1, 1, 1)));

        // Метод between - сколько пройшло дней между этими годами
        System.out.println(ChronoUnit.DAYS.between(date1, date3));
        System.out.println(ChronoUnit.YEARS.between(date1, date3));

        System.out.println(date.isAfter(date1));
        System.out.println(date.isBefore(date1));

        // какой порядковый номер сегодня в году
        System.out.println(date.getDayOfYear());
        // узнать который день недели
        System.out.println(date.getDayOfWeek().getValue()); // 3
        System.out.println(date.getDayOfWeek()); // WEDNESDAY



    }
}