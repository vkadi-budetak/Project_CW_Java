public interface DataProcessor {
    void process(String data);
    boolean isBusy();   // Status
}
