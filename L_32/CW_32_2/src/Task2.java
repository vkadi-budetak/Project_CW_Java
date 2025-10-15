import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,4);
        List<Integer> list2 = List.of(5,2,3,4);

        List<Boolean> compareRes = compareList(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(compareRes);

    }

    private static List<Boolean> compareList(List<Integer> list1, List<Integer> list2) {
      List<Boolean> result = new ArrayList<>();
      Iterator<Integer> iterator1 = list1.iterator();
      Iterator<Integer> iterator2 = list2.iterator();

      while (iterator1.hasNext() && iterator2.hasNext()){
          result.add(
                  iterator1.next().equals(iterator2.next())
          );
      }
      return result;
    };
}

/**
 * Есть два списка одинаковой длины с числами. Написать метод, который
 * вернет список с элементами True или False, где значение на i-том месте
 * зависит от того, равны ли элементы двух списков под номером i.
 * Например, {1, 2, 3, 4} и {5, 2, 3, 8} вернет {False, True, True, False}
 */