import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainInIntro {
    public static void main(String[] args) throws IOException {
        // открываем поток на вход
        InputStream in = new FileInputStream("hello.txt");
//        System.out.println(in.read()); // читаем с этого потока - выдаст 72
        System.out.printf("%c\n", in.read());
        System.out.printf("%c\n", in.read());
        System.out.printf("%c\n", in.read());
        System.out.printf("%c\n", in.read());
        System.out.printf("%c\n", in.read());

        // Var 1 - чтения
        // Проверяем ли есть что-то в файле
//        while (in.available() > 0) {
//            System.out.printf("%c", in.read());
//        }

        // Var 2 - чтения
//        int c;
//        while ((c=in.read())>0) // читать пока не получим -1
//            System.out.printf("%c", c);

        // Var 3 - чтения (через буфер)
        byte[] buffer = new byte[in.available()];
        in.read(buffer);
        System.out.println(new String(buffer));


    }
}
