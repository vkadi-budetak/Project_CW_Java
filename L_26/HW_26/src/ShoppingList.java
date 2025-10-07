import java.util.ArrayList;

/**
 * 📋 Задание 2 (для желающих): Работа с методами поиска и удаления
 * Описание:
 * Создайте программу для управления списком покупок с возможностью поиска и удаления товаров.
 * Требования:
 * Создайте ArrayList с начальным списком из 7 товаров +
 * Удалите товар по индексу 2
 * Удалите товар "хлеб" по названию (если есть)
 * Добавьте новый товар "сыр" на позицию 1
 * Замените товар на позиции 0 на "масло"
 * Выведите финальный список покупок
 * Дополнительно:
 * Обработайте случаи, когда товар не найден
 * Покажите размер списка до и после операций
 *
 *
 */

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Булка");
        shoppingList.add("Молоко");
        shoppingList.add("Йогурт");
        shoppingList.add("Картошка");
        shoppingList.add("Мясо");
        shoppingList.add("Сок");
        shoppingList.add("Сметана");

        //размер списка до...
        System.out.println("Количестов продуктов в списке: "+ shoppingList.size());

        //Удалите товар по индексу 2
        String removePosition2 = shoppingList.remove(2);
        System.out.println("Из списка удаляю '" + removePosition2 + "'");

        // * Удалите товар "хлеб" по названию (если есть)
        String productName = "хлеб";
        boolean removeName = shoppingList.remove(productName);
        System.out.println(productName + (removeName ? " был удален из списка" : " его нет в списке"));

        // * Добавьте новый товар "сыр" на позицию 1
        String productName2 = "сыр";
        int indexListAdd = 1;
        shoppingList.add(indexListAdd, productName2);
        System.out.println("Добавляю " + productName2 + " на позицию " + indexListAdd);

        // * Замените товар на позиции 0 на "масло"
        String productName3 = "масло";
        int indexListChange = 0;
        shoppingList.add(indexListChange, productName3);
        shoppingList.add(0, "масло");
        System.out.println("Меняю " + productName3 + " на позицию " + indexListChange);

        // * Выведите финальный список покупок
        System.out.println("Мой финальный список:\n" + shoppingList);

        //размер списка после...
        System.out.println("Количестов продуктов в списке: "+ shoppingList.size());
    }
}

