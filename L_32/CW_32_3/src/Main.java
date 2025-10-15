import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * ИНТЕРФЕЙСЫ и работа с ними
         * */
        List<Person> list = List.of(
                new Person("Ivan", "Ivanov", 27, "ivan@gmail.com"),
                new Person("Petr", "Petrov", 37, "petr@gmail.com"),
                new Person("Sergey", "Sergeev", 47, "sergey@gmail.com"),
                new Person("Nikolay", "Nikolaev", 27, "nikolay@gmail.com")
        );
        System.out.println(list);
        System.out.println(personListHandler(list, new EmailExtractor()));
        System.out.println(personListHandler(list, new NameExtractor()));
        System.out.println(personListHandler(list, new SpecialFormatExtractor()));


    }
    //Создаю метод и вытягиваю информацию с List
    public static List<String> personListHandler(List<Person> list, PersonInfoExtractor extractor){
        List<String> result = new ArrayList<>();
        for (Person person : list){
            result.add(extractor.apply(person));
        }
        return result;
    };
}