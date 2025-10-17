/**
 * Создаю Singleton
 */
public class Singleton {
    private String title;

    // Создаю Singleton
    public static final Singleton INSTANCE =
            new Singleton("Hello");

    // Конструктор
    public Singleton(String title) {
        this.title = title;
    }

    //Геттеры и Сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "title='" + title + '\'' +
                '}';
    }
}
