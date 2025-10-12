import java.util.LinkedList;
import java.util.Objects;

public class Task {
    private final int id;
    private final String title;
    private final int priority; // 1-5

    // Если не внесли значения - пустой конструктор
    public Task() { this(0, "...", 0);
    }


    // Конструкор
    public Task(int id, String title, int priority) {
        if (title == null || title.isBlank())
            throw new IllegalArgumentException("title must be non-blank");
        if (priority < 1 || priority > 5)
            throw new IllegalArgumentException("priority must be in [1..5]");
        this.id = id;
        this.title = title;
        this.priority = priority;
    }

    // Гетери
    public int getId() {
        return id;
}
    public String getTitle() {
        return title;
    }
    public int getPriority() {
        return priority;
    }

    // переопределяем equals() и hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        return id == ((Task) o).id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Реализация toString
    @Override public String toString() {
        return "[ID: " + id + "] " + title + " (Приоритет: " + priority + ")";
    }
}
