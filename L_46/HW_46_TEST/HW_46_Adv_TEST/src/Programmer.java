public class Programmer {
    private String name;
    private ProgrammerStatus status;

    public Programmer(String name) {
        this.name = name;
        status= ProgrammerStatus.AVAILABLE;
    }

    public void setAvailable(){
        status=ProgrammerStatus.AVAILABLE;
    }
    public void setUnavailable(){
        status=ProgrammerStatus.UNAVAILABLE;
    }
    public void setBusy(){
        status=ProgrammerStatus.BUSY;
    }

    public String getName() {
        return name;
    }

    public ProgrammerStatus getStatus() {
        return status;
    }

    String doWork(String taskMsg) throws ProgrammerUnavailableException,ProgrammerBusyException {
        if (status==ProgrammerStatus.UNAVAILABLE){
            throw new ProgrammerUnavailableException(status.getMsg());
        }
        if (status==ProgrammerStatus.BUSY){
            throw new ProgrammerBusyException(status.getMsg());
        }
        return taskMsg.toUpperCase();
    }

    @Override
    public String toString() {
        return "Programming{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
enum ProgrammerStatus{

    AVAILABLE{
        @Override
        public String getMsg() {
            return "Доступен";
        }
    },
    UNAVAILABLE{
        @Override
        public String getMsg() {
            return "Программист не доступен";
        }

    },
    BUSY{
        @Override
        public String getMsg() {
            return "Программист занят другой задачей";
        }

    };

    public abstract String getMsg();

}

