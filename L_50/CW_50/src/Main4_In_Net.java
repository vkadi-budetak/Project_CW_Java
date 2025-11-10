import java.io.*;
import java.net.URL;

// ЧИТАЕМ С ИИНТЕРЕНТА

public class Main4_In_Net {
    public static void main(String[] args) {
//        try (InputStream fis = new FileInputStream("file1.txt");){ // открываю ресурс на чтения
        try (InputStream fis = new URL("https://www.cnet.com/news/") // читаем с интерента
                .openStream();
             OutputStream fos = new FileOutputStream("index.html")) // создаю канал
        {
            StringBuilder sb = new StringBuilder();
            int data;
            while ((data = fis.read()) != -1) { // читаем из источника и смотрим не кончилась ли инфа
                sb.append((char) data); // формируем строку для печати в консоль в учебных целях
                fos.write(data); // пишем в файл
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            System.out.println("read file error!");
        }
    }
}
