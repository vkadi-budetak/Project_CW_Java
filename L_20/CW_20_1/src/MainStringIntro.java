import java.util.Arrays;

public class MainStringIntro {
    public static void main(String[] args) {
        System.out.println("=============String==============");
        String str1 = "Hello!";
        //             012345    len = 6;
        System.out.println(str1 + str1.length());

        String str2 = "Java world";
        String str3 = str1 + str2;
        System.out.println(str3);
        str3 = str3 + 555;
        System.out.println(str3);
        str3 = str1.concat(str2); /// конкатенация строк(как и + работает) не работает с null
        System.out.println(str3);

        str1 = str1.repeat(5);  /// str1.repeat() повторить 5 раз
        System.out.println(str1);
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        str2="Java world";
        System.out.println(str2.contains("Java")); /// проверяет ли есть значения?
        str3 = "java world";
        System.out.println(str2.equalsIgnoreCase(str3)); /// проверяет ли есть значения также игнорируя большие буквы?
        str2="      Java world      ";
        System.out.println(str2 + " => " + str2.length());
        str2=str2.trim();                                /// trim() - убирает пробелы в начале или конце
        System.out.println(str2 + " => " + str2.length());
        System.out.println(str2.startsWith("Java"));   /// Проверяет ли начинается строка из "Java"
        System.out.println(str2.endsWith("rld"));   /// Проверяет ли заканчивается строка на "rld"

        str2="Java World";
        System.out.println(str2.substring(5));   /// подстрака начиная с индекса
        System.out.println(str2.substring(3,7));    /// подстрака начиная с 3 и заканчивая 7
        int res = str2.indexOf("Wor");
        System.out.println(res);    /// поиск индекса подстроки
        res = str2.indexOf("a", 2);
        System.out.println(res);  /// поиск вхождения после данного индекса
        System.out.println(str2.length()-1); /// индекс последнего элемента

        char ch = str2.charAt(0);      /// поиск символа по индексу из строки
        System.out.println("ch=" + ch);
        System.out.println(str2.replaceAll("a", "QQQ")); /// замена всех вхождений
        System.out.println(str2.replace("a", "555"));   /// замена всех вхождений
        System.out.println(str2.replace('a', 'A'));      /// замена всех вхождений

        System.out.println(str2.isEmpty());  /// проверка строки на пустоту или на null
        str3=null;
//        System.out.println(str3.isEmpty()); ERROR
        System.out.println(str2.isBlank()); /// проверает строку непустая ли она
        System.out.println("        ".isBlank());

        String str5 = "Hello my world !!!!";
        String[] world = str5.split(" "); /// РАЗБИТЬ И ЗАПИСАТЬ В МАССИВ !!!!
        System.out.println(Arrays.toString(world));
        String str6 = "Hello-my-world-!!!!";
        String[] abc = str6.split("");    /// разбить по пустому делиметру - набор символов подстрок
        System.out.println(Arrays.toString(abc));


    }
}