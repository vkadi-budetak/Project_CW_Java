/**
 * абстрактний клас
 */

abstract public class Animal {
    // Конкретное поле
    public String name;

    // Конкретный метод (с реализацией)
    public void sleep() {
        System.out.println(name + " спит.");
    }

    // Абстрактный метод (без тела/реализации)
    public abstract void makeSound();

    public abstract void eating();
}