import java.util.List;

public class MainShape {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(5),
                new Square(5),
                new Rectangle(10,5),
                new Square(2)
        );

        System.out.println(shapes);
        // Нормальный вывод
        for (Shape shape: shapes){
            System.out.println(shape);
        }
        System.out.println("=======================");

        //Метод который проходит и считает общую площадь
        System.out.printf("TotalArea : %.4f" , totalArea(shapes));



    }

    private static double totalArea(List<Shape> shapes) {
       double result = 0;
       for (Shape shape:shapes){
           result += shape.calcArea();
       }
       return result;
    }
}


/**
 * /*
 * Реализовать 3 класса геометрических фигур: круг,
 * квадрат и прямоугольник. Круг определяется радиусом,
 * квадрат и прямоугольник своими сторонами.
 * В каждом классе должен быть метод расчета площади фигуры.
 *
 * В main создать arraylist из нескольких разных
 * фигур и посчитать суммарную площадь всех фигур в arrayList
 *
 *
 */