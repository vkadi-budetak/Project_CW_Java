/**
 * Другой вариант создания Singleton
 */
public class Singleton2 {
    private  String title;
    private static Singleton2 INSTANCE = null;

    //Констрктор , но меняю на private
    private Singleton2(String title) {
        this.title = title;
    }

    // Создаю метод
    public static Singleton2 getInstance(String title) {
        if (INSTANCE == null)
            INSTANCE = new Singleton2(title);
        return INSTANCE;
    } // pattern Factory - создания через метод - фабрика в данном случае делает
    // единственный экземпляр иначе возвращает ссылку на уже имеющийся


    @Override
    public String toString() {
        return "Singleton2{" +
                "title='" + title + '\'' +
                '}';
    }
}
