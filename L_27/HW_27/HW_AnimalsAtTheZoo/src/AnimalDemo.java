public class AnimalDemo {
    public static void main(String[] args) {
//        String[] animals = {"Лев, Слон, Обезьяна"};

        Animal[] animals = {
                new Lion(),
                new Elephant(),
                new Monkey()
        };
        for (Animal a : animals) {
            System.out.println("Species: " + a.getSpecies());
            a.makeSound();
            a.eat();
            System.out.println("-----------");
        };
    }
}
