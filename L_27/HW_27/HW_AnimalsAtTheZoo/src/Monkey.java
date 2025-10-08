import java.util.SortedMap;

public class Monkey implements Animal {


    @Override
    public void makeSound() {
        System.out.println("Oo-oo-aa-aa!м");
    }

    @Override
    public void eat() {
        System.out.println("Обезьяна ест Бананы");
    }

    @Override
    public String getSpecies() {
        return "Обезьяна";

    }
}
