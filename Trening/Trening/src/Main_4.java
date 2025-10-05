public class Main_4 {
    public static void main(String[] args) {
        System.out.println("=======1======");
        int a = 5;
        int b = 3;
        printRangeIncl(a, b);

        System.out.println("=======2======");
        sumRange(a,b); // 3 і 5 -> 12


    }

    private static void sumRange(int a, int b) {
        int sum = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (int i = a; i >= b; i--) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static void printRangeIncl(int a, int b) {
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
    }
}