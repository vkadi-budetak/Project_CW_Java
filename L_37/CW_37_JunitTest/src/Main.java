
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str11 = new String("Hello");
        String str12 = new String("Hello");

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str11); // false
        System.out.println(str11.equals(str12)); // true

        Integer i1 = 25;
        Integer i2 = 25;
        System.out.println(i1 == i2); // true [-128...127]
        i1 = 999999;
        i2 = 999999;
        System.out.println(i1 == i2); // false
        System.out.println(i1.equals(i2)); // true

    }
}