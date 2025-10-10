import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    public boolean addGrade(int grade) {
        return grades.add(grade);
    }

    /**
     * Создаем метод вывода всех оценок
     */
    public void getGradeStatistics() {
        Iterator<Integer> it = grades.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    /**
     * Создаем метод для посчета среднего значения
     * @return - середний бал
     */
    public double average() {
        int sum = 0;
        for (int i : grades) {
            sum += i;
        }
        return sum / grades.size();
    }

    /**
     * Создаем метод для удаления оценок ниже 3
     * @return -
     */
    public int removeFailingGrades() {
        Iterator<Integer> removeIt = grades.iterator();
        while (removeIt.hasNext()){
            Integer grade = removeIt.next();
            if (grade < 3) {
                removeIt.remove();
            }
            System.out.println("Удалили: " + grade);
        }
        return 0;
    }

    public void getGradeStatistics(){};

}
