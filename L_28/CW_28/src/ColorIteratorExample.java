import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ColorIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("красный");
        colors.add("зеленый");
        colors.add("синий");
        colors.add("желтый");
        colors.add("фиолетовый");
        colors.add("желтый");

        System.out.println("Исходный список цветов: "  +colors);

        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println("Цвет: " + iterator.next());
        }

        Iterator<String> removeIterator = colors.iterator();
        while (removeIterator.hasNext()) {
            String color = removeIterator.next();
            if (color.equals("желтый")) {
                removeIterator.remove();
                System.out.println("Удалили: " + color);
            }
        }
        System.out.println("После удаления: " + colors);

        System.out.println("---------------------------");
        ListIterator<String> listIterator = colors.listIterator();
        while(listIterator.hasNext()) {
            System.out.println("Индекс " + listIterator.nextIndex() + ": " + listIterator.next());
        }
        System.out.println("---------------------------");
        while(listIterator.hasPrevious()) {
            System.out.println("Индекс " + listIterator.nextIndex() + ": " + listIterator.previous());
        }
    }

}
