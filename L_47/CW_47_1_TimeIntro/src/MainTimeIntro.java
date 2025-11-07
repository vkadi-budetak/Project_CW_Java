/**
 * Package java.time
 * import java.time.*;
 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class MainTimeIntro {
    public static void main(String[] args) {
        /**
         * LocalDate
         */

        LocalDate date = LocalDate.now();
        System.out.println(date); // ISO 2025-11-05

        LocalDate date1 = LocalDate.of(2000, 10, 11);
        System.out.println(date1);

        LocalDate date2 = LocalDate.of(2000, Month.AUGUST, 10);
        System.out.println(date2);

        System.out.println(date.getMonth()); // выводит месяц
        System.out.println(date.getYear()); // выводит год

        // парсим из строки
        LocalDate date3 = LocalDate.parse("1900-11-11");
        System.out.println(date3);

        // какой будет 321 день 2020 года?
        LocalDate date4 = LocalDate.ofYearDay(2020, 321);
        System.out.println(date4);

        System.out.println(date.getDayOfWeek()); // получим день недели
        System.out.println(date.getDayOfYear()); // получим день

        // смотрим какая епоха - от какого числа начали отсчет
        System.out.println(LocalDate.EPOCH);
        System.out.println(LocalDate.ofEpochDay(10000));

        System.out.println(date.withYear(3000)); // получить такую же дату только в 3000 году

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

        // Посчитаем период (сколько пройшло времени от date до date3)
        System.out.println(Period.between(date, date3));
        Period temp = Period.between(date, date3);
        System.out.println(temp.getYears());
        System.out.println(temp.getYears());

        // Метод between - сколько пройшло дней между этими годами
        System.out.println(ChronoUnit.DAYS.between(date1, date3));
        System.out.println(ChronoUnit.YEARS.between(date1, date3));

        System.out.println(date.isAfter(date1)); // проверяет какая дата раньше какая позже
        System.out.println(date.isBefore(date1)); // проверяет какая дата раньше какая позже

        // какой порядковый номер сегодня в году
        System.out.println(date.getDayOfYear());

        // узнать который день недели
        System.out.println(date.getDayOfWeek().getValue()); // 3 - показывает порядковый номер недели
        System.out.println(date.getDayOfWeek()); // WEDNESDAY
        System.out.println(date.getDayOfMonth()); // показывает какой день месяца

        System.out.println(date.getEra());
        System.out.println(date3.getEra());
        System.out.println(LocalDate.of(-10, 1, 1).getEra());

        //*******************************************************
        /**
         * LocalTime
         */

        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime time1 = LocalTime.of(1, 1, 1, 1);
        System.out.println(time1);
        //получакм время розпарсим строку
        LocalTime time2 = LocalTime.parse("10:10:10");
        System.out.println(time2);
        // получаем время задавшие секунди от сначала дня
        LocalTime time3 = LocalTime.ofSecondOfDay(1000);
        System.out.println(time3);

        System.out.println(time.plusHours(-55));
        System.out.println(time.minusHours(55));
        System.out.println(time.plus(30, ChronoUnit.HALF_DAYS));

        // показывает период времени
        System.out.println(time.plus(Duration.ofMinutes(15)));

        /**
         * LocalDateTime
         */
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        LocalDateTime dt1 = LocalDateTime.of(date3, time3);
        System.out.println(dt1);
        LocalDateTime dt2 = LocalDateTime.of(1, 1, 1, 1, 1);
        System.out.println(dt2);

        // Formatter
//        LocalDate date13 = LocalDate.parse("09/09/2020"); // ERROR - не розпаврсит если не ISO

        /*
        как формируються
        yy yyyy - обозначения года - year
        MM MMM MMMM - обозначения месяца - month
        E ee eee eeee - обозначения дня недели - day of week
        dd - день - day
        hh HH  hh a - часы - hour
        mm - minute
        ss - seconds
         */

        // Создаем дату с временем
        DateTimeFormatter dtf =
                DateTimeFormatter.ofPattern("eeee, dd MM yyyy - hh:mm:ss");
        System.out.println(dt.format(dtf));

        // Локализация - чтобы выводить анг языком
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern(
                "dd/MMMM/yyyy", Locale.ENGLISH);
        System.out.println(dt.format(dtf1));
        // Локализация - чтобы выводить японском языке
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(
                "dd/MMMM/yyyy", Locale.JAPAN);
        System.out.println(dt.format(dtf2));

        // Еще можна задавать вывод языка через Locale.forLanguageTag()
        // больше вариантов указать стран Ro - Румыния
        DateTimeFormatter dtf3 =
                DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.forLanguageTag("Ro"));
        System.out.println(dt.format(dtf3));


        // ZoneTime - временные зоны;
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        // Я могу вызывать время для другого часового пояса
        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("GMT-4"));
        System.out.println(zdt1);

        // или задачть вручную через ZoneOffset.of
        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneOffset.of("-4"));
        System.out.println(zdt2);

//        ZoneOffset zos = ZoneOffset.of("08"); ERROR
          ZoneOffset zos = ZoneOffset.of("+08:00");
        OffsetDateTime odt = OffsetDateTime.of(dt,zos);
        System.out.println(zdt.withZoneSameInstant(zos));

        // ID с которыми можна работать
        for (String str: ZoneId.getAvailableZoneIds())
            System.out.println(str);


    }
}