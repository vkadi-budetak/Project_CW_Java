/**
 * Абстрактный класс Person представляет базовую модель человека в системе управления общежитием.
 * Этот класс демонстрирует ключевые принципы ООП:
 * - Абстракция: класс содержит абстрактный метод introduce(), который должен быть реализован в подклассах
 * - Инкапсуляция: поля защищены модификатором protected, доступ через геттеры
 * - Наследование: служит базовым классом для Student, DormLeader, DormManager
 * - Полиморфизм: реализует интерфейс Comparable для сортировки объектов
 *
 * @author Sergiy Danylko
 * @version 1.0
 */
public abstract class Person implements Comparable<Person> {

    /**
     * Имя человека. Используется модификатор protected для доступа из подклассов.
     */
    protected String name;

    /**
     * Возраст человека в годах.
     */
    protected int age;

    /**
     * Номер телефона для связи.
     */
    protected String phoneNumber;

    /**
     * Конструктор для создания объекта Person с основными данными.
     * Инициализирует все обязательные поля класса.
     *
     * @param name имя человека
     * @param age возраст в годах (должен быть положительным числом)
     * @param phoneNumber номер телефона для связи
     */
    public Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Возвращает имя человека.
     * Геттер обеспечивает контролируемый доступ к приватному полю.
     *
     * @return имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает возраст человека.
     *
     * @return возраст в годах
     */
    public int getAge() {
        return age;
    }

    /**
     * Возвращает номер телефона человека.
     *
     * @return номер телефона
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Абстрактный метод для представления человека.
     * Каждый подкласс должен реализовать этот метод по-своему,
     * что демонстрирует принцип полиморфизма.
     *
     * @return строка с представлением человека
     */
    public abstract String introduce();

    /**
     * Выводит контактную информацию человека на консоль.
     * Конкретная реализация метода, доступная всем подклассам.
     */
    public void showContactInfo() {
        System.out.println("Контакт: \n" + "Имя: " + name + ", тел. " + phoneNumber);
    }

    /**
     * Сравнивает двух людей по имени для сортировки.
     * Реализация интерфейса Comparable позволяет сортировать коллекции объектов Person.
     *
     * @param other другой объект Person для сравнения
     * @return отрицательное число, ноль или положительное число, если данный объект
     *         меньше, равен или больше указанного объекта соответственно
     */
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    /**
     * Возвращает строковое представление объекта Person.
     * Переопределение метода toString() для удобного отображения информации об объекте.
     *
     * @return строка с основной информацией о человеке
     */
    @Override
    public String toString() {
        return "Person {" +
                "name = '" + getName() + '\'' +
                ", age = " + getAge() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                '}';
    }
}
