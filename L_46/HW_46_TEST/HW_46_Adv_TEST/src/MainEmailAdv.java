import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEmailAdv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String email = emailInput(scanner);
            System.out.println("Введенный email: "+email);
        } catch (NotCorrectEmailFormatExceptionAdv e){
            System.out.println("Введенный email:\"" +e.getInputEmail() + "\" не корректен. " + e.getMessage());
        }
        scanner.close();
    }
    public static String emailInput(Scanner scanner){
        System.out.println("Введите email:");
        String email = scanner.nextLine().trim();

        List<String> errList = new ArrayList<>();

        if(email.length()<5){
            errList.add("Длинна email не может быть меньше 5 символов");
            //throw new NotCorrectEmailFormatException("Длинна email не может быть меньше 5 символов", email);
        }
        if(!email.contains("@")){
            errList.add("email должен содержать '@'");
            //throw new NotCorrectEmailFormatException("email должен содержать '@'", email);
        }
        if(email.startsWith("@") || email.endsWith("@")){
            errList.add("email не должен начинаться или заканчиваться '@'");
            //throw new NotCorrectEmailFormatException("email не должен начинаться или заканчиваться '@'", email);
        }
        if(!errList.isEmpty()){
            throw new NotCorrectEmailFormatExceptionAdv(errList, email);
        }
        return email;
    }
}

/*
Создайте метод, который просит пользователя ввести email. Email считается корректным, если:
в нем не менее 5 символов,
есть символ ‘@’, он не должен быть первым или последним
Создайте свой NotCorrectEmailFormatException
Если пользователь ввел некорректную строку метод должен выкидывать  NotCorrectEmailFormatException.
В main сделайте обработку Exception

 */
