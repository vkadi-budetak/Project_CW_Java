import java.util.Collections;
import java.util.List;

//создаю каркас утилитарного класса
public class ArrayUtils {
    private ArrayUtils() {} // Забороняет создание екземпляров

    // Создаем printArray
    public static <T> void printArray(List<T> list) {
        System.out.println(list == null ? "null" : list.toString());
    }

    public static <T> T getFirst(List<T> list) {
        if (list == null || list.isEmpty()) return null;
        return list.get(0);
    }

    public static <T> T getLast(List<T> list) {
        if (list == null || list.isEmpty()) return null;
        return list.get(list.size() - 1);
    }

    public static <T> void swap(List<T> list, int i, int j) {
        if (list == null)
            throw new IllegalArgumentException("list is null");
        int n = list.size();
        if (i < 0 || j < 0 || i >= n || j >= n)
            throw new IndexOutOfBoundsException("i=" + i + ", j=" + j + ", size=" + n);
        if (i == j) return; // нечего менять
        Collections.swap(list, i, j); // готовый утилинарный мтеод
    }

}

