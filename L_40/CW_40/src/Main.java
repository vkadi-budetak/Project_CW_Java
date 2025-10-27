import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("n1", "n2", "n3", "n4",
                "n1", "n2", "n3", "n4",
                "n1", "n2", "n3", "n4",
                "n1", "n2", "n3", "n4",
                "n3", "n4"
        );
        int n = 5;
        List<String> res = getMoreThen(list, n);
        System.out.println(res);


    }

    private static List<String> getMoreThen(List<String> list, int n) {
        List<String> result = new ArrayList<>();
        for(String str: new HashSet<>(list)){
            int count = 0;
            for(String s: list) {
                if (s.equals(str)){
                    count ++;
                    if (count >= n) break;
                }
            }
            if (count >= n) result.add(str);
        }
        return result;
    }
}


/*
1.Дан лист строк, необходимо получить лист из исходного листа,
со строками которые встречаются более 5 раз.
 */

