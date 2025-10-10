public class Lion implements Animal{

    @Override
    public void makeSound() {
        System.out.println("\uD83E\uDD81 Ереррррррр");
    }

    @Override
    public void eat() {
        System.out.println("\uD83E\uDD81 Лев ест мясо");

    }

    @Override
    public String getSpecies() {
        return "\uD83E\uDD81 Африканский Лев";
    }
}
