import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Set;

public class DateOperations {
    /**
     *
     * @param dates
     * @return sorted array of strings in the ascending order of the appropriate
     * dates
     */
    public static String[] sortStringDates(String[] dates) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Масив для LocalDate
        LocalDate[] parsedDates = new LocalDate[dates.length];

        // Перебираем и проверяем на знак
        for (int i = 0; i < dates.length; i++) {
            if (dates[i].contains("-")) {
                parsedDates[i] = LocalDate.parse(dates[i], dtf);
            } else {
                parsedDates[i] = LocalDate.parse(dates[i], dtf1);
            }
        }
        // Делаем сортировку от страше ...
        Arrays.sort(parsedDates);

        // Переделываем отсортированые даты назад в текст
        String[] sortedDates = new String[parsedDates.length];

        for (int i = 0; i < parsedDates.length; i++) {
            LocalDate currentDate = parsedDates[i];

            for (String originalDate : dates) {
                LocalDate temp;
                if (originalDate.contains("-")) {
                    temp = LocalDate.parse(originalDate, dtf);
                } else {
                    temp = LocalDate.parse(originalDate, dtf1);
                }
                if (temp.equals(currentDate)) {
                    sortedDates[i] = originalDate;
                    break;
                }
            }
        }

        return sortedDates;



    }

    /**
     *
     * @param birthDate
     * @param currentDate
     * @return full age in the years relatively the given current date if
     * currentDate is null the LocalDate.now() is applied
     */
    public static int getAge(String birthDate, String currentDate) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Парсим дату ДР
        LocalDate birth;
        if (birthDate.contains("-")) {
            birth = LocalDate.parse(birthDate, dtf);
        } else {
            birth = LocalDate.parse(birthDate, dtf1);
        }

        // 3️⃣ Парсим поточную дату
        LocalDate current;
        if (currentDate == null) {
            current = LocalDate.now();  // Сьогоднішня дата
        } else {
            if (currentDate.contains("-")) {
                current = LocalDate.parse(currentDate, dtf);
            } else {
                current = LocalDate.parse(currentDate, dtf1);
            }
        }

        // Считаем разницу в годах через Period
        Period period = Period.between(birth, current);
        return period.getYears();
    }

    /**
     * ADV****************************8
     * print current time in format HH:MM (hours:minutes) for all time zones
     * containing zoneSubstring one printed line should contain full zone name and
     * time in the above format
     *
     * @param zoneSubstring
     */

    public static void printCurrentTime(String zoneSubstring) {
        // Создаем формат времени
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        // Получаем всевозможные часовые пояса
        Set<String> allZones = ZoneId.getAvailableZoneIds();

        for (String zone : allZones) {
            if (zone.contains(zoneSubstring)) {
                // Получаем поточное время для зоны
                ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of(zone));

                // Форматируем время как HH:mm
                String time = zdt.format(timeFormatter);

                System.out.println(zone + " - " + time);
            }
        }

    }
}

