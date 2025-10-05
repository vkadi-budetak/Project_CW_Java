public class Main_CW_17_2 {
    public static void main(String[] args) {
        star();
        offset();
        int st = 5, off = 7;
        stars(st);
        offsets(off);
        System.out.println();
        line(off, st);
        System.out.println("----------------------");
        //квадрат
        square(off, st);
        System.out.println("----------------------");
        //триугольник
        triangle1(st);
        triangle2(st);
        triangle3(st);
        triangle4(st);
        System.out.println("----------------------");
        //Елка
        triangleTree1(st);
        triangleTree2(st);

    }

    private static void triangleTree2(int st) {
        for (int i = 1; i <= st; i++) { // ДОДЕЛАТЬ
            line((st - i)/2, i);
        }
    }

    private static void triangleTree1(int st) {
        for (int i = 1; i <= st; i++) {
            line(st - i, i * 2);
        }
    }

    private static void triangle4(int st) {
        for (int i = 1; i <= st; i++) {
            line(i - 1, st - i + 1);
        }
    }

    private static void triangle3(int st) {
        for (int i = 1; i <= st; i++) {
            line(0, st - i + 1);
        }
    }

    private static void triangle2(int st) {
        for (int i = 1; i <= st; i++) {
            line(st - i, i);
        }
    }

    private static void triangle1(int st) {
        for (int i = 1; i <= st; i++) {
            line(0, i);
        }
    }

    private static void square(int off, int st) {
        for (int i = 1; i <= st; i++) {
            line(off, st);
        }
    }

    private static void line(int off, int st) {
        offsets(off);
        stars(st);
        System.out.println();
    }

    private static void offsets(int off) {
        for (int i = 1; i <= off; i++) {
            offset();
        }
    }

    private static void stars(int st) {
        for (int i = 1; i <= st; i++) {
            star();
        }
    }

    private static void offset() {
        System.out.print("   ");
    }

    private static void star() {
        System.out.print("*  ");
    }
}
