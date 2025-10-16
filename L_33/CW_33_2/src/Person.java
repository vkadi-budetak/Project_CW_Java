public class Person {
    private String fName;  // Обязательное поля для заполнения!!!!!!!
    private String lName;  // Обязательное поля для заполнения!!!!!!!
    private int age;
    private int weight;
    private int height;

    //КОНСТРУКТОР пишим вручную!!!
    private Person(Builder builder){
        this.fName = builder.fName;
        this.lName = builder.lName;
        this.age = builder.age;
        this.weight = builder.weight;
        this.height = builder.height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    //вложеный класс
    public static class Builder{
        private String fName;
        private String lName;
        private int age = 0;
        private int weight = 0;
        private int height = 0;

        //Конструктор только на обязательные поля
        public Builder(String fName, String lName) {
            this.fName = fName;
            this.lName = lName;
        }

        //Заполняльщик на данное необезательное поле (Создаются вместо Геттера и сеттера)
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        //Заполняльщик на данное необезательное поле (Создаются вместо Геттера и сеттера)
        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }
        //Заполняльщик на данное необезательное поле (Создаются вместо Геттера и сеттера)
        public Builder height(int height) {
            this.height = height;
            return this;
        }

        //Создаю метод который новый Person
        public Person build(){
            return  new Person(this);
        }

    }

}
