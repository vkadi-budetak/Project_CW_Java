public class MainOopIntro {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        System.out.println(p1.name);
//        System.out.println(p1.age);
//        System.out.println(p1.id);
//        p1.name = "Vasya";
//        p1.age = 25;
//        p1.id = 123;
//        System.out.println(p1.name + " | " + p1.age + " | " + p1.id);
//
//        Person p2 = new Person();
//        p2.name = "Petya";
//        System.out.println(p2.name);
//        System.out.println(p1); // не виведе дані
//        p2.age = -555;
//        p2.id = -6666;
//        p2.name = p2.name + " дурак";
//        System.out.println(p2.name + " | " + p2.age + " | " + p2.id);

        Person p1 = new Person();
        Person p2 = new Person("Petya", 22, 124);
        System.out.println(p2.getName());
        p2.setName(null);
        System.out.println(p2.getName());
        p2.setAge(23);
        System.out.println(p2.getAge());
        System.out.println(p2);

        // СТВОРЮЄМО VASYA
        System.out.println(p1);
        p1.setName("Vasya");
        p1.setAge(33);
        p1.setId(123);
        System.out.println(p1);
        System.out.println(p1.myNameIs());
        System.out.println(p2.myNameIs());
        Person.sayHello();


    }
}
