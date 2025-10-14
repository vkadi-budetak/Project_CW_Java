// Создание собственного параметризованного класса
public class Box<T> {   // Box<String>
    private T content;  // T - параметр типа

    // Конструктор
    public Box(T content) {
        this.content = content;
    }

    // Геттер
    public T getContent() {
        return content;
    }

    // Сеттер
    public void setContent(T content) {
        this.content = content;
    }

    // Метод для отображения информации
    public void displayInfo() {
        System.out.println("Содержимое: " + content +
                "(тип: " + content.getClass().getSimpleName() + ")");
    }

    /**
     * Параметризованный метод, возвращающий параметризованный тип
     * @param item - аргумент метода, который определяет тип U
     * @return
     * @param <U>
     */
    public static <U> Box<U> createBox(U item) {
        System.out.println("Создание коробки с типом: " + item.getClass().getSimpleName());
        return new Box<>(item);
    }
}
