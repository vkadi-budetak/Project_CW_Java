public class HunterDog extends Dog {

    public HunterDog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Я нашел нору лисы!)");
    }

    @Override
    public void eating() {
        System.out.println(name + " ест мокрый корм");
    }
}
