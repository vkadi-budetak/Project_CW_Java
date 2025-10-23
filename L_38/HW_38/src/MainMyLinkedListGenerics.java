/**
 * Работа с LinkedLIST
 */
public class MainMyLinkedListGenerics {
    public static void main(String[] args) {
        MyListGenerics myList = new MyLinkedListGenerics();
        myList.add("str1");
        myList.add("str2");
        myList.add("str3");
        myList.add("str4");

        System.out.println(myList.size());
        myList.print();
        System.out.println("-----------------");
        System.out.println(myList.get(1));
        System.out.println("-----------------");
        System.out.println(myList.remove(1));
        System.out.println("-----------------");
        myList.print();
    }
}

// HW_37_TEXT
// доработать данный класс под дженерики, чтобы он работаел не только со строками,
// но и с любими другими обьектами...
// adv.
// сделать служебный класс Node вложенным классом
