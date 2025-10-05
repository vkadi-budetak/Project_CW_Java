// A class defines the state and behavior of objects
public class Student {

    // An object’s state is defined by the class’s fields
    // Each instantiated object has its own copies of those variables
    String name; // - змінні або поля класа
    int age;
    int course;
    double averageRate;

    // An object’s behavior is defined by its methods
    public void sleep() {                           // метод де студент спить
        System.out.println("Student is sleeping");
    }

    public void study() {
        System.out.println(name + " is studying");  // метод, що студент навчається
    }

    public int promote() {        // переводе студента на наступний курс і повретає нове значення
        course++;
        return course;
    }
}
