public class Main {

    public static void main(String[] args) {

        // Convenient object instantiation via a constructor
        Student student = new Student("Luke", 25, 2, 4.78);

        // Error. The field is private.
//        System.out.println("Student's age is " + student.age);

        // Working with getters and setters
        System.out.println("Student's age is " + student.getAge());

        student.setAge(-5);
        System.out.println("Student's age is " + student.getAge());

        // println() automatically invokes an object’s toString()
        // for informative console output
        System.out.println(student);
    }
}