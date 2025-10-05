public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine= new CoffeeMachine("BOSH E230"); // создаю кофемашину
        System.out.println(coffeeMachine);
        coffeeMachine.setCoffee(1500); // заправляю кофемашину
        coffeeMachine.setWater(900);    // заправляю кофемашину
        coffeeMachine.setMilk(500); // заправляю кофемашину

        System.out.println(coffeeMachine);
        System.out.println("================================");
        coffeeMachine.makeCoffee(); // вызываю стандарт приготовления
        System.out.println(coffeeMachine);
        System.out.println("==============================");
        Recipe recipeEspresso=new Recipe("Espresso",15,30,0); // создаю рецепт Espresso
        Recipe recipeLatte=new Recipe("Latte Machiato",15,100,100); // создаю рецепт Latte
        coffeeMachine.makeCoffee(recipeEspresso); // Вызываю приготовления  Espresso
        coffeeMachine.makeCoffee(recipeLatte); // Вызываю приготовления  Latte
        System.out.println(coffeeMachine); // Вызываю кофемашину и смотрю остаток всего

    }
}
