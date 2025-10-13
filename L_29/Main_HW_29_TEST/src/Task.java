import java.util.Objects;

public class Task {
    private int id;
    private String title;
    private int priority;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.priority = 1;
    }

    public Task(int id, String title, int priority) {
        this.id = id;
        this.title = title;
        if (priority >= 1 && priority <= 5) {
            this.priority = priority;
        } else {
            this.priority = 1;
        }
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Task task = (Task) obj;
        return id == task.id;
    }
}

