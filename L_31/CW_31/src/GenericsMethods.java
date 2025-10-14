public class GenericsMethods {

    //Обычный параметризованный метод
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T, U> void printPair(T first, U second) {
        System.out.println("Первый: " + first + " (" + first.getClass().getSimpleName() + ")");
    }


}
