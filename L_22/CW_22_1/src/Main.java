public class Main {
    public static void main(String[] args) {
        Person p1=new Person("Jack",123);
        Person p2=new Person("John",124);
        Person p3=new Person("Bob",125);

        Person[] people = {p1,p2,p3};
        Team myTeam= new Team(people);
        System.out.println(myTeam);

        System.out.println("=============================");
        Team2 myTeam2=new Team2();
        myTeam2.add(p1);
        myTeam2.add(p3);
        System.out.println(myTeam2);
        System.out.println(">>>>>>>>>>"+myTeam2.get(0));


    }
}
