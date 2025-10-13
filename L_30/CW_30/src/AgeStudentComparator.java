import java.util.Comparator;

public class AgeStudentComparator  implements Comparator<OurStudent> {
    /**
     * Сравниваем возраста студентов
     */
    @Override
    public int compare(OurStudent student1, OurStudent student2) {
        return Integer.compare(student1.getAge(), student2.getAge());
    }
}
