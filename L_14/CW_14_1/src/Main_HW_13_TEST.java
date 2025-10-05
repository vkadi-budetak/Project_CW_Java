
public class Main_HW_13_TEST {
    public static void main(String[] args) {
        System.out.println("Data type    Min value   Max value");
        if (args.length == 0){
            String[] args1={"byte", "int", "short", "long",
                    "char", "float", "double"};
            args=args1;
        }

        for (int i=0; i<args.length;i=i+1){ // i+=1  i++
            switch (args[i]){
                case "byte":
                    System.out.println("byte\t\t"+ -128+"\t"+127);
                    break;
                case "int":
                    System.out.println("int\t\t"+Integer.MIN_VALUE+
                            "\t" + Integer.MAX_VALUE);
                    break;
                case "short":
                    System.out.println("short\t\t"+Short.MIN_VALUE+
                            "\t" + Short.MAX_VALUE);
                    break;
                case "long":
                    System.out.println("long\t\t"+Long.MIN_VALUE+
                            "\t" + Long.MAX_VALUE);
                    break;
                case "char":
                    System.out.println("char\t\t"+(int)Character.MIN_VALUE+
                            "\t" + (int)Character.MAX_VALUE);
                    break;
                case "float":
                    System.out.println("float\t\t"+Float.MIN_VALUE+
                            "\t" + Float.MAX_VALUE);
                    break;
                case "double":
                    System.out.println("double\t\t"+Double.MIN_VALUE+
                            "\t" + Double.MAX_VALUE);
                    break;
                default:
                    System.out.println(">>>>>>>>" +args[i]+"\t"+
                            " Wrong type");
            }

        }

    }
}

/*
HW_13_TEXT

# Печать мин/макс значений примитивных типов по аргументам

## 🧵 Задание
Напишите приложение, которое печатает **минимальное и максимальное** значения для указанных примитивных типов.

- Типы передаются строками в аргументах `main` (поддерживаются: `byte`, `int`, `short`, `long`, `char`, `float`, `double`).
- Если аргументы пусты — выведите значения **для всех 7 типов**.
- Если встретился неизвестный тип — выведите сообщение: `<аргумент> Wrong type`.

Подсказки:

-128 ... 127   bite
-32768 ... 32767   short
-2147483648 ... 2147483647  int
-9223372036854775808 ... 9223372036854775807  long





 */
