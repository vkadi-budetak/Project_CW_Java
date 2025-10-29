import java.util.List;
import java.util.StringTokenizer;

public class Programmer {
    private String name;
    private String city;
    private List<Task> tasks;

    // Конструктор


    public Programmer(String name, String city, List<Task> tasks) {
        this.name = name;
        this.city = city;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" ( ").append(city).append(" )\n");
        for (Task task: tasks){
            sb.append("        ").append(task).append("\n");
        }
        return sb.toString();
    }
}
