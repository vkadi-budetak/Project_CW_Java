public class DeviceMain {
    public static void main(String[] args) {
        SmartPrinter printer = new SmartPrinter("Hp 1100");
        System.out.println(printer.getName());
        printer.powerOn();
        printer.powerOff();
        printer.process("example.txt");
        printer.powerOn();
        printer.process("example.txt");
        printer.process("something.txt");
    }
}

