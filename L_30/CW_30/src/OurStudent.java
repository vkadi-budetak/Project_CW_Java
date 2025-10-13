public class OurStudent implements Comparable<OurStudent> {
    private String name;
    private int age;
    private double grade;

    // Конструктор
    public OurStudent(String name, int age, double grade) {
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

    /**
     * Естественное упорядочивание студентов по оценке (по убыванию)
     * Студенты с высшими оценками будут первыми
     */
    @Override
    public int compareTo(OurStudent otherStudent) {
         return Double.compare(otherStudent.grade, this.grade);

        // Альтернативный способ:
//        if (this.grade < otherStudent.grade) return 1; // this меньше
//        if (this.grade > otherStudent.grade) return -1; // this больше
//        return 0;                                       // равны
//
    }

    @Override
    public String toString() {
        return String.format("OurStudent{name='%s', age = %d, grade=%.1f}%n", name, age, grade);
    }
}
