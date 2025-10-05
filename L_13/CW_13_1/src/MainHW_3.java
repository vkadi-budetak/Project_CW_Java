public class MainHW_3 {
    public static void main(String[] args) {

        if (args.length == 0) {
            printAll();
            return;
        }

        for (String arg : args) {
            switch (arg.toLowerCase()) {
                case "byte":
                    System.out.println("byte: " + Byte.MIN_VALUE + " .. " + Byte.MAX_VALUE);
                    break;
                case "short":
                    System.out.println("short: " + Short.MIN_VALUE + " .. " + Short.MAX_VALUE);
                    break;
                case "int":
                    System.out.println("int: " + Integer.MIN_VALUE + " .. " + Integer.MAX_VALUE);
                    break;
                case "long":
                    System.out.println("long: " + Long.MIN_VALUE + " .. " + Long.MAX_VALUE);
                    break;
                case "float":
                    System.out.println("float: " + Float.MIN_VALUE + " .. " + Float.MAX_VALUE);
                    break;
                case "double":
                    System.out.println("double: " + Double.MIN_VALUE + " .. " + Double.MAX_VALUE);
                    break;
                case "char":
                    System.out.println("char: " + (int) Character.MIN_VALUE + " .. " + (int) Character.MAX_VALUE);
                    break;
                case "boolean":
                    System.out.println("boolean: " + Boolean.FALSE + " .. " + Boolean.TRUE);
                    break;
                default:
                    System.out.println(arg + " Wrong type");
            }
        }
    }

    private static void printAll() {
        System.out.println("byte: " + Byte.MIN_VALUE + " .. " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " .. " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " .. " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " .. " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " .. " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " .. " + Double.MAX_VALUE);
        System.out.println("char: " + (int) Character.MIN_VALUE + " .. " + (int) Character.MAX_VALUE);
        System.out.println("boolean: " + Boolean.FALSE + " .. " + Boolean.TRUE);
    }
}

/*
HW_13_TEXT

# Печать мин/макс значений примитивных типов по аргументам

## 🧵 Задание
Напишите приложение, которое печатает минимальное и максимальное значения для
указанных примитивных типов.

- Типы передаются строками в аргументах main (поддерживаются:
byte, int, short, long, char, float, double).
- Если аргументы пусты — выведите значения для всех 7 типов.
- Если встретился неизвестный тип — выведите сообщение: <аргумент> Wrong type.

Подсказки:

-128 ... 127   bite
-32768 ... 32767   short
-2147483648 ... 2147483647  int
-9223372036854775808 ... 9223372036854775807  long





 */
