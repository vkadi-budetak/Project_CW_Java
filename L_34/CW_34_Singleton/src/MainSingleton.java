public class MainSingleton {
    public static void main(String[] args) {
        Singleton mySingleton = Singleton.INSTANCE;
        System.out.println(mySingleton);
        System.out.println(mySingleton.getTitle());
        mySingleton.setTitle("qwert");
        System.out.println(mySingleton);

        // Работаем со Singleton2
        Singleton2 qwerty = Singleton2.getInstance("qwerty");
        System.out.println(qwerty);
        // Перезаписать не получится , полуим старою ссілку из qwerty
        Singleton2 qwerty2 = Singleton2.getInstance("Vasya");
        System.out.println(qwerty2);
    }
}