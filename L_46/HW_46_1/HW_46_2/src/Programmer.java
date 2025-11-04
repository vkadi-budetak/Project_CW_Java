public class Programmer {
    private String name;
    private String status;

    // Конструктор
    public Programmer(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String doWork(String taskMsg) throws ProgrammerBusyException, ProgrammerUnavailableNowException {
        if (status.equals("доступен")) {
            return taskMsg.toUpperCase();
        } else if (status.equals("занят")) {
            throw new ProgrammerBusyException("Программист занят другой задачей");
        } else if (status.equals("не доступен")) {
            throw new ProgrammerUnavailableNowException("Программист не доступен");
        }
        throw new IllegalStateException("Неизвестный статус программиста");
    }

}


