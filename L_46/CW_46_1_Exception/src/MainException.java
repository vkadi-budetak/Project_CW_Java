public class MainException {
    public static void main(String[] args) {

        int x = 10;
        if (x < 20)
            try {
                throw new MyException("Number x must be < 20");
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        System.out.println("==============================");

        try {
            method(); // метод бросает Exception
        } catch (IllegalAccessException e) {
            System.out.println("1. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("2. " + e.getMessage());
        }
        System.out.println("==============================");
        try {
            System.out.println(div(5,0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("расчет по умолчанию: " + div(5,1));
        }

        System.out.println("Main finish");

    }

    private static int div(int x, int y) throws RuntimeException {
        return x/y;
    }

    private static void method() throws IllegalAccessException {
        System.out.println("i am a method!!");
        throw new IllegalAccessException("illegal access!!"); // мы прописываем Exception и должны прописать названия throws IllegalAccessException
    }
}