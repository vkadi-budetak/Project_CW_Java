import java.util.Arrays;

public class MainStringTasks {
    public static void main(String[] args) {
                /*
Дана строка вида "Иван Иванович Иванов", ваша задача
получить строку вида И.И.Иванов
В исходной строке, слова разделены одним пробелом.
Проверять корректность исходных данных не нужно

*/
        String str1 = new String("Иван Иванович Иванов");
        System.out.println(str1);
        String resStr="";
        String[] arStr=str1.split(" ");
        resStr=arStr[0].charAt(0) + "." + arStr[1].charAt(0)+ "."+arStr[2];
        System.out.println(resStr);
        System.out.println("=================================");

        // развернем строку Hello  -> olleH
        str1="Hello";
        resStr="";
        for (int i=0; i<str1.length(); i++){
            resStr=str1.charAt(i) + resStr;
        }
        System.out.println(str1+ " -> " + resStr);

        System.out.println("========================");
        char[] charArray=str1.toCharArray(); // превратить строку в массив чаров
        System.out.println(Arrays.toString(charArray));

        System.out.println("========================");
        //        Дана строка вида "DE22023238822828228800" т.е.
        //        IBAN (международный номер банковского счета).
//                Ваша задача проверить корректность т.е.:
//        - длинна 22 символа
//                - начинается с "DE"
        String iban="DE22023238822828228800";
        boolean ibanIsCorrect= iban.length()==22 && iban.startsWith("DE");
        System.out.println(ibanIsCorrect);

        //        Дана строка вида "Иван Иванов"
        //        (т.е. два слова разделенные пробелом),
//        ваша задача переставить слова местами, т.е. получить строку
//        "Иванов Иван"

        String str5="Иван Иванов".trim();
        int index=str5.indexOf(" ");
        String strFirst=str5.substring(0,index);
        String strLast=str5.substring(index+1);
        resStr=strLast+ " " +strFirst;
        System.out.println(str5 + "  ->  "+ resStr);

        System.out.println("==================");
        str5="level11";
        boolean isPolindrom=true;
        for (int i=0, j=str5.length()-1; i<j; i++, j--)
            if (str5.charAt(i)!=str5.charAt(j)) isPolindrom=false;
        System.out.println(str5 + (isPolindrom ? " polindrom" : " not polindrom"));

        System.out.println("============================");
        //        Пользователь вводит e-mail (строка вида "blabla@mail.com").
        //        Напишите программу,
//                которая проверит, что введенная строка
//        - содержит символ '@', причем этот символ не первый и не
//        последний в веденной строке
//        - содержит символ '.'
//        Если строка корректна, то программа должна определить и распечатать
//        на каком сервере находится почта (т.е. часть строки после @)
        String email="blabla$mail.com";
        email=email.trim();
        boolean emailNotStartAndFinishWithAt= !(email.startsWith("@")) &&
                !(email.endsWith("@"));
        boolean emailContainsDotAndAt=email.contains(".") && email.contains("@");
        if (emailNotStartAndFinishWithAt && emailContainsDotAndAt){
            System.out.println(email.substring(email.indexOf("@")+1));
        }
        else System.out.println("string not correct");







    }
}

