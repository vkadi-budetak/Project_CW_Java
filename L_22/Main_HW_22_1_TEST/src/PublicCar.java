
/**
 * Класс PublicCar представляет общественный транспорт
 * Наследует от Car и добавляет поля company (компания) и places (количество мест)
 */
public class PublicCar extends Car {
    private String company;    // Транспортная компания
    private int places;        // Количество мест

    /**
     * Конструктор по умолчанию
     */
    public PublicCar() {
        super();
        this.company = "Городской транспорт";
        this.places = 20;
    }

    /**
     * Конструктор с параметрами
     */
    public PublicCar(String model, int year, String color, boolean customsCleared,
                     String company, int places) {
        super(model, year, color, customsCleared);
        this.company = company;
        this.places = places;
    }

    // Геттеры и сеттеры
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        if (places > 0 && places <= 100) { // Разумные ограничения для общественного транспорта
            this.places = places;
        } else {
            System.out.println("Некорректное количество мест!");
        }
    }

    /**
     * Переопределение метода printAllFields()
     */
    @Override
    public void printAllFields() {
        super.printAllFields();
        System.out.println("Компания: " + company);
        System.out.println("Количество мест: " + places);
        System.out.println("Тип: Общественный транспорт");
    }

    /**
     * Переопределение toString()
     */
    @Override
    public String toString() {
        return "PublicCar{" +
                "company='" + company + '\'' +
                ", places=" + places +
                "} " + super.toString();
    }
}

