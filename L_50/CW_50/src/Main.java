import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        // РОБОТА С EXCEPTION без прокидывания

        OutputStream outputStream = null;
        String str = "hello java input/output!";
        try{
            outputStream = new FileOutputStream("file1.txt"); // создаю канал по которому буду передавать информацию

            for (var b: str.getBytes()) { // передаю данные
                outputStream.write(b);
            }

        } catch (IOException e) {
            System.out.println("error!");
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                System.out.println("не получилось закрыть поток");
            }

        }


    }
}
