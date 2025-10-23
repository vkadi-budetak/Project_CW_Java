public interface MyListGenerics<T> {
    void add(T element);
    int size();
    T get(int index);
    void print();
    T remove(int index);
}
