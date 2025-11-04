public class NumberGreaterMaxException extends RuntimeException {

    // Делаем конструкто из передачей сообщения
    public NumberGreaterMaxException(String message) {
        super(message);
    }
}
