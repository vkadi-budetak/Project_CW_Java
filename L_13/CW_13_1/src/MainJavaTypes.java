public class MainJavaTypes {
    public static void main(String[] args) {
        byte b1 = 127, b2 = 5, resB; // [] -128...127
        resB = (byte) (b1 + b2);
        System.out.println(resB);

        short sh1 = 32000; // [] [] -32.xxx .... 32.xxx

        // працюємо Integer
        int i1 = 1_500_000_000, i2 = 1_000_000_000;
        // [] [] [] [] -2.147.xxx.xxx .... 2.147.xxx.xxx
        System.out.println("Integer " + i2 + " " + i2 + " " + (i1 + i2));

        long l1 = 123456789876L; // [] [] [] []  [] [] [] []
        System.out.println(l1);

        char ch1 = 'A', ch2 = 66; // [] []
        System.out.println("My chars " + ch1 + " " + ch2);

        // працюємо double
        double pi = 3.14158; // [] [] [] []  [] [] [] []
        System.out.println(pi);

        float fl1 = 0.1234F; // [] [] [] []
        System.out.println(fl1);

        // BOOLEAN
        boolean bl1 = true; // []
        System.out.println(!bl1);

        // STRING
        String str1 = "Hello";
        String str2 = "Bye";
        String resStr = str1.toLowerCase() + "\t" + str2.toUpperCase();
        System.out.println(resStr.repeat(5));
        System.out.println(str2.equals("Bye")); // порівнювати потрібно через equals
        System.out.println(str1.equalsIgnoreCase("hello")); // порівнювати потрібно через equals

    }
}

