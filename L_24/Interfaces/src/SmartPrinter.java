public class SmartPrinter implements PowerSwitch, DataProcessor {
    private String name;
    private boolean isOn;
    private boolean isBusy;

    public SmartPrinter(String name) {
        this.name = name;
        this.isOn = false;
        this.isBusy = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("Принтер включен.");
    }

    @Override
    public void powerOff() {
        this.isOn = false;
        System.out.println("Принтер выключен.");
    }

    @Override
    public void process(String data) {
        if (isOn) {
            if (isBusy) {
                System.out.println(name + " занят. Попробуй-те позже.");
            } else {
                isBusy = true;
                System.out.println(name + ": печатает документ -> " + data);
            }
        } else {
            System.out.println("Ошибка: Принтер " + name + " выключен.");
        }
    }

    @Override
    public boolean isBusy() {
        return false;
    }
}

