import java.util.ArrayList;
import java.util.List;

/**
 * Класс DormLeader (Староста общежития) - демонстрирует множественное наследование интерфейсов в Java.
 *
 * Этот класс является отличным примером объектно-ориентированного программирования, показывая:
 * - Наследование от класса Student (extends Student)
 * - Множественную реализацию интерфейсов (implements StudyHelper, StudentEventOrganizer)
 * - Полиморфизм - объект может выступать в роли Student, StudyHelper и StudentEventOrganizer
 * - Расширение функциональности родительского класса
 *
 * Староста общежития - это студент с дополнительными обязанностями:
 * - Помощь другим студентам в учебе (StudyHelper)
 * - Организация мероприятий (StudentEventOrganizer)
 * - Ведение списка экспертных предметов
 * - Планирование событий в общежитии
 *
 * @author Sergiy Danylko
 * @version 1.0
 * @see Student
 * @see StudyHelper
 * @see StudentEventOrganizer
 */
public class DormLeader extends Student implements StudyHelper, StudentEventOrganizer {

    /**
     * Список предметов, по которым староста может оказать помощь.
     * Демонстрирует инкапсуляцию - приватное поле с контролируемым доступом.
     */
    private List<String> expertSubjects;

    /**
     * Список запланированных мероприятий в общежитии.
     * Показывает ответственность старосты за организацию событий.
     */
    private List<String> plannedEvents;

    /**
     * Конструктор класса DormLeader.
     *
     * Создает объект старосты общежития с базовой информацией студента
     * и инициализирует дополнительные поля для выполнения обязанностей старосты.
     *
     * Демонстрирует:
     * - Вызов конструктора родительского класса через super()
     * - Инициализацию коллекций для хранения данных
     * - Автоматическое добавление базового экспертного предмета
     *
     * @param name имя старосты
     * @param age возраст старосты
     * @param phoneNumber номер телефона старосты
     * @param university название университета
     * @param course номер курса обучения
     */
    public DormLeader(String name, int age, String phoneNumber, String university, int course) {
        super(name, age, phoneNumber, university, course);
        this.expertSubjects = new ArrayList<>();
        this.plannedEvents = new ArrayList<>();

        // Каждый староста по умолчанию является экспертом по высшей математике
        expertSubjects.add("Высшая математика");
    }

    /**
     * Переопределенный метод представления старосты.
     *
     * Демонстрирует полиморфизм - каждый тип Person представляется по-своему.
     * Староста указывает свою роль в общежитии в дополнение к студенческому статусу.
     *
     * @return строка с представлением старосты общежития
     */
    @Override
    public String introduce() {
        return "Привет! Я " + getName() + ", староста общежития и студент " + getCourse() + " курса " + getUniversity();
    }

    /**
     * Организует мероприятие в общежитии.
     *
     * Реализация метода из интерфейса StudentEventOrganizer.
     * Добавляет событие в список запланированных и выводит уведомление.
     *
     * @param event название организуемого мероприятия
     */
    @Override
    public void organizeEvent(String event) {
        plannedEvents.add(event);
        System.out.println(getName() + " организует мероприятие: " + event);
    }

    /**
     * Возвращает список запланированных мероприятий.
     *
     * Реализация метода из интерфейса StudentEventOrganizer.
     * Предоставляет доступ к списку событий, которые планирует староста.
     *
     * @return список запланированных мероприятий
     */
    @Override
    public List<String> getPlannedEvent() {
        return plannedEvents;
    }

    /**
     * Оказывает помощь по учебному предмету.
     *
     * Реализация метода из интерфейса StudyHelper.
     * Проверяет, является ли староста экспертом по данному предмету,
     * и предоставляет помощь или направляет к другому эксперту.
     *
     * @param subject предмет, по которому требуется помощь
     */
    @Override
    public void helpWithSubject(String subject) {
        if (expertSubjects.contains(subject)) {
            System.out.println(getName() + " помогает с " + subject);
        } else {
            System.out.println("Обратись к другому эксперту, это не мой профиль.");
        }
    }

    /**
     * Возвращает список экспертных предметов старосты.
     *
     * Реализация метода из интерфейса StudyHelper.
     * Предоставляет информацию о предметах, по которым староста может помочь.
     *
     * @return список предметов экспертизы
     */
    @Override
    public List<String> getExpertSubjects() {
        return expertSubjects;
    }

    /**
     * Добавляет новый предмет в список экспертизы старосты.
     *
     * Дополнительный метод класса DormLeader, расширяющий функциональность
     * интерфейса StudyHelper. Позволяет старосте развивать свои компетенции
     * и становиться экспертом по новым предметам.
     *
     * Демонстрирует:
     * - Проверку на дублирование данных
     * - Обратную связь с пользователем
     * - Расширение базового функционала интерфейса
     *
     * @param subject новый предмет для добавления в экспертизу
     */
    public void addExpertSubject(String subject) {
        if (!expertSubjects.contains(subject)) {
            expertSubjects.add(subject);
            System.out.println("В ваш профиль добавлен новый предмет: " + subject);
        } else {
            System.out.println("Вы уже являетесь экспертом по " + subject);
        }
    }
}
