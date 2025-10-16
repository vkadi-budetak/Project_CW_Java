public class Box4 <T extends Number>{
    T value1;
    T value2;

    public Box4(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public T getValue2() {
        return value2;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Box4{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }

    public double mult(){
        return  value1.doubleValue()*value2.doubleValue();
    }

    public int compareBox4(){
        return Double.compare(value1.doubleValue(), value2.doubleValue());
    }
}
