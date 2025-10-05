public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Мухтар");
        HunterDog taksa = new HunterDog("Пуля");

        System.out.println("=== Dog ===");
        System.out.println(dog.name);
        dog.fetch();
        dog.makeSound();
        dog.eating();
        System.out.println();
        System.out.println("=== HunterDog ===");
        System.out.println(taksa.name);
        taksa.makeSound();
        taksa.eating();
        System.out.println();
        dog.name = "Арчи";
        System.out.println(dog.name);
        dog.fetch();
        dog.makeSound();
        dog.eating();
    }
}
