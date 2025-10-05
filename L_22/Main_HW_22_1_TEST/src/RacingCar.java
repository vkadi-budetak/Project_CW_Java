/**
 * Класс RacingCar представляет гоночный автомобиль
 * Наследует от Car и добавляет поле team (команда)
 */
public class RacingCar extends Car {
    private String team; // Команда, за которую выступает автомобиль

    /**
     * Конструктор по умолчанию
     */
    public RacingCar() {
        super(); // Вызов конструктора родительского класса
        this.team = "Независимая команда";
    }

    /**
     * Конструктор с параметрами
     */
    public RacingCar(String model, int year, String color, boolean customsCleared, String team) {
        super(model, year, color, customsCleared); // Вызов конструктора родительского класса
        this.team = team;
    }

    // Геттер и сеттер для поля team
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * Переопределение метода printAllFields()
     * Сначала вызываем метод родительского класса, затем добавляем специфичную информацию
     */
    @Override
    public void printAllFields() {
        super.printAllFields(); // Вызов метода родительского класса
        System.out.println("Команда: " + team);
        System.out.println("Тип: Гоночный автомобиль");
    }

    /**
     * Переопределение toString()
     */
    @Override
    public String toString() {
        return "RacingCar{" +
                "team='" + team + '\'' +
                "} " + super.toString();
    }
}

