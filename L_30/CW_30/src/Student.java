public class Student {
    private String name;
    private int age;
    private double grade;

    // Конструктор
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //Гетери
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGrade() {
        return grade;
    }


}
