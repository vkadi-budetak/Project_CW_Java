public class Programmer {
    private String name;
    private String status;

    public Programmer(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String doWork(String taskMsg)
            throws ProgrammerBusyException, ProgrammerUnavailableNowException {

        if (status.equalsIgnoreCase("доступен")) {
            return taskMsg.toUpperCase(); // возвращаем сообщение большими буквами
        } else if (status.equalsIgnoreCase("занят")) {
            throw new ProgrammerBusyException("Программист занят другой задачей");
        } else if (status.equalsIgnoreCase("не доступен")) {
            throw new ProgrammerUnavailableNowException("Программист не доступен");
        }
        throw new IllegalStateException("Неизвестный статус: " + status);
    }
}
