public class Car {
    private String plate;    // Обязательное поля для заполнения
    private int year;        // Обязательное поля для заполнения
    private String model;    // Обязательное поля для заполнения
    private String color;   // Обязательное поля для заполнения
    private String owner;
    private double volume;
    private double power;
    private int numberInsurance;

    // Создаю Конструктор
    private Car(Builder builder) {
        this.plate = builder.plate;
        this.year = builder.year;
        this.model = builder.model;
        this.color = builder.color;
        this.owner = builder.owner;
        this.volume = builder.volume;
        this.power = builder.power;
        this.numberInsurance = builder.numberInsurance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plate='" + plate + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", owner='" + owner + '\'' +
                ", volume=" + volume +
                ", power=" + power +
                ", numberInsurance=" + numberInsurance +
                '}';
    }

    // Создаю вложеный клас Builder
    public static class Builder {
        private String plate;
        private int year;
        private String model;
        private String color;
        private String owner;
        private double volume;
        private double power;
        private int numberInsurance;

        // Создаю конструктор на обязательніе поля
        public Builder(String plate, int year, String model, String color) {
            this.plate = plate;
            this.year = year;
            this.model = model;
            this.color = color;
        }

        // Создаю заполняльщик на необезательное поле (Создаются вместо Геттера и сеттера)
        public Builder owner(String owner) {
            if (owner != null && !owner.isBlank()) {
                System.out.println("Name is incorrect");
            }
                this.owner = owner;
            return this;
        }

        // Создаю заполняльщик на необезательное поле (Создаются вместо Геттера и сеттера)
        public Builder volume(double volume) {
            if(volume < 0 ){
                System.out.println("volume is incorrect");
            }
            this.volume = volume;
            return this;
        }

        // Создаю заполняльщик на необезательное поле (Создаются вместо Геттера и сеттера)
        public Builder power(double power) {
            if(power < 0 ){
                System.out.println("power is incorrect");
            }
            this.power = power;
            return this;
        }

        // Создаю заполняльщик на необезательное поле (Создаются вместо Геттера и сеттера)
        public Builder numberInsurance(int numberInsurance) {
            if(numberInsurance < 9999){
                System.out.println("volume is incorrect");
            }
            this.numberInsurance = numberInsurance;
            return this;
        }

        // Создаю метод который новый Car
        public Car build() {
            return new Car(this);
        }

    }
}
