import java.util.LinkedHashMap;
import java.util.Map;

public class Main_HW_14 {
    public static void main(String[] args) {
        String[] names = {"byte", "short", "int", "long", "char",
                "float", "double"};

        String[] minValues = {String.valueOf(Byte.MIN_VALUE),
                String.valueOf(Short.MIN_VALUE),
                String.valueOf(Integer.MIN_VALUE),
                String.valueOf(Long.MIN_VALUE),
                String.valueOf((int) Character.MIN_VALUE),
                String.valueOf(Float.MIN_VALUE),
                String.valueOf(Double.MIN_VALUE)};

        String[] maxValues = {String.valueOf(Byte.MAX_VALUE),
                String.valueOf(Short.MAX_VALUE),
                String.valueOf(Integer.MAX_VALUE),
                String.valueOf(Long.MAX_VALUE),
                String.valueOf((int) Character.MAX_VALUE),
                String.valueOf(Float.MAX_VALUE),
                String.valueOf(Double.MAX_VALUE)};

        if (args.length == 0) args = names;

        System.out.println("Data type:\t\t\tMin Value:\t\tMax value:");
        for (int i = 0; i < args.length; i++) {
            boolean found = false;
            for (int j = 0; j < names.length; j++) {
                if (args[i].equals(names[j])) {
                    System.out.printf("%s \t\t %s \t\t  %s  \n",
                            names[j], minValues[j], maxValues[j]);
                    found = true;
                    break;
                }
            }
            if (!found)
                System.out.println("Wrong data type name: " + args[i]);
        }
    }
}

// -> More Run/Debug -> Modify Run Configuration

       /*
      4.
        # Мин/макс значений без switch/case и с ограничением по if

        ## 🧵 Задание
        Напишите приложение, которое печатает **минимальное и максимальное** значения примитивных типов,
указанных в аргументах `main`.
Не используйте `switch/case`. Разрешено не более **трёх** операторов `if`.
Поддерживаемые типы: `byte`, `short`, `int`, `long`, `char`, `float`, `double`.
Если аргументов нет — выведите сведения для всех поддерживаемых типов. Для неизвестного
типа выведите `<аргумент> Wrong type`.

        */
