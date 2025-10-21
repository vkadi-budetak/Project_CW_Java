public class Person {
    // Пример не статического вложенного класса
    private String name;
    private int id;
    private boolean flag=false;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public class LoginPassword{
        private String login;
        private int password;
        private boolean flag=true;

        public LoginPassword() {
            this.login = name;
            this.password = id;
        }

        public void display(){
            System.out.println("inner flag "+flag);// внутреннее поле
            System.out.println("outer flag "+Person.this.flag);// внешнее поле
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getPassword() {
            return password;
        }

        public void setPassword(int password) {
            this.password = password;
        }
    }
}
