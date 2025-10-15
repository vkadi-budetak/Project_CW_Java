import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Класс Student представляет студента, проживающего в общежитии.
 * Демонстрирует ключевые принципы ООП:
 * - Наследование: расширяет абстрактный класс Person
 * - Множественная реализация интерфейсов: implements Cookable, Cleanable
 * - Полиморфизм: переопределяет абстрактные методы родительского класса
 * - Инкапсуляция: использует приватные поля с контролируемым доступом
 *
 * Студент может готовить еду, убирать помещения и выполнять учебные задачи.
 *
 * @author Sergiy Danylko
 * @version 1.0
 */
public class Student extends Person implements Cookable, Cleanable {

    /**
     * Название университета, в котором учится студент.
     */
    private String university;

    /**
     * Номер курса обучения (1-6).
     */
    private int course;

    /**
     * Список любимых рецептов студента для приготовления в общежитии.
     */
    private List<String> favoriteRecipes;

    /**
     * Множество зон, за уборку которых ответственен данный студент.
     * Используется Set для избежания дублирования зон ответственности.
     */
    private Set<String> responsibleAreas;

    /**
     * Конструктор для создания объекта Student.
     * Вызывает конструктор родительского класса Person и инициализирует специфичные для студента поля.
     * Автоматически добавляет базовые рецепты, популярные среди студентов.
     *
     * @param name имя студента
     * @param age возраст студента
     * @param phoneNumber номер телефона студента
     * @param university название университета
     * @param course номер курса обучения
     */
    public Student(String name, int age, String phoneNumber, String university, int course) {
        super(name, age, phoneNumber); // Вызов конструктора родительского класса
        this.university = university;
        this.course = course;
        this.favoriteRecipes = new ArrayList<>(); // Инициализация коллекции рецептов
        this.responsibleAreas = new HashSet<>();  // Инициализация множества зон ответственности

        // Добавление базовых рецептов, популярных среди студентов
        favoriteRecipes.add("Бутерброды");
        favoriteRecipes.add("Мивина");
    }


    /**
     * Реализация метода интерфейса Cleanable.
     * Выполняет уборку указанной зоны. Поведение зависит от того,
     * ответственен ли студент за данную зону.
     *
     * @param area название зоны для уборки
     */
    @Override
    public void clean(String area) {
        if (responsibleAreas.contains(area)) {
            System.out.println(getName() + " убирает " + area);
        } else {
            System.out.println(getName() + " помогает убирать " + area);
        }
    }

    /**
     * Реализация метода интерфейса Cleanable.
     * Проверяет, ответственен ли студент за уборку указанной зоны.
     *
     * @param area название зоны для проверки
     * @return true, если студент ответственен за данную зону
     */
    @Override
    public boolean isResponsibleFor(String area) {
        return responsibleAreas.contains(area);
    }

    /**
     * Реализация метода интерфейса Cookable.
     * Студент готовит указанное блюдо.
     *
     * @param dish название блюда для приготовления
     */
    @Override
    public void cook(String dish) {
        System.out.println(getName() + " готовит " + dish);
    }

    /**
     * Реализация метода интерфейса Cookable.
     * Возвращает список любимых рецептов студента.
     *
     * @return список любимых рецептов
     */
    @Override
    public List<String> getFavoriteRecipes() {
        return favoriteRecipes;
    }

    /**
     * Реализация абстрактного метода родительского класса Person.
     * Каждый студент представляется по-своему, указывая курс и университет.
     *
     * @return строка с представлением студента
     */
    @Override
    public String introduce() {
        return "Привет! Я " + getName() + ", студент " + course + " курса " + university;
    }


    /**
     * Добавляет зону ответственности для данного студента.
     * Студент становится ответственным за уборку указанной зоны.
     *
     * @param area название зоны ответственности
     */
    public void addResponsibleArea(String area) {
        responsibleAreas.add(area);
    }

    /**
     * Студент готовится к экзаменам.
     * Специфичный для студента метод, демонстрирующий его основную деятельность.
     */
    public void study() {
        System.out.println(name + " готовится к экзаменам на " + course + " курсе");
    }

    /**
     * Добавляет новый рецепт в список любимых блюд студента.
     * Обычно решение принимается на общем собрании жильцов общежития.
     *
     * @param dish название нового блюда
     */
    public void addFavoriteRecipes(String dish) {
        System.out.println("На общем собрании решили добавить для разнообразия блюдо: " + dish);
        favoriteRecipes.add(dish);
    }

    /**
     * Удаляет рецепт из списка любимых блюд студента.
     * Обычно удаляются непопулярные блюда.
     *
     * @param dish название блюда для удаления
     */
    public void removeFavoriteRecipes(String dish) {
        System.out.println("Удаляем из меню блюдо не пользующееся популярностью: " + dish);
        favoriteRecipes.remove(dish);
    }

    // Геттеры для доступа к приватным полям

    /**
     * Возвращает название университета студента.
     *
     * @return название университета
     */
    public String getUniversity() {
        return university;
    }

    /**
     * Возвращает номер курса студента.
     *
     * @return номер курса обучения
     */
    public int getCourse() {
        return course;
    }
}
