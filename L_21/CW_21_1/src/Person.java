public class Person {
    private String name;
    private int age;
    private int id;

    public Person() { // Конструктор під одне поле
    }

    public Person(String name, int age, int id) { // Конструктор під всі поля
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person(String name) { // Конструктор під Name
        this.name = name;
    }

    // setter - менять
    // getter - читать
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        if(name!=null && !name.isBlank()) this.name = name;
    }

    public void setAge(int age) {
        if (age>0 && age <120) this.age = age;
    }

    public void setId(int id) {
        if (id > 0) this.id = id;
    }

    @Override
    public String toString() {     // - Виводе в строку мого Persone з надписом
        return ">>> " + "name=" + name +
                " age=" + age +
                " id=" + id;
    }

    public String myNameIs(){
        String result = "My name ist " + name + (this.age < 30 ? " привет" : " здравствуйте");
        return result;
    }

    public static void sayHello(){              // Статичний клас
        System.out.println("Hallo world!!!");
    }

}
