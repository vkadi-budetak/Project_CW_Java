public class NotCorrectEmailFormatException extends RuntimeException {

    // Делаем конструкто из передачей сообщения
    public NotCorrectEmailFormatException(String message) {
        super(message);
    }
}
