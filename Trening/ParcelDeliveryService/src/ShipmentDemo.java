public class ShipmentDemo {
    public static void main(String[] args) {
        Shipment[] shipments = {
                new StandardShipment("Книга",      101, 0.8, 300),
                new StandardShipment("Принтер",    104, 6.5, 900),
                new ExpressShipment("Смартфон",    102, 0.4, 120),
                new FragileShipment("Ваза",        103, 2.0, 50),

        };

//        double total = 0.0;
//        for (Shipment s : shipments) {
//            double price = s.calculatePrice();
//            System.out.printf("%s -> price = %.2f%n", s, price);
//            total += price;
//        }
//        System.out.println("------------------------------");
//        System.out.printf("Total price: %.2f%n", total);


        double totalAmount = 0.0;
        for (int i = 0; i < shipments.length; i++) {
            shipments[i].printAllFields();
            double amount = shipments[i].calculatePrice();
            totalAmount += amount;
            System.out.printf("%s -> price = %.2f $ %n", i, amount);
        }
        System.out.println("------------------------------");
        System.out.printf("Total price: %.2f $ %n", totalAmount);


    }
}