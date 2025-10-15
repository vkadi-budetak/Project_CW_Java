public class Task {
    public static void main(String[] args) {
        IterableString iterableString = new IterableString(
                "Сделайте этот класс Iterable и реализуйте итератор таким образом"
        );
        System.out.println(iterableString);

        for (String str : iterableString)
            System.out.println(str.toUpperCase());
    }
}
