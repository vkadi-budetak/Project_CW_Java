
public class Main {

    public static void main(String[] args) {
        // Instantiating an object from a class
        Student student = new Student(); // створюємо студента

        // Working with an object’s state
        student.name = "Luke";
        student.age = 25;
        student.course = 2;
        student.averageRate = 4.78;

        System.out.println("Student's name is " + student.name); // виводимо імя студента

        Student student1 = new Student();
        student1.name = "Mike";

        System.out.println("Second student's name is " + student1.name);

        // Invoking an object’s methods
        student.sleep();  // відправляємо студента спати

        student.study(); // відправляємо студента навчатися
        student1.study(); // відправляємо студента навчатися

        int newCourse = student.promote(); // відправляємо студента на новий курс
        System.out.println(student.name + " is on " + newCourse + " course now");
        System.out.println(student.course); // побачимо новий курс
    }
}