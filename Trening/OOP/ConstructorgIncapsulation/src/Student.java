public class Student {

    // Hide fields from external access using the `private` access modifier
    private String name;
    private int age;
    private int course;
    private double averageRate;

    // Constructors let you conveniently create objects
    // and initialize their fields by passing values as arguments

    /**
     * КОНСТРУКТОР
     * @param name - імя
     * @param age - вік
     * @param course
     * @param averageRate
     */
    public Student(String name, int age, int course, double averageRate) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.averageRate = averageRate;
    }

    /**
     * Пустий конструктор і може присвоїти пусті поля
     */
    public Student() {
        name = "Unknown";
    }

    // Getters and setters are used to access data and validate values
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age is incorrect");
            return;
        }
        this.age = age;
    }

    // The `toString()` method converts an object’s state into a string -
    // for example, for informative console output
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", averageRate=" + averageRate +
                '}';
    }
}
