public class Owner {
    private String firstName;
    private String lastName;
    private int numberPassport;
    private String address;

    // Конструктор
    public Owner(String firstName, String lastName, int numberPassport, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPassport = numberPassport;
        this.address = address;
    }

    // Геттеры и сеттеры
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getNumberPassport() {
        return numberPassport;
    }
    public void setNumberPassport(int numberPassport) {
        this.numberPassport = numberPassport;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "\uD83D\uDC64 firstName: " + firstName +
                ", lastName: " + lastName +
                ", numberPassport: " + numberPassport +
                ", address: " + address;
    }


}
