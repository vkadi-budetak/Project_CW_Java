public class NumberLessMinException extends RuntimeException {

    // Делаем конструкто из передачей сообщения
    public NumberLessMinException(String message) {
        super(message);
    }
}
