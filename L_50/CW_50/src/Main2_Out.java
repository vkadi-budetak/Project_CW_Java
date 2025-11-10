import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Современный синтексис
 */
public class Main2_Out {
    public static void main(String[] args) {
        // новая конструкция записи
        String str = "hello java input/output!" +
                System.lineSeparator() + "bla-bla-bla ";
        // прокладываем канал для передачи данных
        // указываем по завершении работы оператора он будет закрыт
        try (OutputStream outputStream =
                     new FileOutputStream("file1.txt", true);) {
        // непосредственно передаем данные по кнаалу
            for (var b : str.getBytes()) {
                outputStream.write(b);
            }
        // пишем сценарий обработки Exception
        } catch (IOException e) {
            System.out.println("error!");
        }
    }
}