import java.util.Comparator;

public class NameStudentComparator implements Comparator<OurStudent> {

    /**
     * Сравниваем имена студентов
     */
    @Override
    public int compare(OurStudent student1, OurStudent student2) {
        return student1.getName().compareTo(student2.getName());
    }
}
