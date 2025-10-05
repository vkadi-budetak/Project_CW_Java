import java.util.Arrays;

public class MainArgsArrays {
    public static void main(String[] args) {
        int num1 = 20, num2 = 5;
        char action = '+';
        int result = calculator1(num1, num2, action);
        System.out.printf("%d %c %d = %d", num1, action, num2, result);

        System.out.println("===================Switch=====================");
        result = calculator2(num1, num2, action);
        System.out.printf("%d %c %d = %d", num1, action, num2, result);

        System.out.println("======================МАСИВИ===================");
        String[] arStr = {"Vasya", "Petya", "Kolya"};
        System.out.println(arStr[1]);
        System.out.println(arStr.length);
        arStr[0] = "Olya";


        System.out.println("1. " + arStr); // виводе дурницю(перше потрібо його пербрати, тоді побачимо масив)
        System.out.println("2. " + Arrays.toString(arStr)); // або через Arrays
        for (int i = 0; i < arStr.length; i = i + 1) {
            System.out.println("3. " + arStr[i]);
        }
        System.out.println();


        System.out.println("======================ARGS===================");
        System.out.println("Длина параметров-аргументов при запуске :" + args.length);
        System.out.println(Arrays.toString(args));
        if (args[1].equals("kivi")){
            System.out.println("Отлично");
        }
    }

    //оператор switch
    private static int calculator2(int num1, int num2, char action) {
        int res = 0;
        switch (action) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    res = num1 / num2;
                    break;
                } else {
                    res = 0;
                    System.out.println("Error, / 0");
                }
            default:
                System.out.println("Error, action not valid");
        }
        return res;
    }


    private static int calculator1(int num1, int num2, char action) {
        if (action == '+') {
            return num1 + num2;
        } else if (action == '-') {
            return num1 - num2;
        } else if (action == '*') {
            return num1 * num2;
        } else if (action == '/' && num2 != 0) { // and => &&, or => ||, not => !
            return num1 / num2;
        } else if (action == '/' && num2 == 0) {
            System.out.println("Error, /0");
            return 0;
        } else {
            System.out.println("Error, action not valid");
            return 0;
        }
    }
}
