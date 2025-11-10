import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainOutIntro {
    public static void main(String[] args) throws IOException {
        // Создаем файл и записываем в нем инфу
        OutputStream out = new FileOutputStream("hello.txt"); // выдает ошибку и я прокидую Exception через throws IOException
        String str = "Hello world!";
        out.write(str.getBytes()); // получаем набор байтов
        str = "Bye-bye";
        out.write(str.getBytes());

        out = new FileOutputStream("Hello1.txt", true); // должен разрешать добавления после каждого обновления
        out.write(str.getBytes());


    }
}