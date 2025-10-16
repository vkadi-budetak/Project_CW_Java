import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box5 <T extends Comparable<T>> {
    private List<T> value;

    public Box5(List<T> value) {
        this.value = value;
    }

    public List<T> getValue() {
        return value;
    }

    public void setValue(List<T> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box5{" +
                "value=" + value +
                '}';
    }

    public List<T> mySort(){
        List<T> result = new ArrayList<>(value);
        Collections.sort(result);
        return result;
    }
}
