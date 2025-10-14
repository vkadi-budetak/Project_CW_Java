import java.util.List;
import java.util.ArrayList;

public class DataLoader {

    // --- Параметризованный метод, приближенный к жизни ---

    /**
     * Загружает и преобразует RawData в список объектов типа T.
     * @param <T> Тип объекта, который должен быть возвращен в списке.
     * @param rawData Исходные сырые данные.
     * @param targetType Класс, представляющий целевой тип T.
     * @return List<T> - параметризованный список объектов.
     */
    public static <T> List<T> loadAndMap(RawData rawData, Class<T> targetType) {
        System.out.println("--- Запущен загрузчик для типа: " + targetType.getSimpleName() + " ---");

        // В реальной жизни здесь была бы сложная логика парсинга JSON/XML
        // с использованием библиотеки (например, Jackson или Gson),
        // которая знает, как преобразовать 'rawData' в 'T'.

        List<T> resultList = new ArrayList<>();

        // Имитация процесса преобразования
        if (targetType.equals(User.class)) {
            // Предполагаем, что из RawData мы получаем два User-объекта
            resultList.add(targetType.cast(new User("Alice", 101)));
            resultList.add(targetType.cast(new User("Bob", 102)));
        }
        // else if (targetType.equals(Product.class)) { ... }

        System.out.println("Успешно создано объектов: " + resultList.size());
        return resultList;
    }

}
