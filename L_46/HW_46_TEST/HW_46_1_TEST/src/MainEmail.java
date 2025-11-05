import java.util.Scanner;

public class MainEmail {
    public static void main(String[] args) {
        System.out.println("======== 1. ========");
        try {
            String email = enterEmail1();
            System.out.println("Корректный email: " + email);
        } catch (NotCorrectEmailFormatException e) {
            System.out.println("Ошибка: \n" + e.getMessage());
        }

    }
// ЛУЧШЕ ПИСАТЬ ТАК!!!!!!!!!!!!!!!!
    public static String enterEmail1() throws NotCorrectEmailFormatException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите email: ");
        String email = sc.nextLine().trim();
        String messageError="";
        if (email.length() < 5) {
            messageError+="Email слишком короткий (менее 5 символов)\n";
        }
        if (!email.contains("@")) {
            messageError+="Email должен содержать символ '@'\n";
        }
        if (email.startsWith("@") || email.endsWith("@")) {
            messageError+="Символ '@' не может быть первым или последним";
        }

        if (!messageError.isBlank())
            throw new NotCorrectEmailFormatException(messageError);

        return email;
    }

    public static String enterEmail() throws NotCorrectEmailFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите email: ");
        String email = sc.nextLine().trim();

        if (email.length() < 5) {
            throw new NotCorrectEmailFormatException("Email слишком короткий (менее 5 символов)");
        }
        if (!email.contains("@")) {
            throw new NotCorrectEmailFormatException("Email должен содержать символ '@'");
        }
        if (email.startsWith("@") || email.endsWith("@")) {
            throw new NotCorrectEmailFormatException("Символ '@' не может быть первым или последним");
        }

        return email;
    }
}
/*
1
Создайте метод, который просит пользователя ввести email.
Email считается корректным, если:
в нем не менее 5 символов,
есть символ ‘@’, он не должен быть первым или последним
Создайте свой класс NotCorrectEmailFormatException
Если пользователь ввел некорректную строку метод должен выкидывать
NotCorrectEmailFormatException.
В main сделайте обработку Exception
*/