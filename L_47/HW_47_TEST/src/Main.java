import java.io.*;
import java.util.Arrays;

/**
 * ПОТОКИ
 */

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("file2"); // создаю первый узел
        System.out.println(file.exists()); // возвращает false - так как он пустой
        System.out.println(" create file " + file.createNewFile()); // создал в древе файл file2 !!!

        File file1 = new File("file2");
        System.out.println(" create file " + file1.createNewFile()); // создать с однаковым именнем невозможно

        File node = new File("dir1");
        node.mkdir();     // создаем дерикторию - папку dir

        File node1 = new File("dir1/dir2/dir3"); // создаем сложную структуру из папок в корне
        node1.mkdirs();

        File node2 = new File(node1, "file3"); // создаю файл в папке dir3
        node2.createNewFile();

        File node3 = new File("dir1/dir2", "file4");
        node3.createNewFile();

        File node4 = new File("dir1" + File.separator + "dir2", "file5");
        node4.createNewFile();

        //УДАЛЯЕМ ВСЕ
        node3.delete(); // file 4

        // печать содержимое директории
        printDir("dir1/dir2");
        printDir("."); // Переходжу на один уровень выше
        printDir(".."); // Переходжу на две ступеньки выше
        printDir("../.."); // Переходжу на три ступеньки выше




    }

    private static void printDir(String dirName) {
        File node = new File(dirName);
        if(!node.exists())
            throw new RuntimeException(dirName + "not exist");
        if (node.isFile()) // Проверяю ли моя node файл или нет
            throw new RuntimeException(dirName + " is file");
        else {
            String[] list = node.list();
            System.out.println(Arrays.toString(list));
        }
    }
}