import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProblemsBeforeGenerics {
    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add("Строка");  // добовляем строку
        list.add(42);       // можем добавить целое число
        list.add(3.14);     // можем добавить с плаваючей точкой


        // Возникает проблема: ОШИБКА ClassCastException после первого шага
        for (Object object : list){
            String str = (String) object;
            System.out.println(str.toUpperCase());
        }

    }
}