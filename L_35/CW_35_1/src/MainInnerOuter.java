import java.util.Comparator;

public class MainInnerOuter {
    public static void main(String[] args) {

        OuterClass.InnerClass ic= new OuterClass.InnerClass();
        System.out.println(ic.sum());

        Person p=new Person("Vasya",10);
        Person.LoginPassword lp=p.new LoginPassword();
        System.out.println(lp.getLogin());
        System.out.println(lp.getPassword());

        Person.LoginPassword lp1=
                new Person("Petya",20).new LoginPassword();
        System.out.println(lp1.getLogin());
        System.out.println(lp1.getPassword());

        System.out.println("Пример работы с одноименными полями");
        lp.display();

        System.out.println("внутренний анонимный класс");
        Comparator<Person> comparatorByName=new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        System.out.println("Внутренний локальный класс");
        OuterLocal outerLocal=new OuterLocal();
        outerLocal.method();

    }
}