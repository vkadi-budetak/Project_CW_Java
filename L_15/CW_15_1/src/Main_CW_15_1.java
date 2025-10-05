import java.util.Arrays;
import java.util.Scanner;

public class Main_CW_15_1 {
    public static void main(String[] args) {
        String[] names=new String[5];// создали исходный массив на 5 элементов
        System.out.println(Arrays.toString(names)); // проверили что в нем по умолчанию
        Scanner scanner=new Scanner(System.in); // подготовились к чтению из консоли

        for (int i=0; i<names.length; i+=1){ // запрашиваем в цикле имена под наш массив
            System.out.println("Enter name № "+i+":::");// подсказка - prompt
            names[i]=scanner.nextLine(); // считываем с консоли очередное значение
        }
        System.out.println(Arrays.toString(names)); // выводим результат

        System.out.println("====================================");
        // с консоли вводим целые значения и копим их произведение
        // если ввести 0 то заканчиваем ввод и печатаем результат
        int result=1, number=0; // готовлю переменные для последующего использования
        while (true){  //   бесконечно читаем числа с консоли пока не прилетит 0
            System.out.println("Enter next integer number (if 0 - Exit):"); // Prompt - запрос-подсказка
//            number= Integer.parseInt(scanner.nextLine()); // читаем строку и расшифровываем ее в целое число
            number=scanner.nextInt();  // читаем сразу целое число
            if (number==0) break; // если прилетел 0 то прерываем цикл
            result=result*number; // учитываем прилетевшее число в результате-произведении
        }
        System.out.println(result);
    }
}
