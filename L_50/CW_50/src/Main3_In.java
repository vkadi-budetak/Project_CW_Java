import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Современный синтексис
 */

public class Main3_In {
    public static void main(String[] args) {
        try (InputStream fis = new FileInputStream("file1.txt");){ // открываю ресурс на чтения
            StringBuilder sb = new StringBuilder();
            int data;
            while ((data = fis.read())!= -1){ // я буду читать все символы до -1
                sb.append((char)data);
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            System.out.println("read file error!");
        }
    }
}
