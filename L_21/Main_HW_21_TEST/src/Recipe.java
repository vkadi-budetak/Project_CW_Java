public class Recipe {
    private String title;
    private int coffee;
    private int water;
    private int milk;

    public Recipe(String title, int coffee, int water, int milk) {
        this.title = title;
        this.coffee = coffee;
        this.water = water;
        this.milk = milk;
    }

    public String getTitle() {
        return title;
    }

    public int getCoffee() {
        return coffee;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    @Override
    public String toString() {
        return "title: " + title +
                ", coffee: " + coffee +
                ", water: " + water +
                ", milk: " + milk ;
    }
}
