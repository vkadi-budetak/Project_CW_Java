import java.util.ArrayList;
import java.util.Iterator;

public class StudentGrades {
    private ArrayList<Integer> grades;

    //Конструктор заполняем пустой
    public StudentGrades() {
        grades = new ArrayList<>();
    }

    //Конструктор
    public StudentGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    /**
     * Создаем метод добавления оценок
     * @param grade - оценка
     * @return
     */
    public void addGrade(int grade) {
        if (grade >= 1 && grade <= 5) {
            grades.add(grade);
        } else {
            System.out.println("Ошибка: оценка быть от 1 до 5");
        }
    }

    // подсчет
    public int quantityGradeByMark(int grade) {
        if (grades.isEmpty()) {
            return 0;
        }

        int total = 0;
        Iterator<Integer> iterator = grades.iterator();

        while (iterator.hasNext()) {
            int currentGrade = iterator.next();
            if (currentGrade == grade) {
                total++;
            }
        }

        return total;
    }

    /**
     * Создаем метод вывода всех оценок
     */
    public void getGradeStatistics() {
        System.out.println("📈 Статистика: ");
        System.out.println("   - Всего оценок: "  + grades.size());
        System.out.println("   - Отличных (5): " + quantityGradeByMark(5));
        System.out.println("   - Хороших (4): " + quantityGradeByMark(4));
        System.out.println("   - Удовлетворительных (3): " + quantityGradeByMark(3));
        System.out.printf("   - Средний балл: %.2f%n", average());
    }

    public void displayGrades(String message) {
        System.out.println(message + grades);
    }


    /**
     * Создаем метод для посчета среднего значения
     * @return - середний бал
     */
    public double average() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int i : grades) {
            sum += i;
        }
        return (double)sum / grades.size();
    }

    /**
     * Создаем метод для удаления оценок ниже 3
     */
    public void removeFailingGrades() {
        Iterator<Integer> removeIt = grades.iterator();
        int removedCount = 0;

        while (removeIt.hasNext()){
            Integer grade = removeIt.next();
            if (grade <=2) {
                removeIt.remove(); // Безопасное удаление через итератор
                removedCount++;  // removedCount += 1
                System.out.println("\uD83D\uDDD1\uFE0F Удаляем неудовлетворительную оценку: " + grade);
            }
        }
    }

}
