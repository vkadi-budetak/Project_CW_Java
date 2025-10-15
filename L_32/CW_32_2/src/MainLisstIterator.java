import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainLisstIterator {
    public static void main(String[] args) {
        //Итерируем List
        List<String> list = new LinkedList<>();
        list.add("qwert0");
        list.add("qwert1");
        list.add("qwert2");
        list.add("qwert3");
        list.add("qwert4");
        System.out.println(list);

        //Пройдемся по List и удалим строку
        String delStr="qwert2";
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            if(element.equals(delStr)) {
                iterator.remove();
            }
        }
        System.out.println(list);

        //Перебираем и печатаем каждый элеммент
        for (String s : list){
            System.out.println(s);
        }

        for (Iterator<String> iterator1=list.iterator();
        iterator1.hasNext(); ){
            String element = iterator.next();
            System.out.println("> " + element);
        } // плохая форма записи итератора!!!!!!!!!

    }
}