import java.util.List;

public class DataLoaderDemo {
    public static void main(String[] args) {
        RawData userData = new RawData("JSON-строка с пользователями...");

        // 1. Загружаем и получаем List<User>
        // Компилятор выводит T = User
        List<User> userList = DataLoader.loadAndMap(userData, User.class);

        System.out.println("\nРезультат 1 (List<User>):");
        userList.forEach(System.out::println);
        // Мы можем напрямую вызвать методы User, например, userList.get(0).getName()

        // 2. Если бы был класс Product, мы могли бы его загрузить тем же методом
        // List<Product> productList = DataLoader.loadAndMap(productData, Product.class);
    }
}
