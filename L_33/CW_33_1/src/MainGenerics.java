import java.util.List;

public class MainGenerics {
    public static void main(String[] args) {
        // вызываем box1
        Box<String> stringBox = new Box<>("qwerty");
        System.out.println(stringBox);

        Box<Person> personBox = new Box<>(new Person("Jack", 10));
        System.out.println(personBox);
        System.out.println("=======================");
// вызываем box2
        Box2<Integer, Person> box2 = new Box2<>(111,
                new Person("John", 33));
        System.out.println(box2);
        System.out.println("=========================");
// вызываем box3
        Box3<String> stringBox3 = new Box3<>("Jack",
                List.of("Vasya", "Petya", "Jack"));
        stringBox3.print();
        System.out.println(stringBox3);
        System.out.println(stringBox3.myContains());

        Person p1 = new Person("name1", 10);
        Person p2 = new Person("name2", 20);
        Person p3 = new Person("name3", 30);

//        Box3<Person> personBox3= new Box3<>(p2,List.of(p1,p2,p3));
        Box3<Person> personBox3 = new Box3<>(new Person("name2", 20),
                List.of(p1, p2, p3));
        personBox3.print();
        System.out.println(personBox3);
        System.out.println(personBox3.myContains());

        // вызываем box4
        Box4<Double> doubleBox4 = new Box4<>(3.14, 12.5);
        System.out.println(doubleBox4);
        System.out.println(doubleBox4.mult());
        System.out.println(doubleBox4.compareBox4());

        // вызываем box5
        Box5<String> stringBox5 = new Box5<>(List.of("vasya", "petya", "kolya"));
        System.out.println(stringBox5);
        System.out.println(stringBox5.mySort());
        System.out.println(stringBox5);

    }
}

/**
 * // вызываем box2
 * E - element
 * T - Type
 * K - key
 * V - value
 * R - result
 * U,W....
 */