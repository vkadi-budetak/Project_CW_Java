public class MenuItemDemo {
    public static void main(String[] args) {
        /**
        * Створюю масив MenuItem[]
        */
        MenuItem[] menuItems = {
                new Drink("Americano", 100, 300),
                new Sandwich("Burger", 101, 85.0, 2),
                new Sandwich("Chis burger", 102, 85.0, 5),
                new Drink("Espresso", 103, 60),
        };

        double totalAmount = 0.0;
        for(MenuItem s: menuItems) {
            double price = s.price();
            System.out.println(s + " prise: " + price);
        }


//виведи кожен елемент + його ціну (формат %.2f)
//підрахуй і виведи загальну суму замовлення

    }
}