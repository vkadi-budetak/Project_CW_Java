// программист занятый
public class ProgrammerBusyException extends RuntimeException {

    // Делаем конструкто из передачей сообщения
    public ProgrammerBusyException(String message) {
        super(message);
    }
}
