import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ДЕМОНСТРАЦИОННЫЙ КЛАСС СИСТЕМЫ УПРАВЛЕНИЯ ОБЩЕЖИТИЕМ
 *
 * Этот класс служит примером использования всех компонентов системы управления
 * студенческим общежитием и демонстрирует основные принципы ООП в действии.
 *
 * ДЕМОНСТРИРУЕМЫЕ КОНЦЕПЦИИ ООП:
 * - Наследование: Student, DormLeader, DormManager наследуют от Person
 * - Полиморфизм: разные классы реализуют методы по-своему
 * - Инкапсуляция: данные скрыты внутри классов, доступ через методы
 * - Абстракция: использование интерфейсов и абстрактных классов
 * - Композиция: DormitoryManagementSystem содержит коллекции объектов
 *
 * ДЕМОНСТРИРУЕМЫЕ СТРУКТУРЫ ДАННЫХ:
 * - ArrayList: для хранения жильцов и расходов
 * - HashSet: для управления доступными комнатами
 * - LinkedList: для очереди заявок на ремонт
 * - Comparator: для сортировки объектов
 *
 * ПАТТЕРНЫ ПРОЕКТИРОВАНИЯ:
 * - Strategy: различные способы сортировки
 * - Iterator: обход коллекций
 * - Factory Method: создание объектов разных типов
 *
 * ОБРАЗОВАТЕЛЬНЫЕ ЦЕЛИ:
 * - Показать практическое применение ООП
 * - Продемонстрировать работу с коллекциями Java
 * - Объяснить принципы проектирования программ
 * - Научить использованию полиморфизма и интерфейсов
 *
 * @author Sergiy Danylko
 * @version 1.0
 * @since 2025
 */
public class DormitoryExample {
    /**
     * ГЛАВНЫЙ МЕТОД ДЕМОНСТРАЦИИ
     *
     * Этот метод демонстрирует полный жизненный цикл работы с системой управления
     * общежитием, показывая все основные возможности и принципы ООП.
     *
     * ЭТАПЫ ДЕМОНСТРАЦИИ:
     * 1. Создание системы и объектов разных типов
     * 2. Настройка свойств объектов
     * 3. Добавление объектов в систему
     * 4. Демонстрация полиморфизма
     * 5. Поиск и фильтрация данных
     * 6. Преобразование и анализ данных
     * 7. Сортировка и управление коллекциями
     * 8. Работа с расходами и статистикой
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println("🏠 === СИСТЕМА УПРАВЛЕНИЯ СТУДЕНЧЕСКИМ ОБЩЕЖИТИЕМ ===");

        // ЭТАП 1: СОЗДАНИЕ СИСТЕМЫ УПРАВЛЕНИЯ
        // Демонстрирует инстанцирование основного класса системы
        DormitoryManagementSystem dorm = new DormitoryManagementSystem();

        // ЭТАП 2: СОЗДАНИЕ ЖИЛЬЦОВ РАЗНЫХ ТИПОВ
        // Демонстрирует наследование - все классы наследуют от Person
        Student alice = new Student("Алиса", 19, "+380-96-123-45-67", "КПИ", 2);
        Student bob = new Student("Боб", 20, "+380-96-234-56-78", "КПИ", 3);
        DormLeader charlie = new DormLeader("Чарли", 21, "+380-93-345-67-89", "КПИ", 3);
        Student diana = new Student("Диана", 18, "+380-99-456-78-90", "КПИ", 1);
        DormManager manager = new DormManager("Мария Ивановна", 45, "+380-95-567-89-01", 15);

        // ЭТАП 3: НАСТРОЙКА СПЕЦИФИЧЕСКИХ СВОЙСТВ
        // Демонстрирует инкапсуляцию - каждый класс имеет свои уникальные методы
        alice.addResponsibleArea("Кухня");
        bob.addResponsibleArea("Коридор");
        diana.addResponsibleArea("Ванная комната");

        // Демонстрирует расширение функциональности через наследование
        charlie.addExpertSubject("Физика");
        charlie.addExpertSubject("Английский язык");

        // ЭТАП 4: ДОБАВЛЕНИЕ ЖИЛЬЦОВ В СИСТЕМУ
        // Демонстрирует полиморфизм - все объекты обрабатываются как Person
        dorm.addResident(alice);
        dorm.addResident(bob);
        dorm.addResident(charlie);
        dorm.addResident(diana);
        dorm.addResident(manager);

        // ЭТАП 5: УПРАВЛЕНИЕ РЕСУРСАМИ
        // Демонстрирует работу с коллекциями и управление состоянием системы
        System.out.println("\n🏠 === ЗАСЕЛЕНИЕ В КОМНАТЫ ===");
        for (Person person : dorm.getResidents()) {
            dorm.assignRoom(person);
        }

        // ЭТАП 6: ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА
        // Показывает, как разные классы реализуют один метод по-разному
        System.out.println("\n👋 === ЗНАКОМСТВО (полиморфизм) ===");
        dorm.makeAllIntroduce();

        // ЭТАП 7: ПОИСК И ФИЛЬТРАЦИЯ ДАННЫХ
        // Демонстрирует алгоритмы поиска и работу с условиями
        System.out.println("\n🔍 === ПОИСК МОЛОДЫХ ЖИЛЬЦОВ (до 20 лет) ===");
        List<Person> youngResidents = dorm.findYoungResidents(20);
        for (Person young : youngResidents) {
            System.out.println("Молодой жилец: " + young.getName() + " (" + young.getAge() + " лет)");
        }

        // Демонстрирует проверку типов и приведение типов
        System.out.println("\n🎓 === ПОИСК СТУДЕНТОВ 3 КУРСА ===");
        List<Student> thirdYearStudents = dorm.findStudentsByCourse(3);
        for (Student student : thirdYearStudents) {
            System.out.println("Студент 3 курса: " + student.getName() + " - " + student.getUniversity());
        }

        // ЭТАП 8: ПРЕОБРАЗОВАНИЕ И АНАЛИЗ ДАННЫХ
        // Демонстрирует обработку данных и создание производной информации
        System.out.println("\n📝 === СПИСОК КОНТАКТОВ ===");
        List<String> contacts = dorm.getContactList();
        for (String contact : contacts) {
            System.out.println("📞 " + contact);
        }

        // ЭТАП 9: СОРТИРОВКА И УПРАВЛЕНИЕ КОЛЛЕКЦИЯМИ
        // Демонстрирует различные способы сортировки объектов
        System.out.println("\n📊 === СОРТИРОВКА ПО ИМЕНИ (Comparable) ===");
        dorm.sortResidents(null); // Используем естественную сортировку (Comparable)
        dorm.showAllResidentsWithIterator();

        // Демонстрирует использование Comparator для альтернативной сортировки
        System.out.println("\n📊 === СОРТИРОВКА ПО ВОЗРАСТУ (Comparator) ===");
        dorm.sortResidents(Comparator.comparingInt(Person::getAge));
        for (Person person : dorm.getResidents()) {
            System.out.println(person.getName() + " - " + person.getAge() + " лет");
        }

        // ЭТАП 10: ДЕМОНСТРАЦИЯ ИНТЕРФЕЙСОВ ПОВЕДЕНИЯ
        // Показывает, как интерфейсы добавляют функциональность объектам
        System.out.println("\n🍳 === ГОТОВКА (интерфейс Cookable) ===");
        for (Person person : dorm.getResidents()) {
            if (person instanceof Cookable) {
                Cookable cook = (Cookable) person;
                cook.cook("Паста");
                System.out.println("Любимые рецепты " + person.getName() + ": " + cook.getFavoriteRecipes());
            }
        }

        // Демонстрирует множественное наследование интерфейсов
        System.out.println("\n🧹 === УБОРКА (интерфейс Cleanable) ===");
        for (Person person : dorm.getResidents()) {
            if (person instanceof Cleanable) {
                Cleanable cleaner = (Cleanable) person;
                cleaner.clean("Кухня");
            }
        }

        // ЭТАП 11: КООРДИНАЦИЯ ГРУППОВЫХ ДЕЙСТВИЙ
        // Демонстрирует полиморфное поведение через интерфейсы
        dorm.organizeEventByAllOrganizers("Новогодняя вечеринка");

        // ЭТАП 12: СИСТЕМА ПОМОЩИ В ОБУЧЕНИИ
        // Показывает специализированную функциональность через интерфейсы
        System.out.println("\n📚 === ПОМОЩЬ С УЧЕБОЙ ===");
        for (Person person : dorm.getResidents()) {
            if (person instanceof StudyHelper) {
                StudyHelper helper = (StudyHelper) person;
                helper.helpWithSubject("Математика");
                helper.helpWithSubject("История");
                System.out.println("Экспертные предметы " + person.getName() + ": " + helper.getExpertSubjects());
            }
        }

        // ЭТАП 13: ФИНАНСОВОЕ УПРАВЛЕНИЕ
        // Демонстрирует работу с объектами Expense и их сортировку
        System.out.println("\n💰 === УПРАВЛЕНИЕ РАСХОДАМИ ===");
        dorm.addExpense("Моющие средства", 500.0, "Хозяйственные");
        dorm.addExpense("Ремонт стиральной машины", 2500.0, "Техника");
        dorm.addExpense("Продукты для мероприятия", 1200.0, "Мероприятия");
        dorm.addExpense("Туалетная бумага", 300.0, "Хозяйственные");
        dorm.addExpense("Новый телевизор", 15000.0, "Техника");

        // Демонстрирует использование Comparable для автоматической сортировки
        List<Expense> sortedExpenses = dorm.getExpenses();
        Collections.sort(sortedExpenses);

        System.out.println("Расходы (отсортированы по убыванию суммы):");
        for (Expense expense : sortedExpenses) {
            System.out.println("💸 " + expense);
        }

        // ЭТАП 14: АНАЛИЗ И ФИЛЬТРАЦИЯ РАСХОДОВ
        // Показывает методы анализа финансовых данных
        System.out.println("\nХозяйственные расходы:");
        List<Expense> householdExpenses = dorm.getExpensesByCategory("Хозяйственные");
        for (Expense expense : householdExpenses) {
            System.out.println("🧽 " + expense);
        }

        // Демонстрирует фильтрацию по числовым критериям
        System.out.println("\nДорогие покупки (свыше 1000 грн.):");
        List<Expense> expensiveItems = dorm.getMostExpensiveItems(1000.0);
        for (Expense expense : expensiveItems) {
            System.out.println("💰 " + expense);
        }

        // ЭТАП 15: УПРАВЛЕНИЕ ОЧЕРЕДЬЮ ЗАДАЧ
        // Демонстрирует работу с Queue (FIFO - First In, First Out)
        System.out.println("\n🔧 === ЗАЯВКИ НА РЕМОНТ (Queue) ===");
        dorm.addMaintenanceRequest("Починить кран в комнате 105");
        dorm.addMaintenanceRequest("Заменить лампочку в коридоре");
        dorm.addMaintenanceRequest("Отремонтировать дверь в комнате 112");

        // Показывает принцип FIFO при обработке заявок
        System.out.println("\nОбработка заявок:");
        dorm.processMaintenanceRequest();
        dorm.processMaintenanceRequest();

        // ЭТАП 16: ИТОГОВАЯ АНАЛИТИКА СИСТЕМЫ
        // Демонстрирует сбор и представление статистических данных
        dorm.showStatistics();

        System.out.println("\n🎉 === КОНЕЦ ДЕМОНСТРАЦИИ ===");
    }
}
