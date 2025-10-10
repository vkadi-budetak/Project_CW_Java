public class StudentDemo {
    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();

        // Добавляем оценки
        System.out.println("=== Добавление оценок ===");
        grades.addGrade(5);
        grades.addGrade(2);
        grades.addGrade(5);
        grades.addGrade(4);
        grades.addGrade(1);
        grades.addGrade(3);
        grades.addGrade(4);
        grades.addGrade(1);
        grades.addGrade(5);
        grades.addGrade(4);

        grades.displayGrades("\uD83C\uDF93 Исходные оценки: ");

        System.out.println();
        // Удаляем неудовлетворительные оценки
        grades.removeFailingGrades();

        grades.displayGrades("\uD83D\uDCCA Оценки после очистки: ");

        grades.getGradeStatistics();
    }
}
