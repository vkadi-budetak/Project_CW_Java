/**
 * Внешний класс
 */
public class OuterClass {
    // Пример статического вложенного класса
    private int x=1; //
    private static int y=1; //

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private static void display(int x){
        System.out.println(x);
    }

    @Override
    public String toString() {
        return "OuterClass{" +
                "x=" + x +
                '}';
    }

    // Пример статического вложенного класса
    static class InnerClass{
        public int sum(){
            display(y);
            return y+y;
        }
    }

}
