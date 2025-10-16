import java.util.List;

public class Box3 <T>{
    T value; // Вася, сотрудник....
    List<T> list; // лист сорудников компании

    public Box3(T value, List<T> list) {
        this.value = value;
        this.list = list;
    }

    // метод проверяет наличия Васи в списке
    public  boolean myContains(){
        return list.contains(value);
    }

    public void print(){
        for(T element: list) System.out.println(element);
    }

    @Override
    public String toString() {
        return "Box3{" +
                "value=" + value +
                ", list=" + list +
                '}';
    }
}
