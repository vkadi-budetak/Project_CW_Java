public interface Drivable {
    // все поля автоматически такие - public static final
    int MAX_SPEED = 200;
    String DEFAULT_TRANSMISSION = "Auto";


    // Абстрактные методы (public abstract по умолчанию)
    void drive();
    void brake(); // break

    // Dafault методы (по умолчанию)
    default void honk() { // сигнал
        System.out.println("Бииип-бииип");
    }

    // Static метод
    static void printMaxSpeed() {
        System.out.println("Максимальная скорость: " + MAX_SPEED + "км/ч");
    }

    // Private метод - только для использования внутри интерфейса
    private void logAction(String action) {
        System.out.println("[LOG] " + action);
    }

    // Будем выводить время
    private static String getTimestamp() {
        return java.time.LocalDateTime.now().toString();
    }
}
