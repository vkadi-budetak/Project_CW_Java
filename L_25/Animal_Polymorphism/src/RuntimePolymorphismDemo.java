public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Неизвестное животное");
        Animal myDog = new Dog("Rex");
        Animal myCat = new Cat("Murka");

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();
    }
}
