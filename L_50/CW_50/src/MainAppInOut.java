import java.io.*;
import java.net.URL;

// Solution 1,2 tasks

public class MainAppInOut {
    public static void main(String[] args) {
        writeString("Jeff,jeff@mail.com,23;Jack,jack@mail.com,45;Nick,nick@mail.com,24;Oleg,oleg@mail.com,22");
        copyFile("example.txt", "example2.txt");
        copyForUrlToFile("https://www.cnet.com/news/", "example3.txt");
    }

    private static void copyForUrlToFile(
            String url, String target) {
        try (InputStream fis = new URL(url).openStream();
             OutputStream fos = new FileOutputStream(target)
        )
        {
            copy(fis,fos);
        } catch (IOException e) {
            System.out.println("Error!!!");
        }

    }

    private static void copyFile(String sourse, String target) {
        try (InputStream fis = new FileInputStream(sourse); // указываем ресурсы
             OutputStream fos = new FileOutputStream(target)
        ) {
//            int data;
//            while ((data= fis.read())!=-1){
//                fos.write(data);
//            }
            copy(fis, fos);
        } catch (IOException e) {
            System.out.println("Error");
        }

    }

    // универсальный метод который копирует значения
    public static void copy(InputStream is, OutputStream os) throws IOException {
        int data;
        while ((data = is.read()) != -1) {
            os.write(data);
        }
    }

    private static void writeString(String str) {
        // создаем example.txt, открываем ресурс и записываем строку в файл
        try (OutputStream fos = new FileOutputStream("example.txt")) {
            for (int b : str.getBytes()) {
                fos.write(b);
            }
        } catch (IOException e) {
            System.out.println("что-то пошло не так!");
        }
    }
}

/*
1
Используя FileOutputStream создать на диске файл example.txt,
который должен содержать строку:
Jeff,jeff@mail.com,23;Jack,jack@mail.com,45;Nick,nick@mail.com,24;Oleg,oleg@mail.com,22
2
Используя FileInputStream и FileOutputStream,
создайте на диске example2.txt - копию файла example.txt;
3
Напишите программу, которая читает файл example.txt  и формирует
список Person(String name,String email,int age)
Подсказка 1: в исходной строке поля разделены ',' а объекты ';'
Подсказка 2: преобразование возраста из строки в int - Integer.parseInt()
Подсказка 2: преобразование возраста из строки в int - Integer.parseInt()
(и кстати, там может быть Exception)
 */