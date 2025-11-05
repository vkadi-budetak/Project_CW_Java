// программист недоступен
public class ProgrammerUnavailableNowException extends RuntimeException {

    // Делаем конструкто из передачей сообщения
    public ProgrammerUnavailableNowException(String message) {
        super(message);
    }
}
