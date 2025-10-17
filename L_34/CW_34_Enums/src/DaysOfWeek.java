import java.util.Locale;

public enum DaysOfWeek {
    MONDAY(1,"понедельник"),
    TUESDAY(2,"вторник"),
    WEDNESDAY(3,"среда"),
    THURSDAY(4,"четверг"),
    FRIDAY(5,"пятница"),
    SATURDAY(6,"суббота"),
    SUNDAY(7,"воскресенье");

    //Створюю поля для enum
    private int number;
    private String ruName;
    private String enName;

    //Створюю Конструктор

    DaysOfWeek(int number, String ruName) { // видаляю enName
        this.number = number;
        this.ruName = ruName;
        this.enName = this.name().toLowerCase(); // а тут добираюся до імя і витягую англіську назву
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRuName() {
        return ruName;
    }

    public void setRuName(String ruName) {
        this.ruName = ruName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    // Створюю метод
    public static DaysOfWeek getDayByNumber(int dayNumber){
        DaysOfWeek[] values = DaysOfWeek.values();
        for(DaysOfWeek day : values){
            if(day.number == dayNumber){
                return day;
            }
        }
        return null;
    }
}
