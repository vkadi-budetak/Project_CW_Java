public class Calculator {
    public int add(int a, int b) {
        // Метод для сложения двух целых чисел
        System.out.println("Вызов: add(int, int)");
        return a + b;
    }

    // Перегруженный метод для сложения трех целых чисел
    public int add(int a, int b, int c){
        System.out.println("Вызов: add(int, int, int)");
        return a + b + c;
    }

    // Перегруженный метод для сложения двух чисел с плавающей точкой
    public double add(double a, double b ){
        System.out.println("Вызов: double(int, int)");
        return a + b;
    }
}