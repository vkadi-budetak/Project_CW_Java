public class User {
    private final String name;
    private final int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User {" +
                "name = '" + name + '\'' +
                ", id = " + id +
                '}';
    }
}
