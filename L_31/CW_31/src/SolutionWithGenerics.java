import java.util.ArrayList;
import java.util.List;

public class SolutionWithGenerics {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Строка");
        //stringList.add(42);

        for (String str : stringList){
            System.out.println(str.toUpperCase());
        }
    }
}
