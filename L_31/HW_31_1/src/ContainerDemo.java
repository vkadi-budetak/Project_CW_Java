public class ContainerDemo {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>("Привет");
        Container<Integer> intContainer = new Container<>(77);
        Container<String> emptyContainer = new Container<>(null);

        System.out.println(stringContainer.getItem());
        System.out.println(intContainer.getItem());
        System.out.println(emptyContainer.isEmpty());
    }
}

/**
 * 📚 Домашнее задание: Введение в дженерики
 * 📝 Задание 1(обязательное): Создание generic класса Container
 * Описание: Создайте generic класс Container<T>, который может хранить объект любого типа.
 * Требования:
 * Класс должен иметь приватное поле item типа T
 * Конструктор, принимающий параметр типа T
 * Метод getItem() для получения элемента
 * Метод setItem(T item) для установки элемента
 * Метод isEmpty() для проверки, пуст ли контейнер
 * Переопределить метод toString()
 * Пример использования:
 * <p>
 * Box<String> stringBox = new Container<>("Привет");
 * Box<Integer> intBox = new Container<>(77);
 * Box<Double> emptyBox = new Container<>(null);
 * <p>
 * System.out.println(stringBox.getItem());
 * System.out.println(intBox.getItem());
 * System.out.println(emptyBox.isEmpty());
 */
