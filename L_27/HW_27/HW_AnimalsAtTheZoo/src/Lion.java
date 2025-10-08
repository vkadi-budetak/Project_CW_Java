public class Lion implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Ер еррррррр");
    }

    @Override
    public void eat() {
        System.out.println("Лев ест мясо");

    }

    @Override
    public String getSpecies() {
        return "Лев";
    }
}
