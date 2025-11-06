import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.chrono.ThaiBuddhistDate;
import java.time.format.TextStyle;
import java.time.temporal.*;
import java.util.Locale;

public class MainTimeAdv {
    public static void main(String[] args) {
        // С помощу timeStamp можно засекать время
        Instant timeStamp = Instant.now();
        System.out.println(timeStamp);

        for (int i = 0; i < 1000000000; i++) {

        }
        System.out.println(ChronoUnit.NANOS.between(timeStamp, Instant.now()));
        System.out.println(MonthDay.of(Month.FEBRUARY, 29).isValidYear(2020));
        System.out.println(Year.of(2020).isLeap()); // ли был год высокосным?

        LocalDate date = LocalDate.now();
        System.out.println(JapaneseDate.from(date)); // превращаем в дату по японском календарю
        System.out.println(ThaiBuddhistDate.from(date)); // превращаем в дату по будийском календарю

        // Создаю вывод дня недели - 3 разных вывода TextStyle.SHORT, TextStyle.FULL, TextStyle.NARROW
        DayOfWeek day = DayOfWeek.FRIDAY;
        System.out.println(day.getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
        System.out.println(day.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
        System.out.println(day.getDisplayName(TextStyle.NARROW, Locale.ENGLISH));

        // преобразователь, вытягую дату из каким то запросом
        System.out.println(date.with(TemporalAdjusters.firstDayOfMonth())); // смотрю первый день месяца
        System.out.println(date.with(TemporalAdjusters.lastDayOfMonth())); // смотрю последний день месяца
        System.out.println(date.with(
                TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.FRIDAY))); // смотрю какое число 3 пятницы
        System.out.println(date.with(
                TemporalAdjusters.lastDayOfMonth())); // вывожу последний день месяца
        System.out.println(date.with(
                TemporalAdjusters.firstDayOfNextYear())); // вывожу первый день след года
        System.out.println(date.with(
                TemporalAdjusters.previous(DayOfWeek.FRIDAY))); // вывожу предедущую пятницу


        // Хочу решить след задачу, получить дату невысокосных годов
        System.out.println(new NonLeapYear(5).adjustInto(date));

        // Узнаем стандарты с какими параметрами можем работать
        TemporalQuery<TemporalUnit> precisionQuery = TemporalQueries.precision();
        System.out.println(LocalDate.now().query(precisionQuery));
        System.out.println(LocalTime.now().query(precisionQuery));

        // вытянуть параметры
        System.out.println(ZonedDateTime.now().query(TemporalQueries.zone()));
        System.out.println(ZonedDateTime.now().query(TemporalQueries.offset()));

        // пишим метод и проверяем сегодня выходной или нет
        System.out.println(LocalDateTime.now().query((new IsWeekendDayGermany())));

    }
}
