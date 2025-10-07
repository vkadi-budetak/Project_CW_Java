/*
Создать интерфейс `Drawable` с методом `draw()` и классы `Circle`,
`Rectangle`, `Triangle`, которые его реализуют.
 */
public class DrawableDemo {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация интерфейса Drawable ===");

        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(10.0, 6.5);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        circle.draw();
        rectangle.draw();
        triangle.draw();

        Drawable[] shapes = {
                new Circle(7.0),
                new Rectangle(12.0, 15.0),
                new Triangle(1.0, 2.0, 3.0)
        };

        System.out.println("\n=== Рисуем все фигуры ===");
        for (Drawable shape: shapes) {
            shape.draw();
        }

    }
}
