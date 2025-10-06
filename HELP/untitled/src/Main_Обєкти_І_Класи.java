public class Main_Обєкти_І_Класи {
    public static void main(String[] args) {}
}

// static - дозволяє достукатися до змінних, методів і тд без стоворення додаткового коду і змінної(Calculator calc = new Calculator();)

// private -
// protected - в наслідуванні використовується, він дозволяє наслідувачам звертатися напряму

// setter - менять
// getter - читать
/**
 * //
 *     public void setName(String name) {
 *         if(name!=null && !name.isBlank()) this.name = name;
 *     }
 *
 *     public void setAge(int age) {
 *         if (age>0 && age <120) this.age = age;
 *     }
 *
 *     public void setAge1(int age) {
 *         if (age < 0) {
 *             System.out.println("Age is incorrect")  // -> виведе надпис
 *             return;                               // -> метод зупинится
 *         }
 *         this.age = age;
 *     }
 *
 *     public void setId(int id) {
 *         if (id > 0) this.id = id;
 *     }
 */

/**
 * НАСЛІДУВАННЯ
 *
 * ств. головний клас і підклас
 *
 * public class Animal {
 *      ...
 * }
 *      і підклас
 *
 * public class Cat extends Animal {
 *  і визиваємо конструктор від Animal
 * }
 */

/**
 * АБСТРАКТНИЙ МЕТОД
 * абстрактний клас - батьками для методів, а абстрактні методи є обовязкові дії для реалізації;
 *
 * public abstract class Animal {
 *  *      // Abstract method that all animal subclasses must implement
 *     public abstract void feed();
 *  * }
 *  *      і підклас
 *  *
 *  * public class Cat extends Animal {
 *  *       // implementation of the superclass’s abstract method
 *     @Override
 *     public void feed() {
 *         System.out.println("Cat eats meat");
 *  * }
 */

/**
 * INTERFACES -(підписуємо контракт - имплементируем или внедряем) дозволяє оприділити якусь загальну поведінка для класів
 * // Створюємо інтерфейс Літати до назви добавляємо ...able і прописуємо методи
 * public interface Flyable {
 *     void takeOff(); - public - по замовченню! - метод Взлітати
 *     void fly(); - метод литіти
 *     void land(); - метод призимлятися
 * }
 *
 * // Підклас Птиць наслідується від Тварин і реалізовуємо interfaces через implements()
 * public class Bird extends Animal implements Flyable {
 *     public Bird(double weight) { //Наслідується від Батька
 *         super(weight);
 *     }
 *
 *     // implementation of the interface’s abstract methods
 *     @Override
 *     public void takeOff() {
 *         System.out.println("Bird is taking off");
 *     }
 *
 *     @Override
 *     public void fly() {
 *         System.out.println("Bird is flying");
 *     }
 *
 *     @Override
 *     public void land() {
 *         System.out.println("Bird is landing");
 *     }
 * }
 */
/**
 *  POLYMORPHISM -
 *  // Inheritance allows assigning a subclass object reference to a superclass-typed variable
 *         Animal animal1 = new Cat(5.0);
 *         Animal animal2 = new Fish(0.3);
 *
 *         Animal[] animals = {
 *                 new Cat(5.0),
 *                 new Fish(0.3),
 *                 new Bird(2.3)
 *         };
 *
 *         for (Animal animal : animals) {
 *             // polymorphism via a common superclass
 *             animal.feed();
 *         }
 *
 *         System.out.println();
 *
 *         Flyable[] flyingThings = {
 *                 new Aircraft(),
 *                 new Bird(2.3),
 *                 new Aircraft()
 *         };
 *
 *         for (Flyable currentElement : flyingThings) {
 *             // polymorphism via an interface
 *             currentElement.takeOff();
 *             currentElement.fly();
 *             currentElement.land();
 *         }
 */
