import javax.swing.*;

public class Main_CoffeeMachine {
    public static void main(String[] args) {

        CoffeeMachine a1 = new CoffeeMachine("Barista", 200, 100, 500);
        CoffeeRecipe espresso = new CoffeeRecipe("espresso", 100, 60, 0);
        CoffeeRecipe latte = new CoffeeRecipe("latte", 70, 90, 110);
        CoffeeRecipe cappuccino = new CoffeeRecipe("cappuccino", 60, 90, 150);

        System.out.println("===Barista===");
        System.out.println(a1);
        a1.makeStandardCoffee();
        System.out.println("===espresso===");
        System.out.println(espresso);
        espresso.makeStandardCoffee();
        System.out.println("===latte===");
        System.out.println(latte);
        latte.makeStandardCoffee();
        System.out.println("===cappuccino===");
        System.out.println(cappuccino);
        cappuccino.makeStandardCoffee();






    }
}
