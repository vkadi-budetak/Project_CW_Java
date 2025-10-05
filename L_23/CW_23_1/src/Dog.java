public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    @Override
    public void eating() {
        System.out.println(name + " грызет кость");
    }

    public void fetch() {
        System.out.println("Бежит за палкой ...");
    }
}
