public class MainDays {
    public static void main(String[] args) {
        print(DaysOfWeek.MONDAY);
        System.out.println(DaysOfWeek.getDayByNumber(6));
    }

    private static void print(DaysOfWeek daysOfWeek) {
        System.out.println(daysOfWeek);
    }
}
