public class MainErrorTest {
    public static void main(String[] args) {
        int size = Integer.MAX_VALUE; // 2.147.xxx.xxx
        Runtime runtime = Runtime.getRuntime();
        System.out.printf("Max free memory %d, max memory %d, " + "total memory %d\n",
                runtime.freeMemory(), runtime.maxMemory(),
                runtime.totalMemory());

        while (true) { // уменшиваем размер массива
            try {
                byte[] ar = new byte[size];
                break;
            } catch (Error e) {
                System.out.println(e.getMessage());
                size = (int)(size/2);
            }
        }


        System.out.printf("Max free memory %d, max memory %d, " + "total memory %d\n",
                runtime.freeMemory(), runtime.maxMemory(),
                runtime.totalMemory());

        System.out.println(size);


    }
}
