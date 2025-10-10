public class Monkey implements Animal {


    @Override
    public void makeSound() {
        System.out.println("\uD83D\uDC12 Oo-oo-aa-aa!");
    }

    @Override
    public void eat() {
        System.out.println("\uD83D\uDC12 Обезьяна ест Бананы");
    }

    @Override
    public String getSpecies() {
        return "\uD83D\uDC12 Африканская Обезьяна";
    }
}
