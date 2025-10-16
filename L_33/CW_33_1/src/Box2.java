public class Box2 <M, K> {
    M value1;
    K value2;

    public Box2(M value1, K value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public M getValue1() {
        return value1;
    }

    public void setValue1(M value1) {
        this.value1 = value1;
    }

    public K getValue2() {
        return value2;
    }

    public void setValue2(K value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Box2{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
