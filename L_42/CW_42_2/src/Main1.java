import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        // нужно перемешать массив
        int[] array = {1,2,3,4,5,6,7,8,9};
        displayArrayShaffled(array);
        System.out.println("===================");
        sportLotto(1, 35, 5);


    }

    private static void displayArrayShaffled(int[] ar) {
        new Random().ints(0, ar.length)
                .distinct() // уникальность элемента
                .limit(ar.length)
                .forEach(i-> System.out.println(ar[i] + " ")); // Consumer - Interfaces
    }

    private static void sportLotto(int min, int max, int count) {
        new Random().ints(min, max+1)
                .distinct() // уникальность элемента
                .limit(count)
                .forEach(System.out::println);

    }
}
