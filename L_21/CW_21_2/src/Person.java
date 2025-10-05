public class Person {
    private String name;
    private String license;
    private int id;

    public Person() {
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person(String name, String license, int id) {
        this.name = name;
        this.license = license;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", license='" + license + '\'' +
                ", id=" + id +
                '}';
    }

    // Виводимо привітання і яка ліцензія
    public void Greeting(){
        System.out.println("Hello, my name is " + this.name +
                "\n my driver license is " + this.license);

    }


}
