import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        System.out.println("Добрый день студенты!!!" + "\nСегодня последний день учебы." +
                " \nВас по списку 30 человек. Сколько осталось сегодня?");
        // создаю пустой ArrayList для хранения имен студентов
        ArrayList<String> studentList = new ArrayList<>();

        //Добавляем 5 студентов
        studentList.add("Иван");
        studentList.add("Мария");
        studentList.add("Анна");
        studentList.add("Сергей");
        studentList.add("Ольга");

        //Считаем количество студентов
        System.out.println("Отвечает староста - " + "Количество студенов в группе: " + studentList.size());
        System.out.println("-------------------");

        System.out.println("Негусто, кто хочет рассказать стих?");
        //Вывожу имя первого студента из списка.
        String firstStudent = studentList.get(0);
        System.out.println("Первый студент из списка: " + firstStudent + " кричит - Я !!!!");

        //Вывожу имя последнего студента из списка.
        String lastStudent = studentList.get(studentList.size() - 1);
        System.out.println("Последний студент из списка: " + lastStudent + " кричит - Я также хочу!!!!");

        System.out.println("-------------------");
        System.out.println("Пускай будет Анна");
        //Проверка ли присутсвует всписке студент с именем "Анна"
        String searchName = "Анна";
        boolean searchNameInStudentList = studentList.contains(searchName);
        System.out.println("Присутсвует в списке студент под именем " +  searchName + " :" + (searchNameInStudentList ? " Да" : " Нет"));
        System.out.println("Тогда ты будешь первая!");

        // Весь список студентов.
        System.out.println("Все студенты: " + studentList + " получили отлично!");
    }
}
