import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int id;
    private double age;

    public Person(String name, int id, double age) {
        if (name != null && !name.isBlank()) this.name = name;
        else System.out.println("Error, name is null");
        this.id = id; // ??????????
        this.setAge(age); /// ЛУЧШИЙ ВАРИАНТ
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.isBlank()) this.name = name;
        else System.out.println("Error, name is null");
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if(id>0) this.id = id;
        else System.out.println("Error, id negativ");
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        if (age>0 && age< 120) this.age = age;
        else System.out.println("Error, age not valid!!!!!!");
    }


    @Override
    public String toString() {
        return "name: " + name + '\'' +
                ", id: " + id +
                ", age: " + age;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;

        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return id;  // inmutable
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
