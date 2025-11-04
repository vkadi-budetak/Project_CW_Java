/**
 * Exception
 */

public class MyException extends RuntimeException {
    // RuntimeException - это ошибки которые мы можем обрабатывать

    // Конструктор
    public MyException(String message) {
        super(message);
    }
}
