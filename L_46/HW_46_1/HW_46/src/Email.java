public class Email {
    private String email;

    // создаю конструктор
    public Email(String email) {
        validateEmail(email); // создаю метод и выношу проверку
        this.email = email;
    }

    private void validateEmail(String e) {
        if (e.length() < 5) {
            throw new NotCorrectEmailFormatException(e + " Длина Email меньше 5 символов!");
        }
        if (!e.contains("@")) {
            throw new NotCorrectEmailFormatException(e + " Отсутсвует символ `@` ");
        }
        if (e.indexOf("@") == 0) {
            throw new NotCorrectEmailFormatException(e + " Символ `@` не должен быть на первом месте!");
        }
        if (e.indexOf("@") == e.length() - 1){
            throw new NotCorrectEmailFormatException(e + " Символ `@` не должен быть на последнем месте!");
        }
    }
}
