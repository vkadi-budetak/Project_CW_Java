import java.util.ArrayList;

public class RemoveDemo {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        System.out.println(numbers);

        numbers.remove(1);

        System.out.println(numbers);

        Integer removeGrade = 2;
        numbers.remove(removeGrade);

        System.out.println(numbers);

        numbers.remove((Integer)1);

        System.out.println(numbers);

    }
}
