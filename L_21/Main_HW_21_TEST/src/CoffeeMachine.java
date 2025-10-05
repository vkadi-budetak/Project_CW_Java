public class CoffeeMachine {
    private String title;
    private int coffee;
    private int water;
    private int milk;

    private final int COFFEE_CAPACITY = 500;
    private final int WATER_CAPACITY = 1000;
    private final int MILK_CAPACITY = 500;

    private int requiredCoffe = 30;
    private  int requiredWater =100;
    private int requiredMilk = 50;

    public CoffeeMachine() {
    }

    public CoffeeMachine(String title, int coffee, int water, int milk) {
        this.title = title;
        this.coffee = coffee;
        this.water = water;
        this.milk = milk;
    }

    public CoffeeMachine(String title) {
        this(title,0,0,0);
//        System.out.println();
    }

    public void setCoffee(int coffee){  //заправка машины ресурсами - кофе
        if (coffee>0)
            this.coffee=Math.min(COFFEE_CAPACITY, this.coffee+coffee);
    }

    public void setMilk(int milk){  //заправка машины ресурсами - milk
        if (milk>0)
            this.milk=Math.min(MILK_CAPACITY, this.milk+milk);
    }

    public void setWater(int water){  //заправка машины ресурсами - water
        if (water>0)
            this.water=Math.min(WATER_CAPACITY, this.water+water);
    }

    @Override
    public String toString() {
        return "В машине" +  title + ", coffee: " + coffee +
                "грамм , water: " + water +"мл., milk:" + milk + " мл.";
    }

    public void makeCoffee(){    // создаю стандарт приготовления кофе
        Recipe recipeDefault= new Recipe("Standard ",requiredCoffe,requiredWater,requiredMilk);
        makeCoffee(recipeDefault);
    }

    public void makeCoffee(Recipe recipe) {
        if (coffee>=recipe.getCoffee() && water>=recipe.getWater() &&
                milk>=recipe.getMilk()){
            System.out.println("Готовим кофе: "+ recipe.getTitle() + ":");

            System.out.println("   Добавляем кофе: " + recipe.getCoffee());
            coffee-=recipe.getCoffee();
            System.out.println("   Добавляем воду: " + recipe.getWater());
            water-=recipe.getWater();
            System.out.println("   Добавляем молоко: " + recipe.getMilk());
            milk-=recipe.getMilk();

            System.out.println("Кофе готов, заберите ваш напиток ");

        } else {
            if (coffee<recipe.getCoffee()){
                System.out.println("Добавьте кофе!!! Нехватает:"+
                        (recipe.getCoffee()-coffee)+"грамм.");
            }
            if (water<recipe.getWater()){
                System.out.println("Добавьте воду!!! Нехватает:"+
                        (recipe.getWater()-water)+"мл.");

            }
            if (milk<recipe.getMilk()){
                System.out.println("Добавьте молоко!!! Нехватает:"+
                        (recipe.getMilk()-milk)+"мл.");
            }
        }

    }
}
