public class Elephant implements Animal {
    @Override
    public void makeSound() {
        System.out.println("\uD83D\uDC18 Трутутууууу");
    }

    @Override
    public void eat() {
        System.out.println("\uD83D\uDC18 Слон ест траву");
    }

    @Override
    public String getSpecies() {
        return "\uD83D\uDC18 Индийский Слон";
    }
}
