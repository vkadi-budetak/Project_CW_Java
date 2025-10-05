/**
 * Создайте интерфейс Drawable с методом draw().
 * Затем создайте классы:
 * Circle
 * Rectangle
 * Triangle
 * Все они должны реализовать интерфейс и метод draw(), выводя сообщение, какую фигуру они рисуют.
 * В main() создайте массив/список объектов типа Drawable и вызовите метод draw() для каждого элемента.
 * 💡 Пример ожидаемого вывода
 * Drawing a Circle
 * Drawing a Rectangle
 * Drawing a Triangle
 */

/**
 * ### Задание (для желающих)
 * Создайте систему для управления геометрическими фигурами:
 * - Интерфейс `Shape` с методами `calculateArea()` и `calculatePerimeter()`
 * - Интерфейс `Resizable` с методом `resize(double factor)`
 * - Класс `Square`, реализующий оба интерфейса
 * - Класс `Triangle`, реализующий только `Shape`
 * - Напишите программу, которая создает массив различных фигур, вычисляет их площади и изменяет размер
 * тех фигур, которые поддерживают изменение размера
 */
public class Main {
    public static void main(String[] args) {

        Drawable[] drawables = {
                new Circle(),
                new Rectangle(),
                new Triangle()
        };

        for (Drawable d : drawables) {
            d.draw();
        }
    }
}