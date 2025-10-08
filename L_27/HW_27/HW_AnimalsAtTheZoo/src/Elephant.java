public class Elephant implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Трутутууууу");
    }

    @Override
    public void eat() {
        System.out.println("Слон ест траву");
    }

    @Override
    public String getSpecies() {
        return "Слон";
    }
}
