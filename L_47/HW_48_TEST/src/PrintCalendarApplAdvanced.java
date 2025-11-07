import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class PrintCalendarApplAdvanced
{

    private static final int DATE_WIDTH = 4;

    public static void main(String[] args)
    {
        int[] monthYear = args.length == 2 ? getMonthYear(args) : getCurrentMonthYear();

        if (monthYear == null)
        {
            System.out.println("wrong input");
            return;
        }

        int month = monthYear[0];
        int year = monthYear[1];

        int firstDay = args.length > 2 ? getFirstDay(args[2]) : 1;
        print(month, year, firstDay);
    }

    private static int getFirstDay(String firstDay)
    {
        int res=Integer.parseInt(firstDay);
        if(res<1||res>7)
            throw new RuntimeException("wrong week day "+res);
        return res;
    }

    private static int[] getMonthYear(String[] args)
    {
        int[] res = new int[2];
        try
        {
            res[0] = Integer.parseInt(args[0]);
            res[1] = Integer.parseInt(args[1]);
            if (res[0] < 1 || res[0] > 12)
                return null;
        } catch (Exception e)
        {
            return null;
        }
        return res;
    }

    private static int[] getCurrentMonthYear()
    {
        LocalDate ld = LocalDate.now();
        return new int[] { ld.getMonthValue(), ld.getYear() };
    }

    private static void print(int month, int year, int firstDay)
    {
        printTitle(month, year);
        printWeekDaysNames(firstDay);
        printDates(month, year);
    }

    private static void printTitle(int month, int year)
    {
        String monthName = Month.of(month)
                .getDisplayName(TextStyle.FULL, Locale.forLanguageTag("en"));
        System.out.printf("%6s%s %d\n", " ", monthName, year);
    }

    private static void printWeekDaysNames(int firstDay)
    {
        System.out.print("  ");
        for (int i = firstDay; i <= 7; i++)
        {
            System.out.print(getWeekDayName(i) + " ");
        }
        for (int i = 1; i < firstDay; i++)
        {
            System.out.print(getWeekDayName(i) + " ");
        }
        System.out.println();
    }

    private static String getWeekDayName(int i)
    {
        return DayOfWeek.of(i).getDisplayName(TextStyle.SHORT, Locale.forLanguageTag("en"));
    }

    private static void printDates(int month, int year)
    {
        int firstColumn = getFirstColumn(month, year);
        printOffset(firstColumn);
        printNumbersFromOffset(firstColumn, month, year);
    }

    private static int getFirstColumn(int month, int year)
    {
        LocalDate firstDate = LocalDate.of(year, month, 1);
        return firstDate.getDayOfWeek().getValue();
    }

    private static void printOffset(int firstColumn)
    {
        for (int i = DATE_WIDTH; i < firstColumn * DATE_WIDTH; i++)
        {
            System.out.print(" ");
        }
    }

    private static void printNumbersFromOffset(int firstColumn, int month, int year)
    {
        int nDays = YearMonth.of(year, month).lengthOfMonth();
        for (int i = 1; i <= nDays; i++)
        {
            System.out.printf("%" + DATE_WIDTH + "d", i);
            if (firstColumn == 7)
            {
                firstColumn = 1;
                System.out.println();
            } else
            {
                firstColumn++;
            }
        }
    }
}

