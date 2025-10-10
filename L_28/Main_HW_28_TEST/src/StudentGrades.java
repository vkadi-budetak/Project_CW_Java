import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedMap;

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

    // метод добавления оценки
    public void addGrade(int grade) {
        if (grade >= 1 && grade <= 5) {
            grades.add(grade);
        } else {
            System.out.println("Ошибка: оценка быть от 1 до 5");
        }
    }

    // метод удаления неудовлетворительных оценок (< 3)
    public void removeFailingGrades() {
        Iterator<Integer> iterator = grades.iterator();
        int removedCount = 0;

        while (iterator.hasNext()) {
            Integer grade = iterator.next();
            if (grade <= 2) {
                iterator.remove(); // Безопасное удаление через итератор
                removedCount++;  // removedCount += 1
                System.out.println("Удаляем неудовлетворительную оценку" + grade);
            }
        }

        System.out.println("Удалено неудовлетворительных оценок: " + removedCount);
    }

    // метод для посчета среднего бала
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
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


    // метод для вывода всех оценок
    public void getGradeStatistics() {
        System.out.println("📈 Статистика:" + grades.size());
        System.out.println("   - Всего оценок: " + quantityGradeByMark(5));
        System.out.println("   - Отличных (5): " + quantityGradeByMark(5));
        System.out.println("   - Хороших (4): " + quantityGradeByMark(5));
        System.out.println("   - Удовлетворительных (3): " + quantityGradeByMark(5));
        System.out.println("  - Средний балл: " + calculateAverage());
    }

    public void displayGrades(String message) {
        System.out.println(message + grades);
        System.out.printf("Средний бал: %.2f%n", calculateAverage());
    }
}