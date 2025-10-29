import java.util.Objects;

public class Task {
    private Integer num; // номер задачи
    private String description; // описания задачи
    private String status; // статус задачи
    private Integer daysInProcessing; // сколько дней в обработке

// Конструктор
    public Task(Integer num, String description, String status, Integer daysInProcessing) {
        this.num = num;
        this.description = description;
        this.status = status;
        this.daysInProcessing = daysInProcessing;
    }

    public Integer getNum() {
        return num;
    }
    public String getDescription() {
        return description;
    }
    public String getStatus() {
        return status;
    }
    public Integer getDaysInProcessing() {
        return daysInProcessing;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void setDaysInProcessing(Integer daysInProcessing) {
        this.daysInProcessing = daysInProcessing;
    }

    @Override
    public String toString() {
        return
                "num: " + num +
                ", description: " + description + '\'' +
                ", status: " + status + '\'' +
                ", daysInProcessing: " + daysInProcessing;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Task task)) return false;

        return Objects.equals(num, task.num) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(num);
    }
}
