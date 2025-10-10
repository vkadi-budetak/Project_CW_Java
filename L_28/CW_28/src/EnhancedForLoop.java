import java.util.ArrayList;

public class EnhancedForLoop {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C++");
        languages.add("Kotlin");
        languages.add("Swift");

        System.out.println("=== Расширеный цикл for ===");
        // Простая итерация (только чтение)
        for (String lanquage : languages) {
            System.out.println("Языки програмирования: " + lanquage);
        }

        System.out.println("\n=== Подсчит символов ===");
        int totalCount = 0;
        for (String language : languages) {
            int currentLanguageLength = language.length();
            totalCount += language.length();
            System.out.println(language + " содержит " + currentLanguageLength + " символов") ;
        }
        System.out.println("Общее количество символов в списке - " + totalCount);

            //ВНИМАНИЕ: Нельзя изменять список во время for:each
//        for (String language : languages) {
//            if(language.equals("JavaScript")) {
//                language.remove(language); // ОШИБКА!!!!!!!
//            }
//        }



    }
}