import java.util.Scanner;

public class Main_CW_16_1 {
    public static void main(String[] args) {
        int num1,num2,result;
        char action;
        long start=System.currentTimeMillis(); // вычесляем время от 1970 г

        System.out.println("============ calculator int if=====");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first int number:");
        String answer=scanner.nextLine();
        num1=Integer.parseInt(answer);
        System.out.println("Enter second int number:");
        answer=scanner.nextLine();
        num2=Integer.parseInt(answer);
        System.out.println("Enter action (+ - * /):");
        answer=scanner.nextLine().trim();// избавляемся от возможных пробелов  в начале и в конце строки
        action=answer.charAt(0); // получаю символ из строки под номером указанным в скобках = 0

        long finish=System.currentTimeMillis();
        System.out.printf("Ввод данных занял : %.3f секунды \n" , (finish-start)/1000.);

        result= calculator1(num1,num2,action);
        System.out.printf("%d %c %d = %d\n", num1,action,num2,result);

        result= calculator2(num1,num2,action);
        System.out.printf("%d %c %d = %d\n", num1,action,num2,result);

        result= calculator3(num1,num2,action);
        System.out.printf("%d %c %d = %d\n", num1,action,num2,result);

        result= calculator4(num1,num2,action);
        System.out.printf("%d %c %d = %d\n", num1,action,num2,result);

        System.out.println("=============== НЕ СЧИТАЙТЕ НИ ЧЕГО ЗА КОМПЬЮТЕР!!!! =====");
        int days=0;
        days=(int)(System.currentTimeMillis()/3600000l/24l); // не очень верно, я считал в уме
        days= (int)(System.currentTimeMillis()/1000/60/60/24); // так гораздо понятнее логика вычислений
        // милисекунды -> секунды -> минуты -> часы -> сутки

        System.out.printf("C начала компьютерной эры 01.01.1970 по сегодня прошло %d дней\n", days);


    }

    private static int calculator4(int num1, int num2, char action) {
        if (action=='+') return num1+num2;
        else if (action=='-') return num1-num2;
        else if (action=='*') return num1*num2;
        else if (action=='/') return num2!=0 ? num1/num2 : 0;
        else {
            System.out.println("Action not valid "+action);
            return 0; // вынужденный возврат
        }
    }

    private static int calculator3(int num1, int num2, char action) {
        int result=0;

        if (action=='+') result = num1+num2;
        else if (action=='-') result = num1-num2;
        else if (action=='*') result = num1*num2;
        else if (action=='/') result = num2!=0 ? num1/num2 : 0;
        else
            System.out.println("Action not valid "+action);

        return result; // единственный возврат
    }

    private static int calculator2(int num1, int num2, char action) {
        int result=0;
        if (action=='+') result = num1+num2;
        if (action=='-') result = num1-num2;
        if (action=='*') result = num1*num2;
        if (action=='/') result = num2!=0 ? num1/num2 : 0;
        if (action!='+' && action!='-' && action!='*' && action!='/')
            System.out.println("Action not valid "+action);
        return result; // единственный возврат
    }

    private static int calculator1(int num1, int num2, char action) {
        if (action=='+') return num1+num2;
        if (action=='-') return num1-num2;
        if (action=='*') return num1*num2;
        if (action=='/') return num2!=0 ? num1/num2 : 0;
        System.out.println("Action not valid "+action);
        return 0; // вынужденный возврат
    }
}

/*

# SWITCH: калькулятор с double

## ➕ Задание
Реализуйте калькулятор над числами `double` с операциями `+ - * /`.
Оператор выбирается через `switch`. Выведите результат.

 */
