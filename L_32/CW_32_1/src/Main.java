import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static <ArraList> void main(String[] args) {
        /**
         * Рассматриваем МАССИВ строк и перебираем его
         */
        String[] arStr = {"str1", "str2", "str3"};
        //Перебираем и добираемся к элементу
        for (int i = 0; i < arStr.length; i++) {
            System.out.print(arStr[i] + " | ");
        }
        System.out.println();

        //или через for-each
        for (String s : arStr) {
            System.out.print(s + " ! ");
        }
        System.out.println();

        /**
        * КОЛЕКЦИИ - ArrayList (Iterator() next, hasNext, remove)
        */
        ArrayList<String> listStr = new ArrayList<>(Arrays.asList("str1", "str2", "str3"));
        System.out.println(listStr);
        //Перебираем и добираемся к элементу
        for (int i = 0; i < listStr.size(); i++) {
            System.out.print(listStr.get(i) + " $ ");
        }
        System.out.println();

        //или через for-each
        for (String s : listStr) {
            System.out.print(s + " $$ ");
        }
        System.out.println();





    }
}