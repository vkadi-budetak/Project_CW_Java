import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

public class DateOperations
{
    static DateTimeFormatter getFormatter(String strDate)
    {
        return strDate.contains("-") ? DateTimeFormatter.ISO_DATE :
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }
    /*

     *
     * @param dates
     * @return sorted array of strings in the ascending order of the appropriate
     *         dates
     *         отсортированный массив строк в порядке возрастания соответствующих дат
     */


    public static String[] sortStringDates(String[] dates)
    {
        Arrays.sort(dates, new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                DateTimeFormatter dtf1 = getFormatter(o1);
                DateTimeFormatter dtf2 = getFormatter(o2);
                return LocalDate.parse(o1, dtf1).compareTo(LocalDate.parse(o2, dtf2));
            }
        });
        return dates;
    }

    /*

     *
     * @param birthDate
     * @param currentDate
     * @return full age in the years relatively the given current date if
     *         currentDate is null the LocalDate.now() is applied
     *          полный возраст в годах относительно заданной текущей даты;
     *          если currentDate равна null, используется LocalDate.now()
     */

    public static int getAge(String birthDate, String currentDate)
    {
        LocalDate currentdate;

        if(currentDate == null)
            currentdate = LocalDate.now();
        else
        {
            DateTimeFormatter dtf = getFormatter(currentDate);
            currentdate = LocalDate.parse(currentDate, dtf);
        }

        DateTimeFormatter dtf1 = getFormatter(birthDate);
        LocalDate birthdate = LocalDate.parse(birthDate, dtf1);

        return (int) ChronoUnit.YEARS.between(birthdate, currentdate);
    }

    /*ADV****************************8
     * print current time in format HH:MM (hours:minutes) for all time zones
     * containing zoneSubstring one printed line should contain full zone name and
     * time in the above format
     *
     * @param zoneSubstring
     * ДОПОЛНИТЕЛЬНОЕ ЗАДАНИЕ ****************************
     *      * Вывести текущее время в формате HH:MM (часы:минуты) для всех часовых поясов,
     *      * содержащих подстроку zoneSubstring.
     *      * Каждая строка вывода должна содержать полное имя часового пояса и время в указанном формате.
     *      *
     *      * @param zoneSubstring часть названия часового пояса
     *
     */

    public static void printCurrentTime(String zoneSubstring)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        Set<String> zones = ZoneId.getAvailableZoneIds();
        for (String zone : zones)
        {
            if (zone.contains(zoneSubstring))
            {
                ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of(zone));
                System.out.println(zone + " - " + zdt.format(dtf));
            }
        }
    }
}

