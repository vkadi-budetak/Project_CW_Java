import java.util.ArrayList;
import java.util.function.*;

public class MainFunctionInterfaces {
    public static void main(String[] args) {
        //функциональный интерфейс
        System.out.println("== 1. public interface Predicate<T> {(boolean test(T t)} ==");
        // 1. public interface Predicate<T> {(boolean test(T t)}
        // бует проверять ли четное элемент
        Predicate<Integer> isEventNumber =  x-> x%2 ==0;

        System.out.println(isEventNumber.test(3));

        System.out.println("== 2. public interface Consumer<T> {void accept(T t)} ==");
        // 2. public interface Consumer<T> {void accept(T t)}
        Consumer<String> greeting =  x-> System.out.println("Hello " + x);
        greeting.accept("Lena");

        System.out.println("== 3. public interface supplier<T>{T get()} ==");
        // 3. public interface supplier<T>{T get()}
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Lena");
        nameList.add("Sveta");
        nameList.add("Katy");
        nameList.add("Olya");
        // хочу выдавать случайное имя из списка
        Supplier<String> randomName = ()-> {
            int value = (int)(Math.random()* nameList.size());
            return nameList.get(value);
        };
        System.out.println(randomName.get());

        System.out.println("== 4. public interface function<T,R> {R apply(T t)} ==");
        // 4. public interface function<T,R> {R apply(T t)}
        Function<String, Integer> valueConverter = x-> Integer.valueOf(x.replace(" ", ""));
        System.out.println(valueConverter.apply("12345"));

        System.out.println("== 5. public interface UnaryOperator<T> {T apply(T t)} ==");
        // 5. public interface UnaryOperator<T> {T apply(T t)}
        UnaryOperator<Integer> squareValue = x -> x*x;
        System.out.println(squareValue.apply(5));





    }
}